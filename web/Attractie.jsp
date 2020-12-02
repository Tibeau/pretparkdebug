<%-- 
    Document   : Attractie
    Created on : 18-mei-2019, 15:14:31
    Author     : MSI-VR
--%>
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
<link rel="stylesheet" href="java_stijl.css">
<%@page import="fact.it.www.beans.Pretpark"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Pretpark Pretpark1 = (Pretpark) request.getAttribute("PretparkNaam");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Attractie</h1>
        
        <p>
        <%out.println(Pretpark1.getAttracties());%>
        </p>
        
        <a href="index.jsp">index</a>
    </body>
</html>
