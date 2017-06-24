<%-- 
    Document   : TelaPrincipal
    Created on : 11/06/2017, 14:47:58
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="modelos/cabecalho.jsp" %>
    </head>
    <body style="background-image: linear-gradient(to right, #00FFFF, #7FFFD4, #00FFFF);">
        <%@include file="modelos/menu.jsp" %>
        <br><br><br>
        <div class="container">   
            <div class="row">                        
                <%@include file="modelos/lista-produtos.jsp" %>  
            </div>               
        </div>
    </body>
</html>
