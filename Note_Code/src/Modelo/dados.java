/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andrio
 */
public class dados {
    
    private long idCodigo;
    private String ling;
    private String assunto;
    private String codigo;

    public dados() {
    }

    public long getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(long idCodigo) {
        this.idCodigo = idCodigo;
    }    
    
    public String getLing() {
        return ling;
    }

    public void setLing(String ling) {
        this.ling = ling;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "dados{" + "idCodigo=" + idCodigo + ", ling=" + ling + ", assunto=" + assunto + ", codigo=" + codigo + '}';
    }
}
