/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.*;

/**
 *
 * @author leticia
 */
public class ModuloConexao {
    // Método responsável por estabelecer a conexão com o banco
    
    public static Connection conector(){
        Connection conexao = null;
      
        String driver = "com.mysql.cj.jdbc.Driver"; // Conector para workbench no linux ubuntu 20.04
        String url = "jdbc:mysql://localhost:3306/NOME DO BANCO";
        String user = "NOME DO USUARIO DO BANCO";
        String password = "SENHA DO BANCO DE DADOS";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }        
    }
    
}
