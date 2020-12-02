<%-- 
    Document   : NieuwPersoneelslid
    Created on : 18-mei-2019, 15:56:17
    Author     : MSI-VR
--%>
/*
 *Tibeau Vandenbroeck
 r0740502 
 */
<link rel="stylesheet" href="java_stijl.css">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nieuw Persoonslid</h1> 
        <form action="MaakServlet" method="get">
         <p>
             <label for="voornaam">Voornaam</label>
             <input type="text" name="Voornaam" id="Voornaam">
         </p>
         <p>
             <label for="achternaamnaam">Achternaam</label>
             <input type="text" name="Achternaam" id="Achternaam">
         </p>
         <p><input type="submit" value="NieuwPersoneelslid" name="NieuwPersoneelslid"></p>
     </form>
        
        
    </body>
</html>
