<%@page import="Model.Produtos"%>
<%@page import="DAO.ProdutosDao"%>
<%@page import="java.util.List"%>
<%@page import="javafx.collections.FXCollections"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : TelaPrincipal
    Created on : 11/06/2017, 14:47:58
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
        <title>Tela Principal LP</title>
        <link rel='shortcut icon' href="Imagens/icon.jpg" />
    </head>
    <body style="background-image: linear-gradient(to right, #00FFFF, #7FFFD4, #00FFFF);">
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="TelaPrincipal.jsp"><img style="margin-top: -10px" width="50px" src="Imagens/icon.jpg"></a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="TelaPrincipal.jsp">Home</a></li>
                    <li><a href="SobreLP.html">Sobre a LP</a></li>
                    <li><a href="Pedidos.jsp">Pedidos</a></li>
                </ul>
            </div>
        </nav>
        <br><br><br>
        <div class="container">   
            <div class="row">     
                <%                  
                    ProdutosDao dao = new ProdutosDao();
                    List<Produtos> prod =dao.getList();
                    for (int i = 0; i < prod.size(); i++) {
                %>    
                    <div class="col-sm-4">
                        <img src="<%=prod.get(i).getFoto()%>" style=" height:200px"/>
                        <br>
                        <h4>Nome:<%= prod.get(i).getTipo()%></h4>
                        Preço:<%=prod.get(i).getPreco()%>
                        <button onclick="window.location.href = 'Pedidos.jsp';" type="button" class="btn btn-primary">Pedir</button>
                    </div>
                <%
                    }
                %>   
            </div>               
        </div>
    </div>

</body>
</html>
