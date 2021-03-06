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
public class Login extends HttpServlet {

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
        String email = request.getParameter("LoginEmail");
        String senha = request.getParameter("LoginSenha");

        /*UsuarioDao dao = new UsuarioDao();
        List<Usuario> user = FXCollections.observableArrayList(dao.getList());
        for (int i = 0; i < user.size(); i++) {
            if (email.equals(user.get(i).getEmail())) {
                if (Criptografia.criptografar(senha).equals(user.get(i).getSenha())) {
                    RequestDispatcher rd;
                    rd = request.getRequestDispatcher("TelaPrincipal.jsp");
                    rd.forward(request, response);
                }
            } else if (i + 1 == user.size()) {
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("erroLogin.html");
                rd.forward(request, response);
            }
        }*/

        RequestDispatcher rd;
        rd = request.getRequestDispatcher("tela-principal.jsp");
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
