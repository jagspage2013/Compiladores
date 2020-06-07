/* The following code was generated by JFlex 1.6.0 */

import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>lexico.flex</tt>
 */
public class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENTARIO = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\51\1\2\1\53\1\53\1\50\22\0\1\45\1\60\1\1"+
    "\2\0\1\55\1\62\1\3\1\34\1\43\1\54\1\41\1\63\1\35"+
    "\1\33\1\52\12\47\1\40\1\44\1\56\1\57\1\56\2\0\4\4"+
    "\1\36\15\4\1\30\1\37\6\4\1\63\1\0\1\63\1\0\1\46"+
    "\1\0\1\13\1\21\1\14\1\17\1\22\1\10\1\4\1\15\1\5"+
    "\1\4\1\26\1\11\1\32\1\6\1\12\1\27\1\4\1\16\1\25"+
    "\1\7\1\20\1\23\1\24\1\42\1\31\1\4\1\63\1\61\1\63"+
    "\7\0\1\53\u1f93\0\1\63\16\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\2\0\1\2\1\0\14\3\1\0\3\4\1\5"+
    "\1\6\1\2\2\4\1\7\1\0\1\10\2\0\2\5"+
    "\3\0\2\3\1\11\4\3\1\12\12\3\1\1\1\13"+
    "\1\14\1\15\1\16\1\7\1\10\1\17\1\20\1\21"+
    "\1\22\1\3\1\23\16\3\1\24\1\25\3\3\1\26"+
    "\1\27\2\3\1\30\3\3\1\31\2\3\1\32\1\33"+
    "\2\3\1\34\1\3\1\35\1\3\1\36\1\37\1\3"+
    "\1\40\57\0\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[157];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\234\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0514\0\u0514\0\u0548\0\u057c\0\u03a8"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u0104\0\u06e8"+
    "\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u0374\0\u03a8"+
    "\0\u03a8\0\u09f4\0\u03a8\0\u03a8\0\u03a8\0\u03a8\0\u03a8\0\u03a8"+
    "\0\u0104\0\u0a28\0\u0104\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c"+
    "\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc"+
    "\0\u0d00\0\u0104\0\u0104\0\u0d34\0\u0d68\0\u0d9c\0\u0104\0\u0104"+
    "\0\u0dd0\0\u0e04\0\u0104\0\u0e38\0\u0e6c\0\u0ea0\0\u0104\0\u0ed4"+
    "\0\u0f08\0\u0104\0\u0104\0\u0f3c\0\u0f70\0\u0104\0\u0fa4\0\u0104"+
    "\0\u0fd8\0\u0104\0\u0104\0\u100c\0\u0104\0\u1040\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588"+
    "\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728"+
    "\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8"+
    "\0\u18fc\0\u1930\0\u1964\0\u1998\0\u03a8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[157];
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
    "\1\0\1\3\1\4\1\5\1\6\1\7\2\6\1\10"+
    "\3\6\1\11\2\6\1\12\1\6\1\13\1\14\1\15"+
    "\1\16\1\17\1\6\1\20\1\21\2\6\1\22\1\23"+
    "\1\24\2\6\1\23\1\25\1\6\2\23\1\26\1\6"+
    "\1\27\1\30\1\26\1\31\1\0\2\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\23\2\40\1\26\42\40\1\26"+
    "\2\40\2\26\2\40\1\41\7\40\1\42\2\0\61\42"+
    "\2\0\1\26\42\0\1\26\2\0\2\26\16\0\27\43"+
    "\3\0\2\43\2\0\1\43\14\0\1\44\10\0\27\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\2\6\1\46\1\6\1\47\22\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\5\6\1\50\1\51"+
    "\20\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\7\6\1\52\1\6\1\53\15\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\6\6\1\54"+
    "\7\6\1\55\10\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\20\0\12\6\1\56\14\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\5\6\1\57"+
    "\21\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\6\6\1\60\20\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\11\6\1\61\15\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\3\6"+
    "\1\62\4\6\1\63\7\6\1\64\6\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\12\6\1\65"+
    "\14\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\25\6\1\66\1\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\63\0\1\67\135\0\1\70\21\0"+
    "\1\71\45\0\1\70\15\0\1\71\37\0\1\22\13\0"+
    "\1\27\16\0\1\4\42\0\1\26\2\0\2\26\64\0"+
    "\1\72\1\0\1\73\2\0\1\71\63\0\1\71\63\0"+
    "\1\74\65\0\1\75\64\0\1\75\53\0\1\76\11\0"+
    "\1\42\1\77\1\0\61\42\3\0\1\100\63\0\1\71"+
    "\127\0\1\45\20\0\3\6\1\101\23\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\6\6\1\102"+
    "\20\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\12\6\1\103\14\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\21\6\1\104\5\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\7\6"+
    "\1\105\17\6\3\0\2\6\2\0\1\6\3\0\1\6"+
    "\1\45\20\0\14\6\1\106\12\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\4\6\1\107\22\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\16\6\1\110\10\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\20\0\21\6\1\111\5\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\1\6\1\112"+
    "\25\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\1\6\1\113\25\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\12\6\1\114\14\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\7\6"+
    "\1\115\17\6\3\0\2\6\2\0\1\6\3\0\1\6"+
    "\1\45\20\0\1\6\1\116\25\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\1\6\1\117\25\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\21\6\1\120\5\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\14\0\2\72\1\0\45\72\1\0\2\72"+
    "\1\0\10\72\4\0\7\6\1\121\17\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\16\6\1\122"+
    "\10\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\12\6\1\123\14\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\15\6\1\124\11\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\7\6"+
    "\1\125\17\6\3\0\2\6\2\0\1\6\3\0\1\6"+
    "\1\45\20\0\7\6\1\126\17\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\16\6\1\127\10\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\13\6\1\130\13\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\20\0\5\6\1\131\21\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\14\6\1\132"+
    "\12\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\2\6\1\133\24\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\3\6\1\134\23\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\2\6"+
    "\1\135\24\6\3\0\2\6\2\0\1\6\3\0\1\6"+
    "\1\45\20\0\3\6\1\136\23\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\3\6\1\137\23\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\5\6\1\140\21\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\20\0\14\6\1\141\12\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\22\6\1\142"+
    "\4\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\16\6\1\143\10\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\10\6\1\144\16\6\3\0"+
    "\2\6\2\0\1\6\3\0\1\6\1\45\20\0\10\6"+
    "\1\145\16\6\3\0\2\6\2\0\1\6\3\0\1\6"+
    "\1\45\20\0\3\6\1\146\23\6\3\0\2\6\2\0"+
    "\1\6\3\0\1\6\1\45\20\0\16\6\1\147\10\6"+
    "\3\0\2\6\2\0\1\6\3\0\1\6\1\45\20\0"+
    "\16\6\1\150\10\6\3\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\20\0\5\6\1\151\21\6\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\3\6\1\152"+
    "\23\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\11\6\1\153\15\6\3\0\2\6\2\0\1\6"+
    "\3\0\1\6\1\45\20\0\26\6\1\154\3\0\2\6"+
    "\2\0\1\6\3\0\1\6\1\45\20\0\3\6\1\155"+
    "\23\6\3\0\2\6\2\0\1\6\3\0\1\6\1\45"+
    "\20\0\27\6\1\156\2\0\2\6\2\0\1\6\3\0"+
    "\1\6\1\45\26\0\1\157\71\0\1\160\52\0\1\161"+
    "\107\0\1\162\57\0\1\163\52\0\1\164\52\0\1\165"+
    "\64\0\1\166\64\0\1\167\65\0\1\170\60\0\1\171"+
    "\111\0\1\172\64\0\1\173\63\0\1\174\64\0\1\175"+
    "\36\0\1\176\111\0\1\177\36\0\1\200\77\0\1\201"+
    "\57\0\1\202\47\0\1\203\66\0\1\204\74\0\1\205"+
    "\46\0\1\206\75\0\1\207\56\0\1\210\73\0\1\211"+
    "\66\0\1\212\76\0\1\213\64\0\1\214\53\0\1\215"+
    "\63\0\1\216\41\0\1\217\76\0\1\220\103\0\1\221"+
    "\30\0\1\222\110\0\1\223\72\0\1\224\63\0\1\225"+
    "\64\0\1\226\64\0\1\227\34\0\1\230\67\0\1\231"+
    "\50\0\1\232\74\0\1\233\61\0\1\234\53\0\1\235"+
    "\55\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6604];
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
    "\1\1\2\0\1\1\1\0\14\1\1\0\1\11\10\1"+
    "\1\0\1\1\2\0\1\11\1\1\3\0\23\1\2\11"+
    "\1\1\6\11\55\1\57\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[157];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	boolean coment = false;	
	
        /* Metodos que ayudan a procesar el retorno de los tokens al
	   metodo next_token*/

	/*private Symbol tokenNuevo(int type, Object lex){
		int linea = yyline + 1;
		System.out.println("token : "+ lex + "," + type);
                System.out.println("--El Token leido es :"+yytext()); return new Symbol(type,yyline, yycolumn, lex);
	}
	
	private Symbol tokenNuevo(int type){
                System.out.println("--El Token leido es :"+yytext()); return tokenNuevpo(type, yytext());
	}*/

	private Parser yyparser;
	
	public Yylex(Reader r, Parser yyparser){
		this(r);
		this.yyparser = yyparser;
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
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
        case 1: 
          { System.out.println("--El Token leido es :"+yytext()); yyparser.yylval = new ParserVal(Double.parseDouble(yytext())); System.out.println("--El Token leido es :"+yytext()); return Parser.REAL;
          }
        case 34: break;
        case 2: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.NL;
          }
        case 35: break;
        case 3: 
          { System.out.println("--El Token leido es :"+yytext());yyparser.yyval = new ParserVal(yytext()); return Parser.ID;
          }
        case 36: break;
        case 4: 
          { System.out.println("--El Token leido es :"+yytext()); return (int) yycharat(0);
          }
        case 37: break;
        case 5: 
          { 
          }
        case 38: break;
        case 6: 
          { yyparser.yyval = new ParserVal(Integer.parseInt(yytext())); System.out.println("--El Token leido es :"+yytext()); return Parser.ENTERO;
          }
        case 39: break;
        case 7: 
          { System.out.println("--El Token leido es :"+yytext()); return 20;
          }
        case 40: break;
        case 8: 
          { System.out.println("--El Token leido es :"+yytext()); return 21;
          }
        case 41: break;
        case 9: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.IF;
          }
        case 42: break;
        case 10: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.DO;
          }
        case 43: break;
        case 11: 
          { System.out.println("--El Token leido es :"+yytext()); return 23;
          }
        case 44: break;
        case 12: 
          { System.out.println("--El Token leido es :"+yytext()); return 22;
          }
        case 45: break;
        case 13: 
          { System.out.println("Encontro un comentario");
          }
        case 46: break;
        case 14: 
          { yybegin(COMENTARIO); coment= true;
          }
        case 47: break;
        case 15: 
          { System.out.println("Encontro un comentario"); yybegin(YYINITIAL); coment=false;
          }
        case 48: break;
        case 16: 
          { System.out.println("--El Token leido es :"+yytext());  yyparser.yyval = new ParserVal(yytext());return Parser.CADENA;
          }
        case 49: break;
        case 17: 
          { System.out.println("--El Token leido es :"+yytext());  yyparser.yyval = new ParserVal(yytext()); return Parser.CARACTER;
          }
        case 50: break;
        case 18: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.INT;
          }
        case 51: break;
        case 19: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.FOR;
          }
        case 52: break;
        case 20: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.CASE;
          }
        case 53: break;
        case 21: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.CHAR;
          }
        case 54: break;
        case 22: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.ELSE;
          }
        case 55: break;
        case 23: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.VOID;
          }
        case 56: break;
        case 24: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.SCAN;
          }
        case 57: break;
        case 25: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.FLOAT;
          }
        case 58: break;
        case 26: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.BREAK;
          }
        case 59: break;
        case 27: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.WHILE;
          }
        case 60: break;
        case 28: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.PRINT;
          }
        case 61: break;
        case 29: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.DOUBLE;
          }
        case 62: break;
        case 30: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.STRUCT;
          }
        case 63: break;
        case 31: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.SWITCH;
          }
        case 64: break;
        case 32: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.DEFAULT;
          }
        case 65: break;
        case 33: 
          { System.out.println("--El Token leido es :"+yytext()); return Parser.RETURN;
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 
	// Al llegar al fin de archivo validamos que no se haya quedado un comentario
	// de varias lineas sin cerrar
	if(coment){
		System.out.println("ERROR LEXICO: no se ha cerrado un comentario");
		coment = false;
	}

	/*else{  
         System.out.println("--El Token leido es :"+yytext()); return YYEOF;
		System.out.println("--El Token leido es :"+yytext()); return tokenNuevpo(sym.EOF);
	}*/
	

 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}