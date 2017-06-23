<%-- 
    Document   : Cadastro
    Created on : 09/06/2017, 15:20:07
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro LP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
        <link rel='shortcut icon' href="Imagens/icon.jpg" />
    </head>
    <body background="Imagens/fundo1.jpg">
        <center>        
            <img src="Imagens/icon.jpg" alt="Nao suportado" class="img-circle" width="483">
        </center>
        <div class="container">
            <div class=" col-md-offset-5 col-md-3">  
                <form action="Cadastro" method="GET">
                    <div class="form-group">
                        <label for="inputEmail" class="control-label">Email</label>
                        <input requered name="CadastroEmail" class="form-control" placeholder="Cadastre seu E-mail" type="email">
                    </div>              
                    <div class="form-group">
                        <label for="inputPassword" class="control-label">Senha</label>
                        <input requered name="CadastroSenha" type="password" class="form-control" placeholder="Cadastre sua Senha...">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            <center>
                                Cadastrar
                            </center>
                        </button>
                        <a href="index.jsp"  class="btn btn-lg btn-primary btn-block" type="submit">
                            <center>
                                Cancelar
                            </center>
                        </a>    
                    </div>
                </form>
            </div>    
        </div>
    </body>
</html>
