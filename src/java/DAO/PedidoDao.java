/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import JDBC.ConnectionFactory;
import Model.Pedido;
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
public class PedidoDao {

    private Connection conexao;

    public PedidoDao() {
        this.conexao = new ConnectionFactory().getConnection();

    }

    public void InserePedido(Pedido ped) {
        String sql = "INSERT INTO pedido(cliente, produto, quantidade,endereco, preco) values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, ped.getCliente());
            stmt.setString(2, ped.getProduto());
            stmt.setInt(3, ped.getQuantidade());
            stmt.setString(4, ped.getEndereco());
            stmt.setDouble(5, ped.getPreco());
            
            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Pedido> getList() {
        List<Pedido> ped = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pd = new Pedido();
                pd.setCliente(rs.getString("cliente"));
                pd.setProduto(rs.getString("produto"));
                pd.setQuantidade(rs.getInt("quantidade"));
                pd.setPreco(rs.getDouble("preco"));
                pd.setId(rs.getLong("id"));
                ped.add(pd);
            }
            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ped;
    }
}
