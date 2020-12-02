<%-- 
    Document   : Personeelslid
    Created on : 18-mei-2019, 16:09:43
    Author     : MSI-VR
--%>
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
<link rel="stylesheet" href="java_stijl.css">
<%@page import="fact.it.www.beans.Personeelslid"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Personeelslid personeelslid1 = (Personeelslid) request.getAttribute("Personeelslid");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Personeelslid</h1>
        
        
        <p>Welkom <%=personeelslid1%></p>
        
    </body>
</html>
