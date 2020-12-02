<%-- 
    Document   : Bezoeker
    Created on : 8-mei-2019, 16:59:11
    Author     : MSI-VR
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
--%>
<link rel="stylesheet" href="java_stijl.css">
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page import="fact.it.www.beans.Bezoeker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Bezoeker bezoeker1 = (Bezoeker) request.getAttribute("bezoeker");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bezoeker</h1>
        
        <p><%=bezoeker1%> </p>
    <p>
      
        <%if (bezoeker1.getAantalOpWishlist() == 0){
                    out.println("U heeft geen favoriete attracties aangeduid.");
                }
        else{
        out.println("Uw favoriete attractie is: " + bezoeker1.getWishlist().get(0));
                 }%>
    </p>


        
        <a href="NieuweBezoeker.jsp">terug</a>
    </body>
</html>
