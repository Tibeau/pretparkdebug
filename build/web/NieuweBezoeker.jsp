<%-- 
    Document   : Nieuwe bezoeker
    Created on : 6-mei-2019, 9:38:12
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
        <h1>Nieuwe Bezoekers</h1>
        <form action="MaakServlet" method="get">
         <p>
             <label for="voornaam">Voornaam</label>
             <input type="text" name="Voornaam" id="Voornaam">
         </p>
         <p>
             <label for="achternaamnaam">Achternaam</label>
             <input type="text" name="Achternaam" id="Achternaam">
         </p>
         
         
               
        
        <select name="attractielijst">
            <%String[] attractielijst = {"    ", "minecraft", "VR", "biemer", "hammer", "flash"};
                 for (int i = 0; i < attractielijst.length; i++) { %>
                 <option value= "<%=attractielijst[i]%>"><%=attractielijst[i]%></option>
         <%}%>
        </select> 
        
        <input type="radio" name="pretparknaam" value="BertLand" id="keuze1">
        <label for="keuze1">Bert Land</label>
        <input type="radio" name="pretparknaam" value="PyroWorld" id="keuze2">
        <label for="keuze2">Pyro World</label>
        <input type="radio" name="pretparknaam" value="UnderPark" id="keuze3">
        <label for="keuze3">UnderPark</label>
        <input type="radio" name="pretparknaam" value="FunGarden" id="keuze4">
        <label for="keuze4">Fun Garden</label>

        
        <p><input type="submit" value="Ga door als bezoeker zonder pretparkregistratie" name="bezoeker"></p>
        
         <p><input type="submit" value="Ga door als bezoeker met pretparkregistratie" name="bezoekerP"></p>



        </form>
     
        

            
        <a href="index.jsp">index</a>
    </body>
</html>
