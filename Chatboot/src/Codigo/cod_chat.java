/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.nio.charset.Charset;

/**
 *
 * @author Andrio Nunes
 */
public class cod_chat {

    private String pergunta, resposta;

    public cod_chat() {
    }

    public cod_chat(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String adc(String per, String res) {
    new Tabela_Chat().incluirPergunta(new cod_chat(per, res));
        return "Obrigado por me ensinar";
    }
    
    @Override
    public String toString() {
        return pergunta +";"+ resposta;
    }
}
