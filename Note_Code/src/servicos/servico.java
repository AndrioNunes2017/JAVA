/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.codigosDAO;
import Modelo.acesso;
import Modelo.dados;
import Modelo.lembrete;
import Modelo.senha;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Andrio
 */
public class servico {
    //Chama as funçoes de codigosDAO
    //CADASTRAR    
    
       public void cadastrarCodigos(dados pVO) throws SQLException {
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        pDAO.Cadastrar_Cod(pVO);
    }         
    
       public void cadastrarLembretes(lembrete leO) throws SQLException {
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        pDAO.Cadastrar_Lem(leO);
    }
       
       public void cadastrarSenha(senha se0) throws SQLException {
         codigosDAO pDAO = DAOFactory.getcodigosDAO();
         pDAO.Cadastrar_Sen(se0);
       }
       
       public void cadastrarActive(acesso ac0) throws SQLException {
         codigosDAO pDAO = DAOFactory.getcodigosDAO();
         pDAO.Active(ac0);
       }
       
    //BUSCAR
        public ArrayList<dados> buscarCodigos() throws SQLException {
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        return pDAO.buscar_Cod();
    }
        
        public ArrayList<lembrete> buscarLembretes() throws SQLException{
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        return pDAO.buscar_Lem();    
    }
    
        public ArrayList<senha> buscarSenha() throws SQLException{
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        return pDAO.buscar_sen();
    }
        
        public ArrayList<acesso> buscarActive() throws SQLException{
        codigosDAO pDAO = DAOFactory.getcodigosDAO();
        return pDAO.buscar_Active();
    }
}
