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
public class lembrete {
    
    private long Idlembrete;
    private String dia, hora, assunto;

    public long getIdlembrete() {
        return Idlembrete;
    }

    public void setIdlembrete(long Idlembrete) {
        this.Idlembrete = Idlembrete;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "lembrete{" + "Idlembrete=" + Idlembrete + ", dia=" + dia + ", hora=" + hora + ", assunto=" + assunto + '}';
    }
    
}
