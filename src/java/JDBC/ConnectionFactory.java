/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paulo Vitor
 */
public class ConnectionFactory {

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            DriverManager.registerDriver(new org.postgresql.Driver());
            String usuario = "postgres"; //Nome do Usuario do BD
            String senha = "paulo"; //Senha do BD
            String nomeBanco = "produtos"; //Nome do Banco de Dados
            String EnderecoServer = "localhost"; //Localhost do Server
            connection = DriverManager.getConnection("jdbc:postgresql://" + EnderecoServer + "/" + nomeBanco, usuario, senha);
        } catch (SQLException e) {
            System.out.println("ERRO, não abre conexao");
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            System.out.println("INICIO DO ERRO");
            e.printStackTrace();
            System.out.println("FIM DO ERRO");

        }
        return connection;
    }
}
