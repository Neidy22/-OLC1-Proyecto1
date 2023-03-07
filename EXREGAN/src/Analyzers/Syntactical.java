
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analyzers;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Syntactical extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Syntactical() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Syntactical(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntactical(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\053\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\004\000\002\003\004\000\002\003\004" +
    "\000\002\003\004\000\002\003\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\004\000\002\006\010\000\002" +
    "\011\005\000\002\011\005\000\002\011\005\000\002\011" +
    "\003\000\002\011\003\000\002\007\006\000\002\014\005" +
    "\000\002\014\005\000\002\014\005\000\002\014\005\000" +
    "\002\014\004\000\002\014\004\000\002\014\004\000\002" +
    "\014\004\000\002\014\004\000\002\014\004\000\002\015" +
    "\005\000\002\015\003\000\002\005\006\000\002\010\004" +
    "\000\002\010\004\000\002\010\004\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\012\005\000\002" +
    "\012\005\000\002\012\003\000\002\012\003\000\002\013" +
    "\005\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\020\004\001\002\000\024\003\022\004" +
    "\016\005\025\015\015\021\007\025\010\026\023\027\012" +
    "\031\014\001\002\000\004\002\006\001\002\000\004\002" +
    "\001\001\002\000\004\002\ufffa\001\002\000\016\021\uffde" +
    "\023\uffde\024\uffde\025\010\026\023\027\012\001\002\000" +
    "\004\002\000\001\002\000\016\021\uffdd\023\uffdd\024\uffdd" +
    "\025\010\026\023\027\012\001\002\000\024\003\022\004" +
    "\016\005\025\015\015\021\007\025\010\026\023\027\012" +
    "\031\014\001\002\000\004\023\067\001\002\000\004\015" +
    "\066\001\002\000\024\003\022\004\016\005\025\015\015" +
    "\021\007\025\010\026\023\027\012\031\014\001\002\000" +
    "\024\003\ufff9\004\ufff9\005\ufff9\015\ufff9\021\ufff9\025\ufff9" +
    "\026\ufff9\027\ufff9\031\ufff9\001\002\000\024\003\022\004" +
    "\016\005\025\015\015\021\007\025\010\026\023\027\012" +
    "\031\014\001\002\000\006\023\031\024\032\001\002\000" +
    "\024\003\022\004\016\005\025\015\015\021\007\025\010" +
    "\026\023\027\012\031\014\001\002\000\016\021\uffdf\023" +
    "\uffdf\024\uffdf\025\010\026\023\027\012\001\002\000\024" +
    "\003\ufff8\004\ufff8\005\ufff8\015\ufff8\021\ufff8\025\ufff8\026" +
    "\ufff8\027\ufff8\031\ufff8\001\002\000\024\003\022\004\016" +
    "\005\025\015\015\021\007\025\010\026\023\027\012\031" +
    "\014\001\002\000\004\002\ufffe\001\002\000\010\021\uffe2" +
    "\023\uffe2\024\uffe2\001\002\000\004\002\ufffb\001\002\000" +
    "\004\006\062\001\002\000\014\010\034\011\035\012\040" +
    "\013\036\014\037\001\002\000\004\022\061\001\002\000" +
    "\006\006\042\020\043\001\002\000\006\006\042\020\043" +
    "\001\002\000\020\006\042\010\034\011\035\012\040\013" +
    "\036\014\037\020\043\001\002\000\020\006\042\010\034" +
    "\011\035\012\040\013\036\014\037\020\043\001\002\000" +
    "\020\006\042\010\034\011\035\012\040\013\036\014\037" +
    "\020\043\001\002\000\004\022\uffeb\001\002\000\022\006" +
    "\uffe4\010\uffe4\011\uffe4\012\uffe4\013\uffe4\014\uffe4\020\uffe4" +
    "\022\uffe4\001\002\000\010\025\010\026\023\027\012\001" +
    "\002\000\004\022\uffea\001\002\000\004\021\046\001\002" +
    "\000\022\006\uffe5\010\uffe5\011\uffe5\012\uffe5\013\uffe5\014" +
    "\uffe5\020\uffe5\022\uffe5\001\002\000\004\022\uffe7\001\002" +
    "\000\004\022\uffe6\001\002\000\004\022\uffe9\001\002\000" +
    "\004\022\uffe8\001\002\000\020\006\042\010\034\011\035" +
    "\012\040\013\036\014\037\020\043\001\002\000\004\022" +
    "\uffed\001\002\000\004\022\uffec\001\002\000\020\006\042" +
    "\010\034\011\035\012\040\013\036\014\037\020\043\001" +
    "\002\000\004\022\uffef\001\002\000\004\022\uffee\001\002" +
    "\000\024\003\ufff0\004\ufff0\005\ufff0\015\ufff0\021\ufff0\025" +
    "\ufff0\026\ufff0\027\ufff0\031\ufff0\001\002\000\004\022\063" +
    "\001\002\000\024\003\uffe3\004\uffe3\005\uffe3\015\uffe3\021" +
    "\uffe3\025\uffe3\026\uffe3\027\uffe3\031\uffe3\001\002\000\004" +
    "\002\ufffc\001\002\000\004\002\uffff\001\002\000\024\003" +
    "\ufff7\004\ufff7\005\ufff7\015\ufff7\021\ufff7\025\ufff7\026\ufff7" +
    "\027\ufff7\031\ufff7\001\002\000\010\025\010\026\023\027" +
    "\012\001\002\000\004\024\071\001\002\000\010\025\077" +
    "\026\072\027\075\001\002\000\010\016\106\017\116\022" +
    "\uffd9\001\002\000\004\022\115\001\002\000\004\022\ufff2" +
    "\001\002\000\010\016\110\017\111\022\uffd7\001\002\000" +
    "\004\022\ufff1\001\002\000\010\016\100\017\101\022\uffda" +
    "\001\002\000\006\025\105\026\103\001\002\000\004\025" +
    "\102\001\002\000\004\022\ufff5\001\002\000\006\016\106" +
    "\022\uffd9\001\002\000\004\022\uffdc\001\002\000\006\016" +
    "\100\022\uffda\001\002\000\006\025\105\026\103\001\002" +
    "\000\004\022\uffdb\001\002\000\004\027\113\001\002\000" +
    "\004\027\112\001\002\000\004\022\ufff3\001\002\000\006" +
    "\016\110\022\uffd7\001\002\000\004\022\uffd8\001\002\000" +
    "\024\003\ufff6\004\ufff6\005\ufff6\015\ufff6\021\ufff6\025\ufff6" +
    "\026\ufff6\027\ufff6\031\ufff6\001\002\000\004\026\117\001" +
    "\002\000\004\022\ufff4\001\002\000\004\002\ufffd\001\002" +
    "\000\010\021\uffe0\023\uffe0\024\uffe0\001\002\000\010\021" +
    "\uffe1\023\uffe1\024\uffe1\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\002\004\001\001\000\016\003\010\004" +
    "\012\005\017\006\016\007\023\010\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\121\001\001\000\002\001\001\000\004\010\120\001\001" +
    "\000\016\003\117\004\012\005\017\006\016\007\023\010" +
    "\020\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\003\064\004\012\005\017\006\016\007\023\010\020\001" +
    "\001\000\002\001\001\000\016\003\063\004\012\005\017" +
    "\006\016\007\023\010\020\001\001\000\002\001\001\000" +
    "\016\003\027\004\012\005\017\006\016\007\023\010\020" +
    "\001\001\000\004\010\026\001\001\000\002\001\001\000" +
    "\016\003\025\004\012\005\017\006\016\007\023\010\020" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\014\032\001\001\000\002" +
    "\001\001\000\004\015\055\001\001\000\004\015\052\001" +
    "\001\000\006\014\050\015\051\001\001\000\006\014\046" +
    "\015\047\001\001\000\006\014\040\015\043\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\044\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\014\053\015\054\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\014\056\015\057\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\067\001\001\000" +
    "\002\001\001\000\010\011\072\012\073\013\075\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\103\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\106\001\001\000\002\001\001\000\004\013\113\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntactical$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntactical$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntactical$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);
        
        //TError tmp = new TError("Sintactico",lexema,"Caracter no esperado",fila,columna);
        //Proyecto1.errores.add(tmp);
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperación
    public  void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);
        
        //TError tmp = new TError("Sintactico",lexema,"Caracter no esperado",fila,columna);
        //Proyecto1.errores.add(tmp);
        
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Syntactical$actions {
  private final Syntactical parser;

  /** Constructor */
  CUP$Syntactical$actions(Syntactical parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Syntactical$do_action_part00000000(
    int                        CUP$Syntactical$act_num,
    java_cup.runtime.lr_parser CUP$Syntactical$parser,
    java.util.Stack            CUP$Syntactical$stack,
    int                        CUP$Syntactical$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntactical$result;

      /* select the action based on the action number */
      switch (CUP$Syntactical$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)).value;
		RESULT = start_val;
              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntactical$parser.done_parsing();
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= leftCurlyB PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAMBODY ::= comment PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PROGRAMBODY ::= multicomment PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PROGRAMBODY ::= DEFINITION PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // PROGRAMBODY ::= EVALUATION PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // PROGRAMBODY ::= error PROGRAMBODY 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // PROGRAMBODY ::= rightCurlyB 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PROGRAMBODY",1, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DEFINITION ::= CONJUNTO 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("DEFINITION",2, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DEFINITION ::= EXPRG 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("DEFINITION",2, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DEFINITION ::= separator separator 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("DEFINITION",2, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CONJUNTO ::= conj colon ID arrow NOTATION semicolon 
            {
              Object RESULT =null;
		 System.out.println("Nuevo conjunto"); 
              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("CONJUNTO",4, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-5)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NOTATION ::= letterLow virgulilla letterLow 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NOTATION",7, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NOTATION ::= letterUp virgulilla letterUp 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NOTATION",7, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NOTATION ::= number virgulilla number 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NOTATION",7, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NOTATION ::= LETTERS 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NOTATION",7, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NOTATION ::= NUMBERS 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NOTATION",7, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRG ::= ID arrow PREFIXREGEX semicolon 
            {
              Object RESULT =null;
		 System.out.println("Nueva expresión regular"); 
              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("EXPRG",5, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-3)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // PREFIXREGEX ::= operatorAnd ELEMENT PREFIXREGEX 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PREFIXREGEX ::= operatorAnd ELEMENT ELEMENT 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // PREFIXREGEX ::= operatorOr ELEMENT PREFIXREGEX 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // PREFIXREGEX ::= operatorOr ELEMENT ELEMENT 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // PREFIXREGEX ::= operatorZeroMore PREFIXREGEX 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // PREFIXREGEX ::= operatorZeroMore ELEMENT 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // PREFIXREGEX ::= operatorOneMore PREFIXREGEX 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // PREFIXREGEX ::= operatorOneMore ELEMENT 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // PREFIXREGEX ::= operatorZeroOne PREFIXREGEX 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // PREFIXREGEX ::= operatorZeroOne ELEMENT 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("PREFIXREGEX",10, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ELEMENT ::= leftCurlyB ID rightCurlyB 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ELEMENT",11, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ELEMENT ::= stringVal 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ELEMENT",11, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // EVALUATION ::= ID colon stringVal semicolon 
            {
              Object RESULT =null;
		 System.out.println("Nuevo lexema a evaluar"); 
              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("EVALUATION",3, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-3)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ID ::= letterUp ID 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ID ::= letterLow ID 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ID ::= number ID 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-1)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ID ::= letterUp 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ID ::= letterLow 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ID ::= number 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("ID",6, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // LETTERS ::= letterLow comma LETTERS 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("LETTERS",8, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // LETTERS ::= letterUp comma LETTERS 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("LETTERS",8, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // LETTERS ::= letterLow 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("LETTERS",8, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // LETTERS ::= letterUp 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("LETTERS",8, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // NUMBERS ::= number comma NUMBERS 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NUMBERS",9, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.elementAt(CUP$Syntactical$top-2)), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // NUMBERS ::= number 
            {
              Object RESULT =null;

              CUP$Syntactical$result = parser.getSymbolFactory().newSymbol("NUMBERS",9, ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntactical$stack.peek()), RESULT);
            }
          return CUP$Syntactical$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Syntactical$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Syntactical$do_action(
    int                        CUP$Syntactical$act_num,
    java_cup.runtime.lr_parser CUP$Syntactical$parser,
    java.util.Stack            CUP$Syntactical$stack,
    int                        CUP$Syntactical$top)
    throws java.lang.Exception
    {
              return CUP$Syntactical$do_action_part00000000(
                               CUP$Syntactical$act_num,
                               CUP$Syntactical$parser,
                               CUP$Syntactical$stack,
                               CUP$Syntactical$top);
    }
}

}
