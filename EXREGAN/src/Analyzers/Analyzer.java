/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analyzers;

/**
 *
 * @author neidy
 */
public class Analyzer {
    
    public static void main(String [] args){
        buildCompiler();
    }
    
    private static void buildCompiler(){
        try{
            String path = "src\\Analyzers\\";
            String flexF[] = {path + "Lexical.jflex", "-d", path};
            jflex.Main.generate(flexF);
            
            String cupF[] = {"-destdir", path, "-parser", "Syntactical", path + "Syntactical.cup"};
            java_cup.Main.main(cupF);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
