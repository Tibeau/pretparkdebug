<%-- 
    Document   : NieuweAttractie
    Created on : 10-mei-2019, 16:10:52
    Author     : MSI-VR
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
--%>
<link rel="stylesheet" href="java_stijl.css">
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <%out.println(request.getParameter("PretparkNaam"));%>
        </h1>
        
        <form action="MaakServlet" method="get">
         <p>
             <label for="AttractieNaam">AttractieNaam</label>
             <input type="text" name="AttractieNaam" id="AttractieNaam">
         </p>
         <p>
             <label for="AttractieDuur">AttractieDuur</label>
             <input type="text" name="AttractieDuur" id="AttractieDuur">
         </p>
         <p>
             <label for="FotoNaam">FotoNaam</label>
             <input type="text" name="FotoNaam" id="FotoNaam">
         </p>
         <p><input type="submit" value="NieuweAttractie" name="NieuweAttractie"></p>
         
           


        </form>

    </body>
</html>
