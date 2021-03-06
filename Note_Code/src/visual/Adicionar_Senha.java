/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import Modelo.senha;
import javax.swing.JOptionPane;
import servicos.servico;

/**
 *
 * @author Andrio
 */
public class Adicionar_Senha extends javax.swing.JInternalFrame {

    /**
     * Creates new form Adicionar_Senha
     */
    public Adicionar_Senha() {
        initComponents();
    }

    private void AdcSenha(){
        try {            
            senha sen = new senha();
            
            if(tipo.getSelectedItem() == "DIVERSOS"){
                
                 sen.setPrograma("DIVERSOS");
                 sen.setUsuario(usuario.getText());
                 sen.setSenha(senha.getText());            
                    if((usuario.getText().isEmpty()) || senha.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                    }else{
                
                        servico ps = servicos.ServicosFactory.getCodigoServicos();
                
                        ps.cadastrarSenha(sen);
                
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
            }
                
            }else if(tipo.getSelectedItem() == "PROGRAMA"){
                
                 sen.setPrograma("PROGRAMA");
                 sen.setUsuario(usuario.getText());
                 sen.setSenha(senha.getText());            
                    if((usuario.getText().isEmpty()) || senha.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                    }else{
                
                        servico ps = servicos.ServicosFactory.getCodigoServicos();
                
                        ps.cadastrarSenha(sen);
                
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
            }
                
            }else if(tipo.getSelectedItem() == "SITES"){
                     
                 sen.setPrograma("SITES");
                 sen.setUsuario(usuario.getText());
                 sen.setSenha(senha.getText());            
                    if((usuario.getText().isEmpty()) || senha.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Os campos nao podem retornar Vazios");
                    }else{
                
                        servico ps = servicos.ServicosFactory.getCodigoServicos();
                
                        ps.cadastrarSenha(sen);
                
                JOptionPane.showMessageDialog(
                    rootPane, 
                    "cadastrado com sucesso!");
            }
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
        tipo.setSelectedItem("DIVERSOS");
        usuario.setText("");
        senha.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        tipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Adicionar Senha");

        jLabel1.setText("TIPO:");

        jLabel2.setText("USUARIO:");

        jLabel3.setText("SENHA:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIVERSOS", "PROGRAMA", "SITES" }));

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usuario)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdcSenha();
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox tipo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
