<%-- 
    Document   : bevestiging
    Created on : 7-jun-2019, 11:13:39
    Author     : MSI-VR
--%>
<%@page import="fact.it.www.beans.Persoon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Persoon persoon1 = (Persoon) request.getAttribute("Persoon");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Dit is de nieuwe persoon:</p>
        <h1> <%=persoon1%> </h1>
        
        <a href="persoon.jsp">Terug naar registratie persoon</a>
    </body>
</html>
