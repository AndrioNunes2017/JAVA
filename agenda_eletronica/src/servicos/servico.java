/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.codigosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.dados;

/**
 *
 * @author andrio
 */
public class servico {
    public void agendar(dados pVO) throws SQLException {
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        pDAO.Cadastrar(pVO);
    }         
    
  public ArrayList<dados> buscar() throws SQLException {
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        return pDAO.buscar();
}   
}
