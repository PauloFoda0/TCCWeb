/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Vitor
 */
public class UsuarioDao {

    private Connection conexao;

    public UsuarioDao() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void InsereUsuario(Usuario user) {
        String sql = "INSERT INTO usuario(login, senha, foto) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getFoto());

            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Usuario> getList() {
        List<Usuario> user = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setEmail(rs.getString("login"));
                us.setSenha(rs.getString("senha"));
                us.setFoto(rs.getString("foto"));
                us.setId(rs.getLong("id"));
                user.add(us);

            }
            stmt.close();
            rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
}
