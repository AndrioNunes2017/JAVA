/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Andrio
 */
public class DAOFactory {
    private static codigosDAO codigo = new codigosDAO();
    
    public static codigosDAO getcodigosDAO(){
        return codigo;
    }
}
