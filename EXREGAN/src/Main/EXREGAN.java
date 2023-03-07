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
    public static LinkedList <TError> errores = new LinkedList<TError>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu.setVisible(true);
    }
    
}
