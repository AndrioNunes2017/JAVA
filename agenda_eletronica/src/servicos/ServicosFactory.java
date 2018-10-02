/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author andrio
 */
public class ServicosFactory {
    private static servico codServicos=new servico();
    
    public static servico getCodigoServicos(){
        return codServicos;
    }
}
