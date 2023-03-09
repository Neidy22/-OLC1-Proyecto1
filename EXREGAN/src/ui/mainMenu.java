/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Analyzers.Analyzer;
import Main.EXREGAN;
import Objects.TError;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author neidy
 */
public class mainMenu extends javax.swing.JFrame {
    
    
    //global variables
    File myFile;
    FileInputStream inF;
    FileOutputStream outF;
    String nameF;
    int contador;
    
    private DefaultTreeModel reports;
    private DefaultMutableTreeNode root, trees, afd, afnd, nexts, transitions, errors, outs;
   

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
       
        initComponents();
        
      
        root = new DefaultMutableTreeNode("Reports");
        trees = new DefaultMutableTreeNode("ARBOLES_201801671");
        afd = new DefaultMutableTreeNode("AFD_201801671");
        afnd = new DefaultMutableTreeNode("AFND_201801671");
        nexts = new DefaultMutableTreeNode("SIGUIENTES_201801671");
        transitions = new DefaultMutableTreeNode("TRANSICIONES_201801671");
        errors = new DefaultMutableTreeNode("ERRORES_201801671");
        outs = new DefaultMutableTreeNode("SALIDAS_201801671");
        
        reports = new DefaultTreeModel(root);
        reportsT.setModel(reports);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtConsole = new javax.swing.JTextField();
        jtpGraph = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFile = new javax.swing.JTextArea();
        btnGenerate = new javax.swing.JButton();
        btnAnalyze = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlblGraph = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        scrollTree = new javax.swing.JScrollPane();
        reportsT = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jMNewF = new javax.swing.JMenuItem();
        jMOpenFile = new javax.swing.JMenuItem();
        jMSaveF = new javax.swing.JMenuItem();
        jMSaveAsF = new javax.swing.JMenuItem();
        jmView = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuError = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXREGAN");
        setBackground(new java.awt.Color(51, 19, 92));

        jPanel1.setBackground(new java.awt.Color(53, 19, 92));

        jScrollPane1.setViewportView(jtxtConsole);

        jPanel3.setBackground(new java.awt.Color(166, 117, 255));

        txtFile.setColumns(20);
        txtFile.setRows(5);
        jScrollPane3.setViewportView(txtFile);

        btnGenerate.setBackground(new java.awt.Color(255, 75, 131));
        btnGenerate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Generate automat");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnAnalyze.setBackground(new java.awt.Color(255, 218, 48));
        btnAnalyze.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAnalyze.setText("Analyze input");
        btnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jtpGraph.addTab("Analizer", jPanel3);

        jPanel2.setBackground(new java.awt.Color(126, 96, 246));

        jScrollPane4.setViewportView(jlblGraph);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/right.png"))); // NOI18N
        btnNext.setText("jButton3");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/left.png"))); // NOI18N
        btnBack.setText("jButton4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtpGraph.addTab("Graphics", jPanel2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Reportes");
        reportsT.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        reportsT.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                reportsTAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        scrollTree.setViewportView(reportsT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtpGraph)
                        .addGap(18, 18, 18)
                        .addComponent(scrollTree, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpGraph)
                    .addComponent(scrollTree))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 75, 172));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jmFile.setForeground(new java.awt.Color(255, 255, 255));
        jmFile.setText("File");

        jMNewF.setText("New File");
        jMNewF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNewFActionPerformed(evt);
            }
        });
        jmFile.add(jMNewF);

        jMOpenFile.setText("Open File");
        jMOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOpenFileActionPerformed(evt);
            }
        });
        jmFile.add(jMOpenFile);

        jMSaveF.setText("Save");
        jMSaveF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSaveFActionPerformed(evt);
            }
        });
        jmFile.add(jMSaveF);

        jMSaveAsF.setText("Save As");
        jMSaveAsF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSaveAsFActionPerformed(evt);
            }
        });
        jmFile.add(jMSaveAsF);

        jMenuBar1.add(jmFile);

        jmView.setForeground(new java.awt.Color(255, 255, 255));
        jmView.setText("View");

        jMenuItem5.setText("Trees");
        jmView.add(jMenuItem5);

        jMenuItem6.setText("Following table");
        jmView.add(jMenuItem6);

        jMenuItem7.setText("Transition table");
        jmView.add(jMenuItem7);

        jMenu5.setText("Automats");

        jMenuItem8.setText("AFD");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("AFND");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jmView.add(jMenu5);

        jMenuError.setText("Error Table");
        jMenuError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuErrorActionPerformed(evt);
            }
        });
        jmView.add(jMenuError);

        jMenuBar1.add(jmView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSaveAsFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSaveAsFActionPerformed
        try {
    
            saveAsFile();
        } catch (IOException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMSaveAsFActionPerformed

    private void jMNewFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNewFActionPerformed
       
        this.txtFile.setText("");
        myFile = null;
        
    }//GEN-LAST:event_jMNewFActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalyzeActionPerformed

    private void jMOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOpenFileActionPerformed
        JFileChooser selector = new JFileChooser();
        int returnVal = selector.showOpenDialog(jPanel1);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            myFile = selector.getSelectedFile();
            if(myFile == null || (myFile.getName().equals(""))){
                JOptionPane.showMessageDialog(this, "Archivo no válido");
            }else{
                setArea(myFile);
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Sin selección!");
        }
        
    }//GEN-LAST:event_jMOpenFileActionPerformed

    private void jMSaveFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSaveFActionPerformed
        try {
            // TODO add your handling code here:
            saveFile();
        } catch (IOException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMSaveFActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        try {
            Analyzers.Syntactical parse;
            parse = new Analyzers.Syntactical( new Analyzers.Lexical(new StringReader( txtFile.getText())));

            parse.parse();
           
        }catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jMenuErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuErrorActionPerformed
        // TODO add your handling code here:
        //rellenar tabla de errores
        String tableHtml = generateTable();
        File tableErrors = new File("src\\files\\ERRORES_"+this.contador+".html");
        createFile(tableErrors,tableHtml);
        try { 
            openDisplay(tableErrors.toString());
        } catch (IOException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuErrorActionPerformed

    private void reportsTAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_reportsTAncestorAdded
      
    }//GEN-LAST:event_reportsTAncestorAdded

    public void setArea(File f){
        String text = "";
        
        try{
            inF = new FileInputStream(f);
            int value;
            while((value = inF.read()) != -1){
                char letter = (char)value;
                text += letter;
            }
        }catch(Exception e){
            
        }
        
        txtFile.setText(text);
    }
    
    void writeOutputFile(String txt ){
        String dirF = "src\\files\\"+myFile.getName();
       
        try {
            PrintWriter writer = new PrintWriter(dirF, "UTF-8");
            writer.print(txt);
            writer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void saveFile() throws FileNotFoundException, IOException{
        
        
        if( myFile != null){
            
            writeOutputFile(txtFile.getText());
            
            JOptionPane.showMessageDialog(this, "Se guardaron los cambios");
        }else{
            saveAsFile();
        }
        
    }
    
    public void saveAsFile() throws FileNotFoundException, IOException{
        
        nameF = JOptionPane.showInputDialog("Ingresa el nombre del archivo");
        //Guardo en un aux el archivo actual para poder generar el nuevo archivo sin perder el actual
        File aux = myFile;
        String path = "src\\files\\"+nameF+".olc";
        myFile = new File(path);
        
        writeOutputFile(txtFile.getText());
        
        
        myFile = aux;
         
        JOptionPane.showMessageDialog(this, "Nuevo archivo guardado");
    
    }
    
    public String generateTable(){
        
        String contenido;
        
        String header ="<html>\n";
        header += "<style>\n";
        header += "table,th,td{\n"
                + "border:1px solid black;\n"
                + "}\n"
                + "</style>\n";
        
        header += "<h1>TABLA DE ERRORES</h1>\n";
        
        String body ="<body>\n"
                    + "<table> \n";
        body += "    <tr>\n";
        body += "        <th>No. </th>\n";
        body += "        <th>Línea</th>\n";
        body += "        <th>Columna</th>\n";
        body += "        <th>Tipo</th>\n";
        body += "        <th>Lexema</th>\n";
        body += "        <th>Descripción</th>\n";
        body += "    </tr>\n";
        
        int cont = 1;
        for(TError x: EXREGAN.errores ){
            body += "    <tr>\n";
            body += "        <th>"+cont+"</th>\n";
            body += "        <th>"+x.getRow()+"</th>\n";
            body += "        <th>"+x.getColumn()+"</th>\n";
            body += "        <th>"+x.getType()+"</th>\n";
            body += "        <th>"+x.getLex()+"</th>\n";
            body += "        <th>"+x.getDesc()+"</th>\n";
            body += "    </tr>\n";
            cont++;
        }
        body+="</table>\n"
             +"</body>\n"
             +"<html>\n";
                
        contenido = header + body;
        return contenido;
    }
    
    public void createFile(File file, String contenido){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
               
            }
        }
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try
        {
            fichero = new FileWriter(file);
            pw = new PrintWriter(fichero);
            String [] lineas = contenido.split("\n");

            for (String linea: lineas)
                pw.println(linea);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
            if (null != fichero)
               fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public void openDisplay(String ruta) throws IOException{
        File obj = new File(ruta);
        Desktop.getDesktop().open(obj);
    }
    
    public void addTree(String nameR, DefaultMutableTreeNode parent, String path){
        //verifico si la carpeta de arboles existe
        File trees = new File("src\\Reports\\"+path);
        if(!trees.exists()){ // if folder doesn't exists
            try{
                if(trees.mkdir()){ // create the folder
                 
                    
                    //insert the folder in the tree reports
                    try{
                        reports.insertNodeInto(parent, root, root.getChildCount());
                        
                        // insert the new file into folder in the last position
                        DefaultMutableTreeNode newTree = new DefaultMutableTreeNode(nameR);
                        reports.insertNodeInto(newTree, parent, parent.getChildCount());
                        
                        System.out.println("Carpeta No: "+root.getChildCount()+ " Archivo No."+parent.getChildCount());
                    }catch(Exception e){
                        e.printStackTrace();
                    }  
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //the folder already exists
           try{
               DefaultMutableTreeNode newTree = new DefaultMutableTreeNode(nameR);
               reports.insertNodeInto(newTree, parent, parent.getChildCount());
               System.out.println("Archivo No. "+parent.getChildCount());
           }catch(Exception e){
               e.printStackTrace();
           }
           
        }
        
        
       
    }
    
    public void addFolder(DefaultMutableTreeNode parent){
        //insert the folder in the tree reports
        try{
            reports.insertNodeInto(parent, root, root.getChildCount());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void addTree(String nameR, DefaultMutableTreeNode parent){
        try{
            DefaultMutableTreeNode newTree = new DefaultMutableTreeNode(nameR);
            reports.insertNodeInto(newTree, parent, parent.getChildCount());
            System.out.println("Archivo No. "+parent.getChildCount());
           }catch(Exception e){
               e.printStackTrace();
           }
    
    }
    
    public DefaultMutableTreeNode getTrees(){
       return this.trees;         
    }


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyze;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnNext;
    private javax.swing.JMenuItem jMNewF;
    private javax.swing.JMenuItem jMOpenFile;
    private javax.swing.JMenuItem jMSaveAsF;
    private javax.swing.JMenuItem jMSaveF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuError;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jlblGraph;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmView;
    private javax.swing.JTabbedPane jtpGraph;
    private javax.swing.JTextField jtxtConsole;
    private javax.swing.JTree reportsT;
    private javax.swing.JScrollPane scrollTree;
    private javax.swing.JTextArea txtFile;
    // End of variables declaration//GEN-END:variables
}
