/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Objects.*;
import ui.mainMenu;
import java.util.LinkedList;

/**
 *
 * @author neidy
 */
public class EXREGAN {

    /**
     * @param args the command line arguments
     */
    
    public static mainMenu menu = new mainMenu();
    public static LinkedList <Conjunto> conjuntos = new LinkedList<Conjunto>();
    public static LinkedList <Evaluation> evaluations = new LinkedList<Evaluation>();
    public static LinkedList <TError> errores = new LinkedList<TError>();
    public static LinkedList <AST> trees = new LinkedList<AST>();
    public static LinkedList <NextTable> nextPos = new LinkedList<NextTable>();
    public static LinkedList <TransitionTable> afds = new LinkedList<TransitionTable>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu.setVisible(true);
    }
    
}
