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
public class Node {
    private int no;
    private int noFinal;
    private String value;
    private LinkedList <Integer> nextPos = new LinkedList <Integer>();
    private LinkedList <Integer> nextPosFinal = new LinkedList <Integer>();
    
    public Node(int n, String v){
        this.no = n;
        this.value = v;
    }
    
    public Node(int n){
        this.no = n;
    }
    
    public Node(String val, LinkedList <Integer> next){
        this.value = val;
        this.nextPos.addAll(next);
    }
    
    public void setVal(String v){
        this.value = v;
    }
    
    
    public void setNoFinal(int f){
        this.noFinal = f;    
    }
    
    public void setNo(int n){
       this.no = n;
    }
    
    public void addNext(int pos){
        this.nextPos.add(pos);
    }
    
    public int getNo(){
        return this.no;
    }
    
    public int getFinalNo(){
        return this.noFinal;
    }
    
    public String getVal(){
        return this.value;
    }
    
    public LinkedList getNextPos(){
        return this.nextPos;
    }
    
    public LinkedList getNextPosFinal(){
        return this.nextPosFinal;
    }
    
    
    

}
