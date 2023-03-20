/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import Main.EXREGAN;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author neidy
 */
public class TransitionTable {
    private String name;
    private LinkedList<Node> transitions;
    
    
    
    public TransitionTable(String n){
        this.name = n;
        this.transitions = new LinkedList<>();
        
    }
    
    public void generateTable(NextTable tbl, ArrayList<Integer> firstPos){
        LinkedList <Node> states = new LinkedList <Node>();
        int cont = 0;
        //asignar a S0 el listado de first pos del nodo raiz
        Node initState = new Node(cont);
        initState.getNextPos().addAll(firstPos);
        //agregar S0 a la lista de estados
        states.add(initState);
        
        LinkedList <Node> aux = tbl.getNodes();
        
        //recorrer la tabla de next para obtener los estados
        for(Node x: aux){
            //si el estado no existe incrementar el contador, crearlo y añadirlo a la lista de estados        
            if(!stateExists(states, x.getNextPos())){
                cont++;
                Node nuevo = new Node(cont);
                nuevo.getNextPos().addAll(x.getNextPos());
                states.add(nuevo);
                System.out.println("Estado: "+nuevo.getNo() + " Hojas: "+nuevo.getNextPos());
            }
  
        }
        
        LinkedList <Integer> auxi;
        //recorrer la lista de estados
        for(Node actual : states){
            //recorrer la lista de nextpos para sacar cada transicion
            auxi = actual.getNextPos();
            for(Integer hoja: auxi){
                if(tbl.getNode(hoja-1).getVal() != "#"){
                    System.out.println("Origen S"+actual.getNo() +" "+actual.getNextPos()+ "  Valor de transicion: "+tbl.getNode(hoja-1).getVal()+ " Destino: S"+searchState(states, tbl.getNode(hoja-1).getNextPos())+tbl.getNode(hoja-1).getNextPos());
                    Node newTransition = new Node(actual.getNo(), tbl.getNode(hoja-1).getVal());
                    newTransition.getNextPos().addAll(actual.getNextPos());
                    newTransition.getNextPosFinal().addAll(tbl.getNode(hoja-1).getNextPos());
                    newTransition.setNoFinal(searchState(states, tbl.getNode(hoja-1).getNextPos()));
                    this.transitions.add(newTransition);
                }

            }
        }
        
       
        
        

        
 
    }
    
    public boolean stateExists(LinkedList <Node> st, LinkedList<Integer> next){
        boolean exist = false;
        for(Node x : st){
            if(x.getNextPos().size() == next.size()){
                if(x.getNextPos().containsAll(next)){
                    exist = true;
                    break;
                } 
            }
        }
        return exist;
    }
  
    public int searchState(LinkedList <Node> st, LinkedList<Integer> next){
        int noState = -1;
        for(Node x : st){
            if(x.getNextPos().size() == next.size()){
                if(x.getNextPos().containsAll(next)){
                    noState = x.getNo();
                    break;
                }
            }
        }
        return noState;
    }


    public void graph(){
        String text="digraph TRANSITION{\n";
        text+="    rankdir=TB;\n";
        
        text +=" nodePrin[\n";
		
	text+="     label=<<table border=\"0\" cellborder=\"1\" cellspacing=\"0\" cellpadding=\"1\">\n";
			
	text += "		<tr> \n";
	text +=	"                   <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\"><b>Estado</b></td>\n";
	text += "		    <td aling= \"center\" bgcolor = \"#0000ff30\" color=\"#0000ff80\"><b>Terminales</b></td>\n ";
        text += "		    <td aling= \"center\" bgcolor = \"#0000ff30\" color=\"#0000ff80\"><b>Estado destino</b></td>\n ";
	text += "		</tr>\n";
        
        for(Node x: this.transitions){
            text += "		<tr> \n";	
            text += "                <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\">S"+x.getNo()+" "+x.getNextPos()+"</td>\n";
            text += "                <td align=\"center\" bgcolor = \"#0000ff11\" color=\"#ee00ee80\">"+x.getVal()+"</td>\n";
            text += "                <td aling= \"center\" bgcolor = \"#0000ff30\" color=\"#0000ff80\">S"+x.getFinalNo()+" "+x.getNextPosFinal()+"</td> \n";
            text += "		</tr>\n";
            
        }

			
		
	text += "	</table>>\n";
	text += "	shape=plain\n";
        text+="]\n";
        text+="}\n";
        
       
        //verifico si la carpeta de arboles existe
        
        File trees = new File("src\\Reports\\TRANSICIONES_201801671");
        if(!trees.exists()){ // if folder doesn't exists
            try{
                if(trees.mkdir()){ // create the folder
                 
                    System.out.println("Carpeta de transiciones creada");
                    //EXREGAN.menu.addFolder(EXREGAN.menu.getTrees());
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           System.out.println("Carpeta de transiciones ya existe");
        }
        
        
        //genero los archivos de salida
        String dirsvg="src\\Reports\\TRANSICIONES_201801671\\"+this.name+".png";
        String dirDot="src\\Reports\\TRANSICIONES_201801671\\"+this.name+".dot";
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
