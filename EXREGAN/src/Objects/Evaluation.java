/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author neidy
 */
public class Evaluation {
    private String nameF;
    private String id;
    private String lexem;
    private boolean isValid;
    
    public Evaluation(String id, String lexem){
        this.id = id;
        this.lexem = lexem;
        this.isValid = false;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getLexem(){
        return this.lexem;
    }
    
    public void setIsValid(boolean r){
        this.isValid = r;
    }
    
    public boolean getIsValid(){
        return this.isValid;
    }
    
    public void setNameF(String f){
        this.nameF = f;
    }
    
    public String getNameF(){
        return this.nameF;
    }
    
    public String generateResultJson(){
        String text = "";
        //text += "   {\n";
        text += "       \"Valor\": "+this.lexem+", \n";
        text += "       \"ExpresionRegular\": \""+this.id+"\", \n";
        text += "       \"Resultado\": \"Cadena Válida\" \n";
        
        
        
        return text;
    }
}


