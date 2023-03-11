/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Main.EXREGAN;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.tree.DefaultMutableTreeNode;



/**
 *
 * @author neidy
 */
public class AST {
    private int id;
    private String name;
    private String value;
    private boolean anulable;
    private int no;
    private int leafs;
    private ArrayList <Integer> firstPos = new ArrayList<Integer>();
    private ArrayList <Integer> lastPos = new ArrayList<Integer>();
    private AST leftSon;
    private AST rightSon;
    
    public AST(int i, String v, AST l, AST r){
      
        this.id = i;
        this.value = v;
        this.leftSon = l;
        this.rightSon = r; 
        this.leafs = 0;
    }
 
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    
    public void setAnulables(AST actual){
        //aplico recorrido post-orden para iniciar de las hojas a la raiz
        if(actual != null){
            setAnulables(actual.leftSon);
            setAnulables(actual.rightSon);
            
            if(actual.value == "."){ // union
                //si ambos hijos son anulables, el nodo es anulable
                if(actual.leftSon.isAnulable() && actual.rightSon.isAnulable()){
                    actual.anulable = true;
                }else{
                    actual.anulable = false;
                } 
            }else if(actual.value == "|"){// or
                if(actual.leftSon.isAnulable() || actual.rightSon.isAnulable()){
                    actual.anulable = true;
                }else{
                    actual.anulable = false;
                }

            }else if(actual.value == "*"){// cerradura de kleene
                actual.anulable = true;
            
            }else if(actual.value == "+"){ // 1 o mas
                if(actual.leftSon.isAnulable()){
                    actual.anulable = true;
                }else{
                    actual.anulable = false;
                }
            
            }else if(actual.value == "?"){ //0 o una vez
                actual.anulable = true;
            
            }else if(actual.no > 0){ //es nodo hoja
                actual.anulable = false;
            } 

           
        }
    }
    
    public void setLeafNodes(AST actual){
        if(actual != null){
            if(actual.leftSon == null){
                if(actual.rightSon == null){
               
                    this.leafs++;
                    actual.no = this.leafs;
                        
                }
            }
                
            setLeafNodes(actual.leftSon);
            setLeafNodes(actual.rightSon);
            
           
            
            
            
        }
    }
    
    public boolean isAnulable(){
        return this.anulable;
    }
    
    public void setFirst(AST actual){
        if(actual != null){
            setFirst(actual.leftSon);
            setFirst(actual.rightSon);
            
            if(actual.value == "."){ // union
                //si el hijo iz es anulable, first pos = first pos a + first pos b
                if(actual.leftSon.isAnulable()){
                    combineList(actual.leftSon.firstPos, actual.rightSon.firstPos, actual);
                }else{
                    //first pos = first pos a
                    actual.firstPos.addAll(actual.leftSon.firstPos);
                } 
            }else if(actual.value == "|"){// or
                //first pos = first pos a + first pos b
                combineList(actual.leftSon.firstPos, actual.rightSon.firstPos, actual);
                
            }else if(actual.value == "*"){// cerradura de kleene
                //first pos = first pos a
                actual.firstPos.addAll(actual.leftSon.firstPos);
                
            }else if(actual.value == "+"){ // 1 o mas
                //first pos = first pos a
                actual.firstPos.addAll(actual.leftSon.firstPos);
                
            }else if(actual.value == "?"){ //0 o una vez
                //first pos = first pos a
                actual.firstPos.addAll(actual.leftSon.firstPos);
                
            }else if(actual.no > 0){ //es nodo hoja
                //first pos = no de hoja
                actual.firstPos.add(actual.no);
            } 

           
        }
            
    }
    
    
    public void combineList(ArrayList listA, ArrayList listB, AST actual){
        Set<Integer> setCombined = new HashSet<>(listA);
        setCombined.addAll(listB);
        actual.firstPos.addAll(setCombined);
        System.out.println(actual.firstPos);
    }
    
    public void preorderGraph(AST actual, String [] nodes){
        if(actual != null){
            nodes[1] += "   node"+actual.id +"[\n" +
"		\n" +
"		label=<<table border=\"0\" cellborder=\"1\" cellspacing=\"0\" cellpadding=\"1\">\n" +
"			\n" +
"			<tr> \n" +
"			    <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>"+actual.firstPos+"</i></td>\n" +
"			    <td rowspan = \"2\" aling= \"center\" fontsize = \"25\" bgcolor = \"#0000ff30\" color=\"#0000ff80\"> <b>"+actual.value+"</b></td> \n" +
"			    <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>LP </i></td>\n" +
"			</tr>\n" +
"			<tr> \n" +
"			    <td align=\"left\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>"+actual.anulable+"</i></td>\n" +
"			    <td align=\"left\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>"+actual.no+"</i><br align=\"left\"/></td>\n" +
"			</tr>\n" +
"		\n" +
"		</table>>\n" +
"		shape=plain\n" +
"           ];\n";
            
            if(actual.leftSon != null){
                nodes[0] += "    node"+actual.id+" -> node"+actual.leftSon.id+";\n";
            }
            preorderGraph(actual.leftSon,nodes);
            
            if(actual.rightSon != null){
                nodes[0] += "    node"+actual.id+" -> node"+actual.rightSon.id+";\n";
            }
            preorderGraph(actual.rightSon,nodes);
        }
    }
 
    public void graph(){
        String text="digraph AST{\n";
        text+="    rankdir=TB;\n";
        
        
        String [] n = new  String [2]; 
        n[0]="";
        n[1]="";
        String relas="";
        String labels="";
        preorderGraph(this,n);
        text+=n[0];
        text+=n[1];
        
        text+="}";
        
       
        //verifico si la carpeta de arboles existe
        
        File trees = new File("src\\Reports\\ARBOLES_201801671");
        if(!trees.exists()){ // if folder doesn't exists
            try{
                if(trees.mkdir()){ // create the folder
                 
                    System.out.println("Carpeta de ARBOLES creada");
                    EXREGAN.menu.addFolder(EXREGAN.menu.getTrees());
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           System.out.println("Carpeta de ARBOLES ya existe");
        }
        
        
        //genero los archivos de salida
        String dirsvg="src\\Reports\\ARBOLES_201801671\\"+this.name+".png";
        String dirDot="src\\Reports\\ARBOLES_201801671\\"+this.name+".dot";
        try{
            
            PrintWriter writer= new PrintWriter(dirDot,"UTF-8");
            writer.print(text);
            writer.close();
            String cmd="C:\\Program Files\\Graphviz\\bin\\dot " + " -Tpng " + " -o " + " " + dirsvg + " " + dirDot;
            Runtime rt=Runtime.getRuntime();
            rt.exec(cmd);

        } catch (Exception e) {
            e.printStackTrace();
        }
            
         
            
            
        
    }
        
    public void generateAST(String nameA){
        this.setName(nameA);
        this.setLeafNodes(this);
        this.setAnulables(this);
        this.setFirst(this);
        this.graph();
    }
    
}
