package Analyzers;
import java_cup.runtime.*;
%%

%{
    String lexema="";
%}


%class Lexical
%cupsym sym
%cup
%public
%unicode
%line
%column
%ignorecase



%init{
    yyline = 1;
    yychar = 1;
%init}

//expresiones regulares
endOfLineS = \r|\n|\r\n
inputChar = [^\r\n]
comment = "//" {inputChar}*{endOfLineS}?

number = [0-9]
letterLow = [a-z]
letterUp = [A-Z]
comma = ","
virgulilla = \u007E
//           alt33 - alt47      alt58 - alt64    alt91 - alt96    alt123 - alt125
asciiChar = [\u0021-\u002F] | [\u003A-\u0040] | [\u005B-\u0060] | [\u007B-\u007D]

leftCurlyB = \u007B[nextLine]*[nextL]*
rightCurlyB = \u007D[nextLine]*
semicolon = \u003B
colon = \u003A
arrow = ([\u002D][\u003E]) 



operatorAnd = \u002E
operatorOr = \u007C
operatorZeroMore = \u002A
operatorOneMore = \u002B
operatorZeroOne = \u003F
separator = [\u0025][\u0025]

%state  multicomment, specials, strings, identifiers

%%

 <YYINITIAL> {comment}          {System.out.println("Reconocio token <comment> lexema: "+ yytext()); 
                                 return new Symbol(sym.comment, yycolumn, yyline, yytext());  
                                }  


<YYINITIAL> "<!"                 {  
                                   
                                    lexema = lexema +yytext();
                                    yybegin(multicomment);
                                 }

            <multicomment> [^"!>"]+  {lexema = lexema + yytext();} 
            <multicomment> "!>"         {
                                            lexema = lexema + yytext();
                                            System.out.println("Reconocio token <comentarioMulti> lexema: "+ lexema); 
                                            String aux = lexema;
                                            lexema = "";

                                            yybegin(YYINITIAL);
                                            return new Symbol(sym.multicomment, yycolumn, yyline, aux);
                                        
                                            
                                        }

<YYINITIAL> [\u005C]    {  
                            lexema = "";
                            lexema = lexema +yytext();
                            yybegin(specials);
                        }

            <specials>  "n"             {
                                            lexema = lexema + yytext();
                                            System.out.println("Reconocio token <nextL> lexema: "+ lexema); 
                                            String aux = lexema;
                                            lexema = "";

                                            yybegin(YYINITIAL);
                                            return new Symbol(sym.nextL, yycolumn, yyline, aux);
                                        }

            <specials> [\u0027]         {
                                            lexema = lexema + yytext();
                                            System.out.println("Reconocio token <singleQuoMark> lexema: "+ lexema); 
                                            String aux = lexema;
                                            lexema = "";

                                            yybegin(YYINITIAL);
                                            return new Symbol(sym.singleQuoMark, yycolumn, yyline, aux);
                                        }

            <specials> [\u0022]         {
                                            lexema = lexema + yytext();
                                            System.out.println("Reconocio token <doubleQuoMark> lexema: "+ lexema); 
                                            String aux = lexema;
                                            lexema = "";

                                            yybegin(YYINITIAL);
                                            return new Symbol(sym.doubleQuoMark, yycolumn, yyline, aux);
                                        }
//reconoce las comillas dobles
<YYINITIAL> [\u0022]    {  
                            lexema = "";
                            //lexema = lexema +yytext();
                            yybegin(strings);
                        }
            
            //hasta que encuentra el final de la cadena añade al lexema todo lo que encuentre
            <strings> [^\u0022]     {
                                        lexema = lexema + yytext();
                                    }

            //si se encuentra con la siguiente comilla doble significa que la cadena finalizó y reconoce el token cadena
            <strings> [\u0022]      {
                                        //lexema = lexema + yytext();
                                        System.out.println("Reconocio token <stringVal> lexema: "+ lexema); 
                                        String aux = lexema;
                                        lexema = "";

                                        yybegin(YYINITIAL);
                                        return new Symbol(sym.stringVal, yycolumn, yyline, aux);
                                    }




<YYINITIAL> {operatorAnd}   {System.out.println("Reconocio token <operatorAnd> lexema: "+ yytext()); 
                             return new Symbol(sym.operatorAnd, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {operatorOr}    {System.out.println("Reconocio token <operatorOr> lexema: "+ yytext()); 
                             return new Symbol(sym.operatorOr, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {operatorZeroMore}   {System.out.println("Reconocio token <operatorZeroMore> lexema: "+ yytext()); 
                             return new Symbol(sym.operatorZeroMore, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {operatorOneMore}   {System.out.println("Reconocio token <operatorOneMore> lexema: "+ yytext()); 
                             return new Symbol(sym.operatorOneMore, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {operatorZeroOne}   {System.out.println("Reconocio token <operatorZeroOne> lexema: "+ yytext()); 
                             return new Symbol(sym.operatorZeroOne, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {separator}     {System.out.println("Reconocio token <separator> lexema: "+ yytext()); 
                             return new Symbol(sym.separator, yycolumn, yyline, yytext());  
                            }



<YYINITIAL> {comma}         {System.out.println("Reconocio token <comma> lexema: "+ yytext()); 
                             return new Symbol(sym.comma, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {virgulilla}    {System.out.println("Reconocio token <virgulilla> lexema: "+ yytext()); 
                             return new Symbol(sym.virgulilla, yycolumn, yyline, yytext());  
                            }



<YYINITIAL> {leftCurlyB}    {System.out.println("Reconocio token <leftCurlyB> lexema: "+ yytext()); 
                             return new Symbol(sym.leftCurlyB, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {rightCurlyB}   {System.out.println("Reconocio token <rightCurlyB> lexema: "+ yytext()); 
                             return new Symbol(sym.rightCurlyB, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {semicolon}     {System.out.println("Reconocio token <semicolon> lexema: "+ yytext()); 
                             return new Symbol(sym.semicolon, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {colon}         {System.out.println("Reconocio token <colon> lexema: "+ yytext()); 
                             return new Symbol(sym.colon, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {arrow}         {System.out.println("Reconocio token <arrow> lexema: "+ yytext()); 
                             return new Symbol(sym.arrow, yycolumn, yyline, yytext());  
                            }




<YYINITIAL> {letterLow}        {System.out.println("Reconocio token <letterLow> lexema: "+ yytext()); 
                             return new Symbol(sym.letterLow, yycolumn, yyline, yytext()); 
                            }

<YYINITIAL> {letterUp}        {System.out.println("Reconocio token <letterUp> lexema: "+ yytext()); 
                             return new Symbol(sym.letterUp, yycolumn, yyline, yytext()); 
                            }


<YYINITIAL> {number}        {System.out.println("Reconocio token <number> lexema: "+ yytext()); 
                             return new Symbol(sym.number, yycolumn, yyline, yytext()); 
                            }



<YYINITIAL> {asciiChar}     {System.out.println("Reconocio token <asciiChar> lexema: "+ yytext()); 
                             return new Symbol(sym.asciiChar, yycolumn, yyline, yytext()); 
                            }





<YYINITIAL> "CONJ"          {System.out.println("Reconocio token <conj> lexema: "+ yytext()); 
                             return new Symbol(sym.conj, yycolumn, yyline, yytext());  
                            }



[ \t\r\n\f ]+ {/*Espacios en blanco se ignoran */}

.   {
        System.out.println("Error léxico:  "+ yytext()+" Linea: "+ yyline +" Columna: "+yycolumn);
        lexema = "";
        yybegin(YYINITIAL);
    }


