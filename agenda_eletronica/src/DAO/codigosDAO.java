/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Factory.ConexaoBanco;
import modelo.dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author andrio
 */
public class codigosDAO {
    
    public void Cadastrar(dados pvO) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        Statement stat=con.createStatement();
        
        try{
           String sql;
           
           sql = "insert into agenda(id, dia, hora, assunto)"
                 + "values(null, '" + pvO.getDia() + "','" + pvO.getHora() + "','" + pvO.getAssunto() + "')";
           
           stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir!");
        }finally{
            con.close();
            stat.close();
        }
    }
    
       public ArrayList<dados> buscar() throws SQLException{
        
         Connection con= ConexaoBanco.getConexao();        
         Statement stat=con.createStatement();
         
         try{
             String sql;
             sql = "select * from agenda";
             ResultSet rs= stat.executeQuery(sql);
             ArrayList<dados> cad= new ArrayList<>();
             
             while(rs.next()){
                 dados dad=new dados();
                 dad.setId(rs.getLong("id"));
                 dad.setDia(rs.getString("dia"));
                 dad.setHora(rs.getString("hora"));
                 dad.setAssunto(rs.getString("assunto"));
                 cad.add(dad);
             }
             return cad;
         }catch(SQLException e){
            throw new SQLException("erro ao buscar!!!" + e.getMessage());
         }finally{
             con.close();
             stat.close();
         }
    }
       
         public void alterar(dados d) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update agenda set dia=?,hora=?,assunto=? where id=?");
            
        p.setString(1, d.getDia());
        p.setString(2, d.getHora());
        p.setString(3, d.getAssunto());
        p.setLong(4, d.getId());
        p.execute();
        p.close();

    }
         
         public void deletar (dados dd) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        PreparedStatement p= con.prepareStatement("delete from agenda where id = ?");
        p.setLong(1, dd.getId());
        p.execute();
        p.close();
    }
    
    
}
