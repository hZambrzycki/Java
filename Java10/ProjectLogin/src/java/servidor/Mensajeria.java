/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IDREFDV;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dawmi
 */
public class Mensajeria extends HttpServlet {

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
        
        HttpSession s = request.getSession();
        ConectorBD c = new ConectorBD();
        String option = request.getParameter("option");

       
        
        switch(option) {
            case "vMensajes":
                String nombreStr = request.getParameter("nombre");
                s.setAttribute("nombre", nombreStr);
                ArrayList<Mensaje> listaMensajes = c.listaMensajes(nombreStr);
                s.setAttribute("listaMensajes", listaMensajes);
                s.setAttribute("option", 'a');
                response.sendRedirect("mensajeria.jsp");
                break;
                
                
            case "vMNuevos":
                
                s.setAttribute("option", 'b');
                response.sendRedirect("mensajeria.jsp");
                break;
                
                
            case "eMensaje":
                
                ArrayList<Usuario> listaUsers = c.recuperarUsers();
                s.setAttribute("userList", listaUsers);
                String nombre = request.getParameter("nombre");
                s.setAttribute("nombre", nombre);
               
                
                s.setAttribute("option", 'c');
                response.sendRedirect("mensajeria.jsp");
                break;
                
            case "envMensaje":
               
                String rem = request.getParameter("rem");
                 s.setAttribute("rem", rem);
               
                 String dest = request.getParameter("dest");
                 s.setAttribute("dest", dest);
                
                String texto = request.getParameter("mensaje");
                s.setAttribute("mensaje", texto);
                
                Mensaje m = new Mensaje(rem, dest, texto);
                
                if(c.insertarMensaje(m) == true) {
                    s.setAttribute("option", 'd');
                } else {
                    s.setAttribute("option", 'd');
                }
                response.sendRedirect("mensajeria.jsp");
                break;
                
                
            default:
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
