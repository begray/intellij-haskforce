/* The following code was generated by JFlex 1.4.3 on 4/27/14 5:42 AM */

package com.haskforce;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.haskforce.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/27/14 5:42 AM from the specification file
 * <tt>/Users/pj/src/fsp/work/intellij-haskforce/src/com/haskforce/_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\43\1\4"+
    "\1\42\1\44\1\45\1\46\1\10\1\30\1\31\1\47\1\25\1\33"+
    "\1\26\1\22\1\50\1\12\7\15\2\6\1\57\1\34\1\51\1\52"+
    "\1\53\1\54\1\55\4\21\1\24\1\21\2\7\1\104\2\7\1\103"+
    "\1\7\1\105\1\14\3\7\1\110\3\7\1\107\1\17\2\7\1\35"+
    "\1\11\1\36\1\27\1\106\1\37\1\62\1\20\1\60\1\64\1\23"+
    "\1\66\1\74\1\101\1\71\2\5\1\61\1\75\1\73\1\13\1\100"+
    "\1\102\1\70\1\63\1\65\1\67\1\72\1\76\1\16\1\77\1\5"+
    "\1\40\1\32\1\41\1\56\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\5\1\4\1\11\1\4\1\6\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\14\4\1\6\1\0\1\45\3\0\1\46\1\0"+
    "\1\47\2\0\1\50\1\51\1\4\1\6\1\52\1\53"+
    "\1\54\1\55\1\0\1\56\1\57\1\60\3\4\1\61"+
    "\1\62\5\4\1\63\1\64\6\4\1\6\2\65\1\0"+
    "\2\66\2\5\1\4\1\67\2\70\1\71\1\72\1\73"+
    "\2\4\1\74\16\4\1\6\1\75\1\4\1\76\2\4"+
    "\1\77\1\100\1\101\11\4\1\6\1\102\4\4\1\103"+
    "\3\4\1\104\2\4\1\6\4\4\1\105\1\106\1\107"+
    "\1\4\1\110\1\111\1\4\1\6\1\112\1\4\1\113"+
    "\1\4\1\114\1\4\1\115\1\116\1\117\1\4\1\120";

  private static int [] zzUnpackAction() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\111\0\222\0\333\0\u0124\0\u016d\0\u01b6\0\u01ff"+
    "\0\u0248\0\u0291\0\u02da\0\u0323\0\u036c\0\u03b5\0\111\0\u03fe"+
    "\0\111\0\111\0\111\0\111\0\111\0\111\0\111\0\111"+
    "\0\111\0\u0447\0\111\0\u0490\0\111\0\111\0\111\0\111"+
    "\0\111\0\111\0\u04d9\0\u0522\0\111\0\111\0\111\0\111"+
    "\0\u056b\0\u05b4\0\u05fd\0\u0646\0\u068f\0\u06d8\0\u0721\0\u076a"+
    "\0\u07b3\0\u07fc\0\u0845\0\u088e\0\u08d7\0\u0920\0\333\0\111"+
    "\0\u0969\0\u09b2\0\u09fb\0\111\0\u0a44\0\111\0\u0a8d\0\u0ad6"+
    "\0\u0124\0\111\0\u0b1f\0\u0b68\0\u0bb1\0\111\0\111\0\u0bfa"+
    "\0\u0c43\0\111\0\111\0\111\0\u0c8c\0\u0cd5\0\u0d1e\0\u0124"+
    "\0\u0124\0\u0d67\0\u0db0\0\u0df9\0\u0e42\0\u0e8b\0\u0124\0\u0ed4"+
    "\0\u0f1d\0\u0f66\0\u0faf\0\u0ff8\0\u1041\0\u108a\0\u10d3\0\u111c"+
    "\0\u1165\0\u1165\0\111\0\u09fb\0\u0a8d\0\u0ad6\0\u11ae\0\u01b6"+
    "\0\u11f7\0\111\0\u1240\0\111\0\111\0\u1289\0\u12d2\0\u0124"+
    "\0\u131b\0\u1364\0\u13ad\0\u13f6\0\u143f\0\u1488\0\u14d1\0\u151a"+
    "\0\u1563\0\u15ac\0\u15f5\0\u163e\0\u1687\0\u16d0\0\u1719\0\u0124"+
    "\0\u1762\0\u0124\0\u17ab\0\u17f4\0\u0124\0\u0124\0\u0124\0\u183d"+
    "\0\u1886\0\u18cf\0\u1918\0\u1961\0\u19aa\0\u19f3\0\u1a3c\0\u1a85"+
    "\0\u1ace\0\u0124\0\u1b17\0\u1b60\0\u1ba9\0\u1bf2\0\u1c3b\0\u1c84"+
    "\0\u1ccd\0\u1d16\0\u0124\0\u1d5f\0\u1da8\0\u1df1\0\u1e3a\0\u1e83"+
    "\0\u1ecc\0\u1f15\0\u0124\0\u0124\0\u0124\0\u1f5e\0\u0124\0\u0124"+
    "\0\u1fa7\0\u1ff0\0\u0124\0\u2039\0\u0124\0\u2082\0\u0124\0\u20cb"+
    "\0\u01b6\0\u0124\0\u0124\0\u2114\0\u0124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\7\1\6\1\5\1\7\1\5\1\7"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\5\1\55\1\56\1\57\2\5\1\60\1\5"+
    "\1\61\1\5\1\62\1\63\2\5\1\64\1\65\1\66"+
    "\2\7\1\5\2\7\112\0\3\3\105\0\4\67\1\70"+
    "\104\67\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\31\5\6\0\1\6\3\0\1\6\2\0\1\6\4\0"+
    "\1\71\2\72\71\0\4\7\1\0\10\7\1\0\2\7"+
    "\33\0\31\7\10\73\1\74\1\75\77\73\46\0\1\76"+
    "\50\0\1\6\3\0\1\6\2\77\1\6\2\100\2\0"+
    "\1\71\2\72\71\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\6\5\1\101\22\5\22\0\1\102\73\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\1\5\1\103\27\5"+
    "\5\0\4\7\1\0\2\7\1\104\5\7\1\0\2\7"+
    "\33\0\31\7\26\0\1\105\12\0\1\106\11\0\1\107"+
    "\63\0\1\110\110\0\1\111\110\0\1\112\135\0\1\113"+
    "\114\0\1\114\36\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\1\5\1\115\1\116\26\5\5\0\4\5\1\0"+
    "\10\5\1\0\1\117\1\5\33\0\31\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\3\5\1\120\25\5"+
    "\5\0\4\5\1\0\1\5\1\121\6\5\1\0\1\122"+
    "\1\5\33\0\2\5\1\123\26\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\17\5\1\124\1\5\1\125"+
    "\7\5\5\0\4\5\1\0\1\5\1\126\6\5\1\0"+
    "\2\5\33\0\31\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\6\5\1\127\4\5\1\130\1\5\1\131"+
    "\13\5\5\0\4\5\1\0\10\5\1\0\1\132\1\5"+
    "\33\0\31\5\5\0\4\5\1\0\1\5\1\133\6\5"+
    "\1\0\2\5\33\0\31\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\21\5\1\134\7\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\11\5\1\135\17\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\33\0\7\5"+
    "\1\136\21\5\5\0\4\7\1\0\10\7\1\0\2\7"+
    "\33\0\24\7\1\137\4\7\6\0\1\140\3\0\1\140"+
    "\2\0\1\140\101\0\1\141\3\0\1\141\2\0\1\141"+
    "\7\0\2\142\72\0\1\143\100\0\2\73\1\0\5\73"+
    "\1\144\100\73\12\0\1\145\2\0\1\145\101\0\1\146"+
    "\3\0\1\146\2\0\1\146\2\0\2\146\1\0\2\146"+
    "\33\0\1\146\1\0\1\146\1\0\1\146\1\0\1\146"+
    "\27\0\4\5\1\0\10\5\1\0\2\5\33\0\3\5"+
    "\1\147\25\5\5\0\4\7\1\0\10\7\1\0\2\7"+
    "\33\0\23\7\1\150\5\7\1\151\2\152\24\151\1\153"+
    "\61\151\42\0\1\154\107\0\1\155\54\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\2\5\1\156\26\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\3\5\1\157"+
    "\25\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\5\5\1\160\23\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\6\5\1\161\1\5\1\162\20\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\5\5\1\163"+
    "\23\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\20\5\1\164\10\5\5\0\4\5\1\0\10\5\1\0"+
    "\1\165\1\5\33\0\31\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\10\5\1\166\20\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\3\5\1\167\2\5"+
    "\1\170\22\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\20\5\1\171\10\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\16\5\1\172\12\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\4\5\1\173\24\5"+
    "\5\0\4\5\1\0\10\5\1\0\1\174\1\5\33\0"+
    "\31\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\4\5\1\175\24\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\2\5\1\176\26\5\5\0\4\7\1\0"+
    "\10\7\1\0\2\7\33\0\25\7\1\177\3\7\6\0"+
    "\1\140\3\0\1\140\2\0\1\140\5\0\2\72\72\0"+
    "\1\141\3\0\1\141\2\0\1\141\100\0\4\5\1\0"+
    "\10\5\1\0\1\200\1\5\33\0\31\5\1\151\2\0"+
    "\106\151\1\153\2\0\106\153\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\3\5\1\201\25\5\5\0\4\5"+
    "\1\0\10\5\1\0\1\202\1\5\33\0\31\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\2\5\1\203"+
    "\26\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\11\5\1\204\17\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\2\5\1\205\26\5\5\0\4\5\1\0"+
    "\10\5\1\0\1\206\1\5\33\0\31\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\13\5\1\207\15\5"+
    "\5\0\4\5\1\0\10\5\1\0\1\210\1\5\33\0"+
    "\31\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\5\5\1\211\23\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\11\5\1\212\17\5\5\0\4\5\1\0"+
    "\1\5\1\213\6\5\1\0\2\5\33\0\31\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\5\5\1\214"+
    "\23\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\7\5\1\215\21\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\10\5\1\216\20\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\11\5\1\217\17\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\1\5\1\220"+
    "\27\5\5\0\4\7\1\0\10\7\1\0\1\7\1\221"+
    "\33\0\31\7\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\3\5\1\222\25\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\7\5\1\223\21\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\12\5\1\224\16\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\33\0\11\5"+
    "\1\225\17\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\2\5\1\226\26\5\5\0\4\5\1\0\4\5"+
    "\1\227\3\5\1\0\2\5\33\0\31\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\10\5\1\230\20\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\33\0\17\5"+
    "\1\231\11\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\1\5\1\232\27\5\5\0\4\5\1\0\10\5"+
    "\1\0\1\233\1\5\33\0\31\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\13\5\1\234\15\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\11\5\1\235"+
    "\17\5\5\0\4\7\1\0\10\7\1\0\2\7\33\0"+
    "\26\7\1\236\2\7\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\1\5\1\237\27\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\11\5\1\240\17\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\14\5\1\241"+
    "\14\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\13\5\1\242\15\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\33\0\1\5\1\243\6\5\1\244\20\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\33\0\5\5\1\245"+
    "\23\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\20\5\1\246\10\5\5\0\4\5\1\0\10\5\1\0"+
    "\1\247\1\5\33\0\31\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\14\5\1\250\14\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\6\5\1\251\22\5"+
    "\5\0\4\7\1\0\10\7\1\0\2\7\33\0\27\7"+
    "\1\252\1\7\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\5\5\1\253\23\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\33\0\13\5\1\254\15\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\33\0\13\5\1\255\15\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\33\0\1\256"+
    "\30\5\5\0\4\5\1\0\10\5\1\0\1\257\1\5"+
    "\33\0\31\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\33\0\11\5\1\260\17\5\5\0\4\7\1\0\10\7"+
    "\1\0\2\7\33\0\30\7\1\261\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\33\0\14\5\1\262\14\5\5\0"+
    "\4\5\1\0\10\5\1\0\1\263\1\5\33\0\31\5"+
    "\5\0\4\5\1\0\10\5\1\0\1\264\1\5\33\0"+
    "\31\5\5\0\4\5\1\0\10\5\1\0\2\5\33\0"+
    "\4\5\1\265\24\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8541];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\1\11\1\1\11\11\1\1\1\11"+
    "\1\1\6\11\2\1\4\11\16\1\1\0\1\11\3\0"+
    "\1\11\1\0\1\11\2\0\1\1\1\11\3\1\2\11"+
    "\1\1\1\0\3\11\25\1\1\0\1\11\6\1\1\11"+
    "\1\1\2\11\110\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[181];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }


  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return BACKSLASH;
          }
        case 81: break;
        case 80: 
          { return QUALIFIED;
          }
        case 82: break;
        case 60: 
          { return LET;
          }
        case 83: break;
        case 13: 
          { return LPAREN;
          }
        case 84: break;
        case 33: 
          { return QUESTION;
          }
        case 85: break;
        case 31: 
          { return EQUALS;
          }
        case 86: break;
        case 19: 
          { return RBRACKET;
          }
        case 87: break;
        case 26: 
          { return PERCENT;
          }
        case 88: break;
        case 36: 
          { return COLON;
          }
        case 89: break;
        case 77: 
          { return LINE_WS;
          }
        case 90: break;
        case 46: 
          { return LEFTARROW;
          }
        case 91: break;
        case 30: 
          { return LESSTHAN;
          }
        case 92: break;
        case 66: 
          { return CLASSTOKEN;
          }
        case 93: break;
        case 58: 
          { return OPENPRAGMA;
          }
        case 94: break;
        case 59: 
          { return CLOSEPRAGMA;
          }
        case 95: break;
        case 79: 
          { return INSTANCE;
          }
        case 96: break;
        case 5: 
          { return INTEGERTOKEN;
          }
        case 97: break;
        case 41: 
          { return DOUBLEPERIOD;
          }
        case 98: break;
        case 12: 
          { return CARET;
          }
        case 99: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 100: break;
        case 43: 
          { return CLOSECOM;
          }
        case 101: break;
        case 18: 
          { return LBRACKET;
          }
        case 102: break;
        case 7: 
          { return SINGLEQUOTE;
          }
        case 103: break;
        case 78: 
          { return DERIVING;
          }
        case 104: break;
        case 17: 
          { return SEMICOLON;
          }
        case 105: break;
        case 16: 
          { return COMMA;
          }
        case 106: break;
        case 63: 
          { return DATA;
          }
        case 107: break;
        case 38: 
          { return THQUOTE;
          }
        case 108: break;
        case 53: 
          { return FLOATTOKEN;
          }
        case 109: break;
        case 72: 
          { return MODULE;
          }
        case 110: break;
        case 3: 
          { return DOUBLEQUOTE;
          }
        case 111: break;
        case 10: 
          { return PLUS;
          }
        case 112: break;
        case 4: 
          { return VARIDREGEXP;
          }
        case 113: break;
        case 64: 
          { return TYPE;
          }
        case 114: break;
        case 9: 
          { return PERIOD;
          }
        case 115: break;
        case 32: 
          { return GREATERTHAN;
          }
        case 116: break;
        case 23: 
          { return HASH;
          }
        case 117: break;
        case 28: 
          { return ASTERISK;
          }
        case 118: break;
        case 74: 
          { return DEFAULT;
          }
        case 119: break;
        case 50: 
          { return DO;
          }
        case 120: break;
        case 52: 
          { return IN;
          }
        case 121: break;
        case 25: 
          { return DOLLAR;
          }
        case 122: break;
        case 56: 
          { return COMMENT;
          }
        case 123: break;
        case 76: 
          { return NEWTYPE;
          }
        case 124: break;
        case 75: 
          { return FOREIGN;
          }
        case 125: break;
        case 22: 
          { return RBRACE;
          }
        case 126: break;
        case 27: 
          { return AMPERSAND;
          }
        case 127: break;
        case 45: 
          { return OPENCOM;
          }
        case 128: break;
        case 20: 
          { return BACKTICK;
          }
        case 129: break;
        case 42: 
          { return DASHES;
          }
        case 130: break;
        case 73: 
          { return HIDING;
          }
        case 131: break;
        case 40: 
          { return OF;
          }
        case 132: break;
        case 67: 
          { return INFIX;
          }
        case 133: break;
        case 34: 
          { return AMPERSAT;
          }
        case 134: break;
        case 21: 
          { return LBRACE;
          }
        case 135: break;
        case 35: 
          { return TILDE;
          }
        case 136: break;
        case 57: 
          { return HADDOCK;
          }
        case 137: break;
        case 15: 
          { return PIPE;
          }
        case 138: break;
        case 47: 
          { return DOUBLEARROW;
          }
        case 139: break;
        case 29: 
          { return SLASH;
          }
        case 140: break;
        case 68: 
          { return WHERE;
          }
        case 141: break;
        case 69: 
          { return INFIXL;
          }
        case 142: break;
        case 71: 
          { return IMPORT;
          }
        case 143: break;
        case 37: 
          { return STRINGTOKEN;
          }
        case 144: break;
        case 24: 
          { return EXLAMATION;
          }
        case 145: break;
        case 70: 
          { return INFIXR;
          }
        case 146: break;
        case 61: 
          { return ELSE;
          }
        case 147: break;
        case 51: 
          { return IF;
          }
        case 148: break;
        case 55: 
          { return EOL;
          }
        case 149: break;
        case 65: 
          { return THEN;
          }
        case 150: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 151: break;
        case 44: 
          { return RIGHTARROW;
          }
        case 152: break;
        case 11: 
          { return MINUS;
          }
        case 153: break;
        case 54: 
          { return CHARTOKEN;
          }
        case 154: break;
        case 62: 
          { return CASE;
          }
        case 155: break;
        case 14: 
          { return RPAREN;
          }
        case 156: break;
        case 48: 
          { return DOUBLECOLON;
          }
        case 157: break;
        case 49: 
          { return AS;
          }
        case 158: break;
        case 39: 
          { return NULLCHARACTER;
          }
        case 159: break;
        case 6: 
          { return CONID;
          }
        case 160: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
