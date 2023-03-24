/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author neidy
 */
public class TError {
    private String archivo;
    private String tipo;
    private String lexema;
    private String description;
    private int row;
    private int col;
   
    
    public TError(String archi,String t,String l, String d, int r, int c){
        this.archivo = archi;
        this.tipo = t;
        this.lexema = l;
        this.description = d;
        this.row = r;
        this.col = c;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getColumn(){
        return this.col;
    }
    
    public String getType(){
        return this.tipo;
    }
    
    public String getLex(){
        return this.lexema;
    }
    
    public String getDesc(){
        return this.description;
    }
    
    public String getArchi(){
        return this.archivo;
    }
}
