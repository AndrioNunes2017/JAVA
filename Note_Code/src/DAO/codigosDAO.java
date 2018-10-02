/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexaoBanco;
import Modelo.acesso;
import Modelo.dados;
import Modelo.lembrete;
import Modelo.senha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Andrio
 */
public class codigosDAO {
    
    // ADICIONANDO DADOS NO BANCO
    
    public void Cadastrar_Cod(dados pvO) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        Statement stat=con.createStatement();
        
        try{
           String sql;
           
           sql = "insert into TB_codigos(idCodigo, lign, assunto, codigo)"
                 + "values(null, '" + pvO.getLing() + "','" + pvO.getAssunto() + "','" + pvO.getCodigo() + "')";
           
           stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir!");
        }finally{
            con.close();
            stat.close();
        }
    }
    
    public void Cadastrar_Lem(lembrete leO) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        Statement stat=con.createStatement();
        
        try{
           String sql;
           
           sql = "insert into TB_lembretes(Idlembrete, dia, hora, assunto)"
                 + "values(null, '" + leO.getDia() + "','" + leO.getHora() + "','" + leO.getAssunto() + "')";
           
           stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir!");
        }finally{
            con.close();
            stat.close();
        }
    }
    
    public void Cadastrar_Sen(senha seO) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        Statement stat=con.createStatement();
        
        try{
           String sql;
           
           sql = "insert into TB_senha(Idsenha, programa, usuario, senha)"
                 + "values(null, '" + seO.getPrograma() + "','" + seO.getUsuario() + "','" + seO.getSenha() + "')";
           
           stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir!");
        }finally{
            con.close();
            stat.close();
        }
    } 
    
    public void Active(acesso acO) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        Statement stat=con.createStatement();
        
        try{
           String sql;
           
           sql = "insert into TB_login(Id, usuario, senha)"
                 + "values(null, '" +  acO.getUsuario() + "','" + acO.getSenha() + "')";
           
           stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir!");
        }finally{
            con.close();
            stat.close();
        }
    }
        
    // BUSCAR DADOS EM TABELAS
    
      public ArrayList<dados> buscar_Cod() throws SQLException{
        
         Connection con= ConexaoBanco.getConexao();        
         Statement stat=con.createStatement();
         
         try{
             String sql;
             sql = "select * from TB_codigos";
             ResultSet rs= stat.executeQuery(sql);
             ArrayList<dados> cad= new ArrayList<>();
             
             while(rs.next()){
                 dados dad=new dados();
                 dad.setIdCodigo(rs.getLong("idCodigo"));
                 dad.setLing(rs.getString("lign"));
                 dad.setAssunto(rs.getString("assunto"));
                 dad.setCodigo(rs.getString("codigo"));
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
      
      public ArrayList<lembrete> buscar_Lem() throws SQLException{
        
         Connection con= ConexaoBanco.getConexao();        
         Statement stat=con.createStatement();
         
         try{
             String sql;
             sql = "select * from TB_lembretes";
             ResultSet rs= stat.executeQuery(sql);
             ArrayList<lembrete> cad= new ArrayList<>();
             
             while(rs.next()){
                 lembrete le=new lembrete();
                 le.setIdlembrete(rs.getLong("Idlembrete"));
                 le.setDia(rs.getString("dia"));
                 le.setHora(rs.getString("hora"));
                 le.setAssunto(rs.getString("assunto"));
                 cad.add(le);
             }
             return cad;
         }catch(SQLException e){
            throw new SQLException("erro ao buscar!!!" + e.getMessage());
         }finally{
             con.close();
             stat.close();
         }
    }
     
     public ArrayList<senha> buscar_sen() throws SQLException{
        
         Connection con= ConexaoBanco.getConexao();        
         Statement stat=con.createStatement();
         
         try{
             String sql;
             sql = "select * from TB_senha";
             ResultSet rs= stat.executeQuery(sql);
             ArrayList<senha> cad= new ArrayList<>();
             
             while(rs.next()){
                 senha se=new senha();
                 se.setIdsenha(rs.getLong("Idsenha"));
                 se.setPrograma(rs.getString("programa"));
                 se.setUsuario(rs.getString("usuario"));
                 se.setSenha(rs.getString("senha"));
                 cad.add(se);
             }
             return cad;
         }catch(SQLException e){
            throw new SQLException("erro ao buscar!!!" + e.getMessage());
         }finally{
             con.close();
             stat.close();
         }
    }    
     
     public ArrayList<acesso> buscar_Active() throws SQLException{
        
         Connection con= ConexaoBanco.getConexao();        
         Statement stat=con.createStatement();
         
         try{
             String sql;
             sql = "select * from TB_login";
             ResultSet rs= stat.executeQuery(sql);
             ArrayList<acesso> cad= new ArrayList<>();
             
             while(rs.next()){
                 acesso se=new acesso();
                 se.setId(rs.getLong("Id"));
                 se.setUsuario(rs.getString("usuario"));
                 se.setSenha(rs.getString("senha"));
                 cad.add(se);
             }
             return cad;
         }catch(SQLException e){
            throw new SQLException("erro ao buscar!!!" + e.getMessage());
         }finally{
             con.close();
             stat.close();
         }
    }
     
     //DELETA DADOS EM TABELAS
     
     public void deletar_Cod(dados dd) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        PreparedStatement p= con.prepareStatement("delete from TB_codigos where idCodigo = ?");
        p.setLong(1, dd.getIdCodigo());
        p.execute();
        p.close();
    }
     
    public void deletar_Lem(lembrete len) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        PreparedStatement p= con.prepareStatement("delete from TB_lembretes where Idlembrete = ?");
        p.setLong(1, len.getIdlembrete());
        p.execute();
        p.close();
    } 
     
    public void deletar_Sen(senha sen) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        PreparedStatement p= con.prepareStatement("delete from TB_senha where Idsenha = ?");
        p.setLong(1, sen.getIdsenha());
        p.execute();
        p.close();
    }
    
    public void deletar_Active(acesso ac) throws SQLException{
        Connection con= ConexaoBanco.getConexao();
        
        PreparedStatement p= con.prepareStatement("delete from TB_login where Id = ?");
        p.setLong(1, ac.getId());
        p.execute();
        p.close();
    }
    
    //ALTERANDO DADOS DA TABELA
    
    public void alterar_Cod(dados d) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update TB_codigos set lign=?,assunto=?,codigo=? where idCodigo=?");
            
        p.setString(1, d.getLing());
        p.setString(2, d.getAssunto());
        p.setString(3, d.getCodigo());
        p.setLong(4, d.getIdCodigo());
        p.execute();
        p.close();

    }
         
    public void alterar_lem(lembrete d) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update TB_lembretes set dia=?,hora=?,assunto=? where Idlembrete=?");
            
        p.setString(1, d.getDia());
        p.setString(2, d.getHora());
        p.setString(3, d.getAssunto());
        p.setLong(4, d.getIdlembrete());
        p.execute();
        p.close();

    }
    
    public void alterar_sen(senha d) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update TB_senha set programa=?,usuario=?,senha=? where Idsenha=?");
            
        p.setString(1, d.getPrograma());
        p.setString(2, d.getUsuario());
        p.setString(3, d.getSenha());
        p.setLong(4, d.getIdsenha());
        p.execute();
        p.close();

    }
 
    public void alterar_Active(acesso ac) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement p = con.prepareStatement("update TB_login set usuario=?,senha=? where Id=?");
            
        p.setString(1, ac.getUsuario());
        p.setString(2, ac.getSenha());
        p.setLong(3, ac.getId());
        p.execute();
        p.close();

    }
    
}

