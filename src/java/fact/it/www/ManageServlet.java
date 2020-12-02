/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import fact.it.www.beans.Attractie;
import fact.it.www.beans.Bezoeker;
import fact.it.www.beans.Personeelslid;
import fact.it.www.beans.Persoon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *Tibeau Vandenbroeck
 r0740502 
 */
@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"})
public class ManageServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Personeelslid personeelslid1 = new Personeelslid("Tibeau", "Vandenbroeck");
            Personeelslid personeelslid2 = new Personeelslid("Erik", "Huizen");
            Personeelslid personeelslid3 = new Personeelslid("Yannick", "Van Eck");
            Bezoeker bezoeker1 = new Bezoeker("bert", "hearth");
            bezoeker1.voegToeAanWishlist("minecart");
            bezoeker1.voegToeAanWishlist("hammer");
            Bezoeker bezoeker2 = new Bezoeker("steve", "steven");
            bezoeker2.voegToeAanWishlist("biemer");
            bezoeker2.voegToeAanWishlist("VR");
            Persoon persoon1 = new Persoon("stef", "huizen");
            Attractie attractie1 = new Attractie("hammer");
            attractie1.setVerantwoordelijke(personeelslid1);
            Attractie attractie2 = new Attractie("VR");
            attractie2.setVerantwoordelijke(personeelslid2);
            Attractie attractie3 = new Attractie("minecraft");
            attractie3.setVerantwoordelijke(personeelslid3);
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ManageServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ManageServlet at " + request.getContextPath() + "</h1>");
            out.println("<p>  "+personeelslid1.toString()+"</p>");
            out.println("<p>  "+attractie1.getNaam()+" met "+attractie1.getVerantwoordelijke()+" als verantwoordelijke"+"</p>");
            out.println("</body>");
            out.println("</html>");
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
