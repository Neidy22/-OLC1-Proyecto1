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
    
    public String getName(){
        return this.name;
    }
    
    public LinkedList<Node> getTransitions(){
        return this.transitions;
    }
    
    public String getTransitionValues(int state){
        String vals= "";
        for(Node x: this.transitions){ // recorrer las transiciones
            if(x.getNo() == state){ //si el valor del estado en el que se encuentra es igual al stado evaluado
                if(x.getVal() != "#"){
                    vals += x.getVal()+","; //agregar a la lista los valores de transición para ese estado
                }

            }
        }
        
        return vals;
    }
    
    public int getNextState(int actualState, String transitionVal){
        int n = -1;
        for(Node x : this.transitions){
            if(x.getNo() == actualState && x.getVal().equals(transitionVal)){
                n = x.getFinalNo();
                break;
            }
        }
        
        return n;
    
    }
    
    public boolean isActualFinal(int actualState, String v){
        boolean isF = false;
        for(Node x : this.transitions){
            //System.out.println("Estado actual" + x.getNo() + " estado analisis: "+actualState);
            if(x.getNo() == actualState){
                //if(x.getVal().equals(v)){
                System.out.println("Estado actual: " + x.getNo() + " estado analisis: "+actualState+ " Es F: "+x.isFinal());
                isF = x.isFinal(); 
                break;
                //}
            }
        }
        
        return isF;
    
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
        LinkedList <Integer> auxi2;
        //recorrer la lista de estados
        for(Node actual : states){
            //recorrer la lista de nextpos para sacar cada transicion
            auxi = actual.getNextPos();
            for(Integer hoja: auxi){
    
                //if(tbl.getNode(hoja-1).getVal() != "#"){
                Node newTransition = new Node(actual.getNo(), tbl.getNode(hoja-1).getVal());
                newTransition.getNextPos().addAll(actual.getNextPos());
                
                //if(tbl.getNode(hoja-1).getVal() != "#"){
                    newTransition.getNextPosFinal().addAll(tbl.getNode(hoja-1).getNextPos());
                    newTransition.setNoFinal(searchState(states, tbl.getNode(hoja-1).getNextPos()));
                //}

                //para determinar si es un estado de aceptación
                auxi2 = newTransition.getNextPos();
                for(Integer x : auxi2){
                    if(tbl.getNode(x-1).getVal() == "#"){
                        newTransition.setIsFinal(true);
                    }
                }
                    
                this.transitions.add(newTransition);

                System.out.println("Origen S"+actual.getNo() +" "+actual.getNextPos()+ "  Valor de transicion: "+tbl.getNode(hoja-1).getVal()+ " Destino: S"+searchState(states, tbl.getNode(hoja-1).getNextPos())+tbl.getNode(hoja-1).getNextPos());
            

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
                    EXREGAN.menu.addFolder(EXREGAN.menu.getTransitions());
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           System.out.println("Carpeta de transiciones ya existe");
           EXREGAN.menu.addTree(this.name, EXREGAN.menu.getTransitions());
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
    
    
    public void graphAFD(){
        String text="digraph AFD{\n";
        text += "   fontname = \"Helvetica,Arial,sans-serif\"\n";
        text += "   node [fontname=\"Helvetica,Arial,sans-serif\"]\n";
        text += "   edge [fontname=\"Helvetica,Arial,sans-serif\"]\n";
	text += "   rankdir=LR\n";
	text += "   node [shape = doublecircle, color=\"#ee00ee80\", style = \"filled\", fontcolor =\"white\"];\n ";
        //todos los nodos que son final o de aceptación
        
        String relas ="";
        
        char simpleQuo = 39, doubleQuo = 34, bar = 92, salto = 110;
        String name = "";
        for(Node x : this.transitions){
            if(x.isFinal()){
                text += " S"+x.getNo();
            }
            if(x.getVal().charAt(0) == '\\' && x.getVal().charAt(1) == salto){ // si el posible valor es un salto de linea
                name = "\"\\\\n\"";
            }
            else if(x.getVal().charAt(0) == '\\' && x.getVal().charAt(1) == doubleQuo){ // si el posible valor es comilla doble
                name = "\"\\\\''\"";
            }else if(x.getVal().charAt(0) == '\\' && x.getVal().charAt(1) == simpleQuo){ // si el posible valor es comilla simple
                name = "\"\\\\'\"";
            }else{
                name = x.getVal();
            }
            
            if(x.getVal() != "#"){
                relas += "    S"+ x.getNo()+ " -> S"+ x.getFinalNo() + "[label ="+name+"];\n";
            }
            
        }
        text += ";\n";
        
        text += "   node [shape=circle style=invis]; S-1\n";
        relas += "  S-1 -> S0\n";
        
	text += "   node [shape = circle, color=\"#0000ff80\", style = \"filled\", fontcolor = \"white\"];\n";
        text += relas;
	
        
        text+="}\n";
        
       
        //verifico si la carpeta de arboles existe
        
        File trees = new File("src\\Reports\\AFD_201801671");
        if(!trees.exists()){ // if folder doesn't exists
            try{
                if(trees.mkdir()){ // create the folder
                 
                    System.out.println("Carpeta de AFD creada");
                    EXREGAN.menu.addFolder(EXREGAN.menu.getAFD());
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           System.out.println("Carpeta de AFD ya existe");
           EXREGAN.menu.addTree(this.name, EXREGAN.menu.getAFD());
        }
        
        
        //genero los archivos de salida
        String dirsvg="src\\Reports\\AFD_201801671\\"+this.name+".png";
        String dirDot="src\\Reports\\AFD_201801671\\"+this.name+".dot";
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
