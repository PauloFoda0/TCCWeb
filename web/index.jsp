<%-- 
    Document   : index
    Created on : 09/06/2017, 10:41:01
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
        <title>Login LP</title>
        <link rel='shortcut icon' href="Imagens/icon.jpg" />
    </head>
    <body background="Imagens/fundo.jpg">    
    <center>        
        <img src="Imagens/icon.jpg" alt="Nao suportado" class="img-circle" width="483">
    </center>
    <div class="container">
        <div class=" col-md-offset-5 col-md-3">  
            <form action="Login" method="GET" data-toggle="validator" role="form">
                <div class="form-group">
                    <label for="inputEmail" class="control-label">Email</label>
                    <input name="LoginEmail" class="form-control" placeholder="Digite seu E-mail" type="email">
                </div>              
                <div class="form-group">
                    <label for="inputPassword" class="control-label">Senha</label>
                    <input name="LoginSenha" type="password" class="form-control" placeholder="Digite sua Senha...">
                </div>
                <div class="form-group">
                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        <center>
                            Entrar
                        </center>
                    </button>
                    <a href="Cadastro.jsp" class="btn btn-lg btn-primary btn-block" type="submit">
                        <center>
                            Cadastro
                        </center>
                    </a>                
                </div>
            </form>
        </div>    
    </div>
</body>
</html>
