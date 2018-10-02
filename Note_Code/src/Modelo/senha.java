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
public class senha {
    private long Idsenha;
    private String programa, usuario, senha;

    public long getIdsenha() {
        return Idsenha;
    }

    public void setIdsenha(long Idsenha) {
        this.Idsenha = Idsenha;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "senha{" + "Idsenha=" + Idsenha + ", programa=" + programa + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
}
