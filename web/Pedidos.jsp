<%-- 
    Document   : Pedidos
    Created on : 10/06/2017, 18:22:59
    Author     : Paulo Vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
    <title>Pedidos LP</title>   
    <link rel='shortcut icon' href="Imagens/icon.jpg" />
</head>
<body style="background-image: linear-gradient(to right, #00FFFF, #7FFFD4, #00FFFF);">
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="TelaPrincipal.jsp"><img style="margin-top: -10px" width="50px" src="Imagens/icon.jpg"></a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="TelaPrincipal.jsp">Home</a></li>
                <li><a href="SobreLP.html">Sobre a LP</a></li>
                <li class="active"><a href="Pedidos.jsp">Pedidos</a></li>
            </ul>
        </div>
    </nav>
    <br><br><br><br><br><br><br><br>
    <form action="CadastroPedido" method="GET" class="form-horizontal">
        <div class="form-group">
            <label class="col-xs-3 control-label">Cliente</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" name="PedidoCliente" />
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-xs-3 control-label">Produto</label>
            <div class="col-xs-5 selectContainer">
                <select class="form-control" name="PedidoProduto">
                    <option value="">Escolha o Produto desejado</option>
                    <option value="AguaSanitaria">Água Sanitária</option>
                    <option value="Alcool">Alcool</option>
                    <option value="Amaciante">Amaciante</option>
                    <option value="Cloro">Cloro</option>
                    <option value="Desinfetante">Desinfetante</option>
                    <option value="Detergente">Detergente</option>
                    <option value="Hommo">Hommo</option>
                </select>
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-xs-3 control-label">Seu Endereço</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" name="PedidoEndereco" />
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-xs-3 control-label">Valor do Produto</label>
            <div class="col-xs-3 inputGroupContainer">
                <div class="input-group">
                    <input type="text" class="form-control" name="PedidoPreco" />
                    <span class="input-group-addon">$</span>
                </div>
            </div>
        </div>

        <div class="form-group">
            <label class="col-xs-3 control-label">Quantidade</label>
            <div class="col-xs-5 selectContainer">
                <select class="form-control" name="PedidoQuantidade">
                    <option value="">Escolha a Quantidade desejada</option>
                    <option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option>
                    <option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option>
                    <option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option>
                    <option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option>
                    <option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option>
                    <option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option>
                    <option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option>
                    <option value="29">29</option><option value="30">30</option><option value="31">31</option><option value="32">32</option>
                    <option value="33">33</option><option value="34">34</option><option value="35">35</option><option value="36">36</option>
                    <option value="37">37</option><option value="38">38</option><option value="39">39</option><option value="40">40</option>
                    <option value="41">41</option><option value="42">42</option><option value="43">43</option><option value="44">44</option>
                    <option value="45">45</option><option value="46">46</option><option value="47">47</option><option value="48">48</option>
                    <option value="49">49</option><option value="50">50</option><option value="51">51</option><option value="52">52</option>
                    <option value="53">53</option><option value="54">54</option><option value="55">55</option><option value="56">56</option>
                    <option value="57">57</option><option value="58">58</option><option value="59">59</option><option value="60">60</option>
                    <option value="61">61</option><option value="62">62</option><option value="63">63</option><option value="64">64</option>
                    <option value="65">65</option><option value="66">66</option><option value="67">67</option><option value="68">68</option>
                    <option value="69">69</option><option value="70">70</option><option value="71">71</option><option value="72">72</option>
                    <option value="73">73</option><option value="74">74</option><option value="75">75</option><option value="76">76</option>
                    <option value="77">77</option><option value="78">78</option><option value="79">79</option><option value="80">80</option>
                    <option value="81">81</option><option value="82">82</option><option value="83">83</option><option value="84">84</option>
                    <option value="85">85</option><option value="86">86</option><option value="87">87</option><option value="88">88</option>
                    <option value="89">89</option><option value="90">90</option><option value="91">91</option><option value="92">92</option>
                    <option value="93">93</option><option value="94">94</option><option value="95">95</option><option value="96">96</option>
                    <option value="97">97</option><option value="98">98</option><option value="99">99</option><option value="100">100</option> 
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-xs-5 col-xs-offset-3" color="green">
                <button type="submit" class="btn btn-default">Realizar Pedido</button>
            </div>
        </div>
    </form>


</body>
</html>
