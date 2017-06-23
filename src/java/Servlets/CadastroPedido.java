/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.PedidoDao;
import Model.Pedido;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paulo Vitor
 */
public class CadastroPedido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cliente = request.getParameter("PedidoCliente");
        String produto = request.getParameter("PedidoProduto");
        String quantidade = request.getParameter("PedidoQuantidade");
        int quantia = Integer.parseInt(quantidade.trim());
        String preco = request.getParameter("PedidoPreco");
        Double valor = Double.parseDouble(preco.trim());
        String endereco = request.getParameter("PedidoEndereco");

        System.out.println("NOME " + cliente + ", PRODUTO " + produto + ""
                + " QUANTIDADE: " + quantia + " VALOR: " + valor + "ENDERECO " + endereco);

        PedidoDao dao = new PedidoDao();
        Pedido pedido = new Pedido();

        pedido.setCliente(cliente);
        pedido.setProduto(produto);
        pedido.setQuantidade(quantia);
        pedido.setPreco(valor);
        pedido.setEndereco(endereco);
        
        dao.InserePedido(pedido);

        RequestDispatcher rd;
        rd = request.getRequestDispatcher("PedidoConcluido.html");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
