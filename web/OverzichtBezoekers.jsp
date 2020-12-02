<%-- 
    Document   : OverzichtBezoekers
    Created on : 19-mei-2019, 17:06:08
    Author     : MSI-VR
--%>
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
<%@page import="java.util.ArrayList"%>
<%@page import="fact.it.www.beans.Bezoeker"%>
<link rel="stylesheet" href="java_stijl.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ArrayList<Bezoeker> bezoekers =
            (ArrayList<Bezoeker>) session.getAttribute("bezoekers");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Overzicht Bezoekers</h1>

        <%=bezoekers%>
    </body>
</html>
