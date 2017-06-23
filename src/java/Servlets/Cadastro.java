 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.UsuarioDao;
import Model.Criptografia;
import Model.Usuario;
import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paulo Vitor
 */
public class Cadastro extends HttpServlet {

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

        String email = request.getParameter("CadastroEmail");
        String senha = request.getParameter("CadastroSenha");
        String foto = "C:\\Users\\Paulo Vitor\\Documents\\NetBeansProjects\\ProdutoDeLimpeza\\web\\Imagens\\Cloro.jpg";

        
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> user = FXCollections.observableArrayList(dao.getList());
        for (int i = 0; i < user.size(); i++) {
            if (email.equals(user.get(i).getEmail())||
                    email.isEmpty()||senha.isEmpty()){
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("FalhaCad.html");
                rd.forward(request, response);
            } else if(i == (user.size() - 1)) {
                Usuario usuario = new Usuario();
                usuario.setEmail(email);
                usuario.setSenha(Criptografia.criptografar(senha));
                usuario.setFoto(foto);
                dao.InsereUsuario(usuario);

                RequestDispatcher rd;
                rd = request.getRequestDispatcher("CadastroConcluido.html");
                rd.forward(request, response);
            }
        }
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
