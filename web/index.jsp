<%-- 
    Document   : index
    Created on : 09/06/2017, 10:41:01
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="modelos/cabecalho.jsp" %>
    </head>
    <body style="background: url(imagens/fundo.jpg) no-repeat center top fixed; background-size: cover;">
        <!-- <center>        
            <img src="Imagens/icon.jpg" alt="Nao suportado" class="img-circle" width="483">
        </center> -->
        <div class="container">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4 col-sm-12">
                    <img src="imagens/icon - editado2.jpg" alt="Nao suportado" class="img-circle" width="400">
                </div>
                <div class="col-md-4"></div>
            </div>
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4 col-sm-12">
                    <form action="Login" method="GET" data-toggle="validator" role="form">
                        <div class="form-group">
                            <label for="inputEmail" class="control-label">Email</label>
                            <input requered name="LoginEmail" type="email" class="form-control" placeholder="Digite seu e-mail">
                        </div>              
                        <div class="form-group">
                            <label for="inputPassword" class="control-label">Senha</label>
                            <input requered name="LoginSenha" type="password" class="form-control" placeholder="Digite sua senha">
                        </div>
                        <div class="form-group">
                            <button class="btn btn-lg btn-primary btn-block" type="submit">
                                <center>
                                    Entrar
                                </center>
                            </button>
                            <a href="cadastro.jsp" class="btn btn-lg btn-primary btn-block" type="submit">
                                <center>
                                    Cadastro
                                </center>
                            </a>                
                        </div>
                    </form>
                </div>
                <div class="col-md-4"></div>
            </div>

        </div>
    </body>
</html>
