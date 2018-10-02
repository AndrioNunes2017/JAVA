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
 * @author Andrio
 */
public class ConexaoBanco {
    
    private static String URL="jdbc:mysql:///DB_Dados";
    private static String USUARIO="";
    private static String SENHA="";
    
    
    public static Connection getConexao() throws SQLException{
        
        Connection connect = null;
        
        try {
            connect = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar! " + e.getMessage());
        }
        return connect;
    }
    
}
