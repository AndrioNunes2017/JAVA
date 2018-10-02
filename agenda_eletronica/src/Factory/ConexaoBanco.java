/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andrio
 */
public class ConexaoBanco {
        private static String URL="jdbc:mysql:///db_agenda";
    private static String USUARIO="";
    private static String SENHA="";
    
    public static Connection getConexao() throws SQLException{
        Connection conect=null;
        try{
            conect=DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(SQLException e){
            throw new SQLException("Erro ao conectar! " + e.getMessage());
        }
        return conect;
    }
}
