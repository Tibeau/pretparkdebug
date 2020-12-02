<%-- 
    Document   : persoon.jsa
    Created on : 7-jun-2019, 10:50:15
    Author     : MSI-VR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Persoon</h1>
        
        <form action="MaakServlet" method="get">
         <p>
             <label for="familienaam">Familienaam</label>
             <input type="text" name="Familienaam" id="Familienaam">
         </p>
            <%String[] voornaamlijst = {"Lien", "Line", "Elien", "Leen"};
                  { %>
                  
       <p> <input type="radio" name="Voornaam" value="<%=voornaamlijst[0]%>" id="keuze1">
        <label for="keuze1"><%=voornaamlijst[0]%></label></p>
        <p><input type="radio" name="Voornaam" value="<%=voornaamlijst[1]%>" id="keuze2">
       <label for="keuze2"><%=voornaamlijst[1]%></label></p>
        <p><input type="radio" name="Voornaam" value="<%=voornaamlijst[2]%>" id="keuze3">
       <label for="keuze3"><%=voornaamlijst[2]%></label></p>
        <p><input type="radio" name="Voornaam" value="<%=voornaamlijst[3]%>" id="keuze4">
       <label for="keuze4"><%=voornaamlijst[3]%></label></p>
        <%}%>
        
        <p><input type="submit" value="Ga verder" name="persoon"></p>


        </form>
        
          <a href="index.jsp">index</a>
    </body>
</html>
