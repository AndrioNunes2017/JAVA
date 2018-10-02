/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import Modelo.dados;
import javax.swing.JOptionPane;
import servicos.servico;

/**
 *
 * @author Andrio
 */
public class Adicionar_Codigos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Adicionar_Codigos
     */
    public Adicionar_Codigos() {
        initComponents();
    }

    private void cadastrar_Codigos(){
        try {
            dados dad=new dados();
            
            if(ling.getSelectedItem()=="ARDUINO"){ 
                
                dad.setLing("ARDUINO");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="SQL"){
                
                dad.setLing("SQL");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="JAVA"){
                
                dad.setLing("JAVA");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                } 
                
            }else if(ling.getSelectedItem()=="JAVA SCRIPT"){
                
                dad.setLing("JAVA SCRIPT");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="BAT"){
                
                dad.setLing("BAT");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="PHP"){
                
                dad.setLing("PHP");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="HTML"){
                
                dad.setLing("HTML");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="ANDROID"){
                
                dad.setLing("ANDROID");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                } 
                
            }else if(ling.getSelectedItem()=="PYTHON"){
                
                dad.setLing("PYTHON");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="C"){
                
                dad.setLing("C");
              
                dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else if(ling.getSelectedItem()=="C++"){
                
                dad.setLing("C++");
              
           dad.setAssunto(assunto.getText());
                dad.setCodigo(codigo.getText());
            
                if((assunto.getText().isEmpty()) ||
                (codigo.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                }else{
                
                servico ps = servicos.ServicosFactory.getCodigoServicos();

                ps.cadastrarCodigos(dad);
            
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
                }  
                
            }else{
                JOptionPane.showMessageDialog(null, "VOCE DEVE ESCOLHER O TIPO DE CODIGO");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpar(){
        assunto.setText("");
        codigo.setText("");
        ling.setSelectedItem("SELECIONAR");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        assunto = new javax.swing.JTextField();
        ling = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Adicionar Codigos");

        jLabel1.setText("CODIGO:");

        jLabel2.setText("ASSUNTO:");

        ling.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONAR", "ARDUINO", "SQL", "JAVA", "JAVA SCRIPT", "BAT", "PHP", "HTML", "ANDROID", "PYTHON", "C", "C++", " ", " " }));

        codigo.setColumns(20);
        codigo.setRows(5);
        jScrollPane1.setViewportView(codigo);

        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ling, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assunto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cadastrar_Codigos();
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assunto;
    private javax.swing.JTextArea codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox ling;
    // End of variables declaration//GEN-END:variables
}
