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
import fact.it.www.beans.Pretpark;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *Tibeau Vandenbroeck
 r0740502 
 */
@WebServlet(name = "MaakServlet", urlPatterns = {"/MaakServlet"})
public class MaakServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse 
            response) throws ServletException, IOException {
           
       
            /* TODO output your page here. You may use following sample code. */
            if (request.getParameter("bezoeker") != null){
            String voornaam = request.getParameter("Voornaam");
            String familienaam = request.getParameter("Achternaam");
            String nieuweAttractie = request.getParameter("attractielijst");
            Bezoeker bezoeker1 = new Bezoeker(voornaam, familienaam);
            Bezoeker bezoeker;
            if (!"    ".equals(nieuweAttractie)){
               bezoeker1.voegToeAanWishlist(nieuweAttractie); 
            }
           

           
                    
            request.setAttribute("bezoeker", bezoeker1);
            RequestDispatcher rdBezoeker = request.getRequestDispatcher("Bezoeker.jsp");
            rdBezoeker.forward(request, response);
            }
            else if (request.getParameter("bezoekerP") != null){ 
                String voornaam = request.getParameter("Voornaam");
                String familienaam = request.getParameter("Achternaam");
                String Pnaam = request.getParameter("pretparknaam");
                Bezoeker bezoeker1 = new Bezoeker(voornaam, familienaam);
                Pretpark pretpark1 = new Pretpark(Pnaam);
                String nieuweAttractie = request.getParameter("attractielijst");
            Bezoeker bezoeker;
            if (!"    ".equals(nieuweAttractie)){
               bezoeker1.voegToeAanWishlist(nieuweAttractie); 
            }
            if (Pnaam != null){    
                pretpark1.registreerBezoeker(bezoeker1);
            }
            
             request.setAttribute("Pretpark", pretpark1);
                request.setAttribute("bezoeker", bezoeker1);
            RequestDispatcher rdBezoeker = request.getRequestDispatcher("Bezoeker.jsp");
            rdBezoeker.forward(request, response);
            }
            else if (request.getParameter("NieuwPretpark") != null){
                 String pretparkNaam = (String) request.getAttribute("NaamPretpark"); 
             
             
                 request.setAttribute("PretparkNaam", pretparkNaam);
                 RequestDispatcher rdPretpark = request.getRequestDispatcher("NieuweAttractie.jsp"); 
                 rdPretpark.forward(request, response);
                 
            }
            else if (request.getParameter("NieuweAttractie") != null){ 
                  String attractienaam = request.getParameter("AttractieNaam");
                  int attractieduur = Integer.parseInt(request.getParameter("AttractieDuur"));
                  String fotonaam = request.getParameter("FotoNaam");
                  Attractie attractie1 = new Attractie(attractienaam);
                  Attractie attractie2 = new Attractie("VR");
                  Attractie attractie3 = new Attractie("KingKong");
                  Attractie attractie4 = new Attractie("Boomstammetjes");
                  Attractie attractie5 = new Attractie("Tornado");
                  Pretpark pretpark1 = new Pretpark("PretparkNaam");
               
                
                  attractie1.setNaam(attractienaam);
                  attractie1.setDuur(attractieduur);
                  attractie1.setFoto(fotonaam);
                  pretpark1.voegAttractieToe(attractie1);
                  pretpark1.voegAttractieToe(attractie2);
                  pretpark1.voegAttractieToe(attractie3);
                  pretpark1.voegAttractieToe(attractie4);
                  pretpark1.voegAttractieToe(attractie5);
                  
                  request.setAttribute("Pretpark", pretpark1);
                  request.setAttribute("Attractie", attractie1);
                 RequestDispatcher rdAttractie = request.getRequestDispatcher("Attractie.jsp");  
                 rdAttractie.forward(request, response);
            }
             else if (request.getParameter("NieuwPersoneelslid") != null){ 
                String PVoornaam = request.getParameter("Voornaam");
                String PAchternaam = request.getParameter("Achternaam");
                Personeelslid personeelslid1 = new Personeelslid(PVoornaam, PAchternaam);
                
                
                
                request.setAttribute("Personeelslid", personeelslid1);
                RequestDispatcher rdPersoneelslid = request.getRequestDispatcher("Personeelslid.jsp");  
                rdPersoneelslid.forward(request, response);
            } else if (request.getParameter("persoon") != null){ 
                String familienaam = request.getParameter("Familienaam");
                String voornaam = request.getParameter("Voornaam");
                Persoon persoon1 = new Persoon(voornaam, familienaam);
                
                
                
                request.setAttribute("Persoon", persoon1);
                RequestDispatcher rdpersoon = request.getRequestDispatcher("bevestiging.jsp");  
                rdpersoon.forward(request, response);

           
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
