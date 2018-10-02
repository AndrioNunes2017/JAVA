/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrio Nunes
 */
public class Tabela_Chat {

    private ArrayList<cod_chat> chat;

    public Tabela_Chat() {
        this.chat = new ArrayList<cod_chat>();
    }

    public void carregarTabelaChat() {

        File dir = new File("ArquivosPDV");
        File arquivo = new File("ArquivosPDV/tabela_chat.dat");
        if (!arquivo.exists() || !dir.exists()) //Verificando se existe diretório e arquivo
        {
            try {
                dir.mkdir();
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Tabela_Chat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //leitura do arquivo
        try {
            Scanner arqScn = new Scanner(arquivo);
            while (arqScn.hasNext()) {
                String lineText = arqScn.nextLine();

                String[] boot = lineText.split(";");
                String pergunta = boot[0];
                String resposta = boot[1];

                cod_chat p = new cod_chat(pergunta, resposta);
                this.chat.add(p);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tabela_Chat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void incluirPergunta(cod_chat c){
        String linhaParaGravar = c.toString();
        
        File arquivo = new File("ArquivosPDV/tabela_chat.dat");
       
           try {
            FileWriter f = new FileWriter(arquivo, true);
            PrintWriter buffer = new PrintWriter(f);

            buffer.println(linhaParaGravar);
            buffer.flush();
            buffer.close();

            chat.add(c);
            
            f.close();
            

        } catch (IOException ex) {
            Logger.getLogger(Tabela_Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public cod_chat consultarPergunta(String pergunta) {
        if (chat != null && chat.size() > 0) {
            for (int i = 0; i < chat.size(); i++) {
                if (pergunta.equalsIgnoreCase(chat.get(i).getPergunta())) {
                    return chat.get(i);
                }
            }
        } else {
        }
        return null;
    }

}
