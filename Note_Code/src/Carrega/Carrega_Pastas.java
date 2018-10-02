/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrega;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrio
 */
public class Carrega_Pastas {
    
     public void carregarTXT() {
        
        File dir = new File("ArquivosTXT");
        File arquivo = new File("ArquivosTXT");
        if (!arquivo.exists() || !dir.exists()){
            try {
                dir.mkdir();
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Carrega_Pastas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public void carregarCodigos() {
    
        File dir = new File("Codigos");
        File arquivo = new File("Codigos");
        if (!arquivo.exists() || !dir.exists()){
            try {
                dir.mkdir();
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Carrega_Pastas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
