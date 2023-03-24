package Analyzers;
import java_cup.runtime.*;
import Main.*;
import Objects.*;
import ui.*;
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
letters = [a-zA-Z]
values = {letters} | {number} | {asciiChar} | {specialChar} | {blankSpace}
stringVal = ([\u0022]{values}*[\u0022]) 
idVal = {letters} | {number}
id = {idVal}+

number = [0-9]

comma = ","
virgulilla = \u007E
specialChar = [\u005C]"n"|[\u005C][\u0027]|[\u005C][\u0022]
//           alt33      alt35 - alt47      alt58 - alt64    alt91 - alt96    alt123 - alt125
asciiChar = [\u0021] | [\u0023-\u002F] | [\u003A-\u0040] | [\u005B-\u0060] | [\u007B-\u007D]
blankSpace = [\u0020]

leftCurlyB = \u007B
rightCurlyB = \u007D
semicolon = \u003B
colon = \u003A
arrow = ([\u002D]{blankSpace}*[\u003E]) 


nextL = [\u005C]"n"
singleQuoMark = [\u005C][\u0027]    
doubleQuoMark = [\u005C][\u0022]


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


//reconoce las comillas dobles
<YYINITIAL> {stringVal}             {
                                      
                                        System.out.println("Reconocio token <stringVal> lexema: "+ yytext()); 
                                        

                                        yybegin(YYINITIAL);
                                        return new Symbol(sym.stringVal, yycolumn, yyline, yytext());
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

<YYINITIAL> {specialChar}   {System.out.println("Reconocio token <specialChar> lexema: "+ yytext()); 
                             return new Symbol(sym.specialChar, yycolumn, yyline, yytext()); 
                            }


<YYINITIAL> {asciiChar}     {System.out.println("Reconocio token <asciiChar> lexema: "+ yytext()); 
                             return new Symbol(sym.asciiChar, yycolumn, yyline, yytext()); 
                            }






<YYINITIAL> "CONJ"          {System.out.println("Reconocio token <conj> lexema: "+ yytext()); 
                             return new Symbol(sym.conj, yycolumn, yyline, yytext());  
                            }

<YYINITIAL> {id}            {System.out.println("Reconocio token <id> lexema: "+ yytext()); 
                             return new Symbol(sym.id, yycolumn, yyline, yytext());  
                            }



[ \t\r\n\f ]+ {/*Espacios en blanco se ignoran */}

.   {
        System.out.println("Error léxico:  "+ yytext()+" Linea: "+ yyline +" Columna: "+yycolumn);
        TError tmp = new TError(mainMenu.nameActualF, "Léxico",yytext(),"Caracter no pertenece al lenguaje",yyline,yycolumn);
        EXREGAN.errores.add(tmp);
        lexema = "";
        yybegin(YYINITIAL);
    }


