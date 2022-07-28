<%-- 
    Document   : index
    Created on : 7 oct, 6:36:40
    Author     : ubaldo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con Scriplets"); %> </li>
            <li>${"HolaMundo con Expression Language (EL)"}</li>
            <li> <%= "HolaMundo con Expresiones" %>   </li>
            <li> <c:out value="HolaMundo con JSTL" /> </li>
        </ul>
    </body>
</html>
