/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import Model.Produtos;
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
public class ProdutosDao {

    private Connection conexao;

    public ProdutosDao() {
        this.conexao = new ConnectionFactory().getConnection();

    }

    public List<Produtos> getList() {
        List<Produtos> produto = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos prod = new Produtos();
                prod.setTipo(rs.getString("tipo"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setFoto(rs.getString("foto"));
                prod.setId(rs.getLong("id"));
                produto.add(prod);
            }
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produto;
    }
}
