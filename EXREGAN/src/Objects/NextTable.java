/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Main.EXREGAN;
import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 *
 * @author neidy
 */
public class NextTable {
    private String name;
    private LinkedList<Node> nodes = new LinkedList<Node>();
    
    public NextTable(String n){
        this.name = n;
    }
    
    public void addNode(Node n){
        this.nodes.add(n);
    }
    
    public Node getNode(int i){
        return this.nodes.get(i);
    }
    public String getName(){
        return this.name;
    }
    
    public LinkedList getNodes(){
        return this.nodes;
    }
    
    public void graph(){
        String text="digraph NEXT{\n";
        text+="    rankdir=TB;\n";
        
        text +=" nodePrin[";
		
	text+="     label=<<table border=\"0\" cellborder=\"1\" cellspacing=\"0\" cellpadding=\"1\">";
			
	text += "		<tr> ";
	text +=	"                   <td colspan = \"2\" align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><b>Hoja </b></td>";
	text += "		    <td aling= \"center\" bgcolor = \"#0000ff30\" color=\"#0000ff80\"><b>Siguientes </b></td> ";
	text += "		</tr>";
        
        for(Node x: this.nodes){
            text += "		<tr> ";	
            text += "                <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\">"+x.getVal()+"</td>";
            text += "                <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\">"+x.getNo()+"</td>";
            text += "                <td aling= \"center\" bgcolor = \"#0000ff30\" color=\"#0000ff80\">"+x.getNextPos()+"</td> ";
            text += "		</tr>";
            
        }

			
		
	text += "	</table>>";
	text += "	shape=plain";
        text+="]";
        text+="}";
        
       
        //verifico si la carpeta de arboles existe
        
        File trees = new File("src\\Reports\\SIGUIENTES_201801671");
        if(!trees.exists()){ // if folder doesn't exists
            try{
                if(trees.mkdir()){ // create the folder
                 
                    System.out.println("Carpeta de siguientes creada");
                    EXREGAN.menu.addFolder(EXREGAN.menu.getTrees());
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           System.out.println("Carpeta de siguientes ya existe");
           EXREGAN.menu.addTree(this.name, EXREGAN.menu.getNexts());
        }
        
        
        //genero los archivos de salida
        String dirsvg="src\\Reports\\SIGUIENTES_201801671\\"+this.name+".png";
        String dirDot="src\\Reports\\SIGUIENTES_201801671\\"+this.name+".dot";
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
    
}
