/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Main.EXREGAN;
import java.io.File;
import java.io.PrintWriter;
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
        if(actual != null){
           
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
    
    
    
    public void preorderGraph(AST actual, String [] nodes){
        if(actual != null){
            nodes[1] += "   node"+actual.id +"[\n" +
"		\n" +
"		label=<<table border=\"0\" cellborder=\"1\" cellspacing=\"0\" cellpadding=\"1\">\n" +
"			\n" +
"			<tr> \n" +
"			    <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>FP</i></td>\n" +
"			    <td rowspan = \"2\" aling= \"center\" fontsize = \"25\" bgcolor = \"#0000ff30\" color=\"#0000ff80\"> <b>"+actual.value+"</b></td> \n" +
"			    <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>LP </i></td>\n" +
"			</tr>\n" +
"			<tr> \n" +
"			    <td align=\"left\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><i>A</i></td>\n" +
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
        this.graph();
    }
    
}
