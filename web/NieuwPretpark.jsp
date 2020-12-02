<%-- 
    Document   : NieuwPretpark
    Created on : 6-mei-2019, 10:51:09
    Author     : MSI-VR
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
--%>
<link rel="stylesheet" href="java_stijl.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nieuw Pretpark</h1>
        
        <form action="MaakServlet" method="get">
         <p>
             <label for="NaamPretpark">NieuwPretpark</label>
             <input type="text" name="NaamPretpark" id="NaamPretpark">
             
         </p>
         <p><input type="submit" value="NieuwPretpark" name="NieuwPretpark"></p>
         
        </form>
    
        <a href="index.jsp">index</a>
    </body>
</html>
