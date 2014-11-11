package com.haskforce.utils;

import com.haskforce.HaskellFileType;
import com.haskforce.psi.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * General util class. Provides methods for finding named nodes in the Psi tree.
 */
public class HaskellUtil {
    /**
     * Finds name definition across all Haskell files in the project. All
     * definitions are found when name is null.
     */
    @NotNull
    public static List<PsiNamedElement> findDefinitionNode(@NotNull Project proj, @Nullable String name, @Nullable PsiNamedElement e) {
        // Guess where the name could be defined by lookup up potential modules.
        final List<String> potentialModules =
                e == null ? Collections.EMPTY_LIST
                          : getPotentialDefinitionModuleNames(e, HaskellPsiUtil.parseImports(e.getContainingFile()));
        List<PsiNamedElement> result = ContainerUtil.newArrayList();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME,
                        HaskellFileType.INSTANCE, GlobalSearchScope.allScope(proj));
        final String qPrefix = e == null ? null : getQualifiedPrefix(e);
        final PsiFile psiFile = e == null ? null : e.getContainingFile().getOriginalFile();
        for (VirtualFile vf : virtualFiles) {
            HaskellFile f = (HaskellFile) PsiManager.getInstance(proj).findFile(vf);
            final boolean returnAllReferences = name == null;
            final boolean inLocalModule = f != null && qPrefix == null && f.equals(psiFile);
            final boolean inImportedModule = f != null && potentialModules.contains(HaskellPsiUtil.parseModuleName(f));
            if (returnAllReferences || inLocalModule || inImportedModule) {
                findDefinitionNode(f, name, e, result);
            }
        }
        return result;
    }

    /**
     * Finds a name definition inside a Haskell file. All definitions are found when name
     * is null.
     */
    public static void findDefinitionNode(@Nullable HaskellFile file, @Nullable String name, @Nullable PsiNamedElement e, @NotNull List<PsiNamedElement> result) {
        if (file == null) return;
        // We only want to look for classes that match the element we are resolving (e.g. varid, conid, etc.)
        final Class<? extends PsiNamedElement> elementClass;
        if (e instanceof HaskellVarid) {
            elementClass = HaskellVarid.class;
        } else if (e instanceof HaskellConid) {
            elementClass = HaskellConid.class;
        } else {
            elementClass = PsiNamedElement.class;
        }
        Collection<PsiNamedElement> namedElements = PsiTreeUtil.findChildrenOfType(file, elementClass);
        for (PsiNamedElement namedElement : namedElements) {
            if ((name == null || name.equals(namedElement.getName())) && definitionNode(namedElement)) {
                result.add(namedElement);
            }
        }
    }

    /**
     * Finds a name definition inside a Haskell file. All definitions are found when name
     * is null.
     */
    @NotNull
    public static List<PsiNamedElement> findDefinitionNodes(@Nullable HaskellFile haskellFile, @Nullable String name) {
        List<PsiNamedElement> ret = ContainerUtil.newArrayList();
        findDefinitionNode(haskellFile, name, null, ret);
        return ret;
    }

    /**
     * Finds name definition across all Haskell files in the project. All
     * definitions are found when name is null.
     */
    @NotNull
    public static List<PsiNamedElement> findDefinitionNodes(@NotNull Project project) {
        return findDefinitionNode(project, null, null);
    }

    /**
     * Tells whether a named node is a definition node based on its context.
     *
     * Precondition: Element is in a Haskell file.
     */
    public static boolean definitionNode(@NotNull PsiNamedElement e) {
        if (e instanceof HaskellVarid) {
            // Element is in the vars section of a type signature.
            return HaskellPsiUtil.isType(e.getParent(), HaskellTypes.VARS);
        }
        if (e instanceof HaskellConid) {
            // Element is defined as a constructor.
            final HaskellConstr constr = PsiTreeUtil.getParentOfType(e, HaskellConstr.class);
            final HaskellCon con;
            if (constr != null) {
                con = constr.getCon();
            } else {
                final HaskellNewconstr newconstr = PsiTreeUtil.getParentOfType(e, HaskellNewconstr.class);
                con = newconstr == null ? null : newconstr.getCon();
            }
            final HaskellConid conid = con == null ? null : con.getConid();
            return e.equals(conid);
        }
        return false;
    }

    @Nullable
    public static String getQualifiedPrefix(@NotNull PsiElement e) {
        final PsiElement q = PsiTreeUtil.getParentOfType(e, HaskellQcon.class, HaskellQvar.class);
        if (q == null) { return null; }
        final String qText = q.getText();
        final int lastDotPos = qText.lastIndexOf('.');
        if (lastDotPos == -1) { return null; }
        return qText.substring(0, lastDotPos);
    }

    @NotNull
    public static List<String> getPotentialDefinitionModuleNames(@NotNull PsiElement e, @NotNull List<HaskellPsiUtil.Import> imports) {
        final String qPrefix = getQualifiedPrefix(e);
        if (qPrefix == null) { return HaskellPsiUtil.getImportModuleNames(imports); }
        List<String> result = new ArrayList<String>(2);
        for (HaskellPsiUtil.Import anImport : imports) {
            if (qPrefix.equals(anImport.module) || qPrefix.equals(anImport.alias)) {
                result.add(anImport.module);
            }
        }
        return result;
    }
}