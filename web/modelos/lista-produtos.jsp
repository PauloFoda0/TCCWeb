<%@page import="DAO.ProdutosDao"%>
<%@page import="Model.Produtos"%>
<%@page import="java.util.List"%>
<%
    /*ProdutosDao dao = new ProdutosDao();
    List<Produtos> prod = dao.getList();
    for (int i = 0; i < prod.size(); i++) {*/
    for(int i = 0; i < 20; i++) {
%>

<div class="col-sm-3 col-xs-12">
    <div style="background-color: #bdc3c7; padding: 20px; opacity: 0.9; border-radius: 10px; margin-bottom: 20px;">
        <img src="imagens/alcool.jpg" id="idImg" alt="Imagem pode não estar salva" style="height: 200px; width: 100%; border-radius: 10px; margin-bottom: 10px;"/>
        <h4>Nome: <% //prod.get(i).getTipo() %> </h4>
        <h5>Preço: R$<% //prod.get(i).getPreco() %> </h5>
        <button type="button" class="btn btn-primary">Pedir</button>
    </div>
</div>

<%
    }
%>