/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.LinkedList;

/**
 *
 * @author neidy
 */
public class Conjunto {
 
    private String id;
    private String notation;
    
    public Conjunto(String i, String n){
        this.id = i;
        this.notation = n;
    }
    
    public String getId(){
        return this.id;
    }
    
    public boolean isInRange(char c){
        boolean isIn = false;
        if(this.notation.charAt(1)==','){ //es una lista
            String elements []= this.notation.split(","); // obtengo la lista de elementos que se esperan
            for(String e : elements){
                if(e.equals(c)){
                    isIn = true;
                    break;
                } 
            }
        
        }else if(this.notation.charAt(1) == '~'){//son dos valores
            if(c >= this.notation.charAt(0) && c <= this.notation.charAt(2)){
                isIn = true;
            }
        }
        
        return isIn;
    
    }
    
    
    public LinkedList<String> getValuesInRange(){
        LinkedList<String> values = new LinkedList<String>();
        if(this.notation.charAt(1)==','){ //es una lista
            //System.out.println("Es lista de valores");
            String elements []= this.notation.split(","); // obtengo la lista de elementos que se esperan
            for(String e : elements){
                values.add(this.id);
                values.add(e);
            }
        
        }else if(this.notation.charAt(1) == '~'){//son dos valores min, y maximo del rango
            //System.out.println("Es rango");
            char c = this.notation.charAt(0);
            while(c <= this.notation.charAt(2)){
                values.add(this.id);
                values.add(String.valueOf(c));
                c++;
            }
        }
        return values;
    }
    
}
