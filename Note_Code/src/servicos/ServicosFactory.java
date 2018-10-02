/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Andrio
 */
public class ServicosFactory {
    private static servico codigoServicos=new servico();
    
    public static servico getCodigoServicos(){
        return codigoServicos;
    }
}
