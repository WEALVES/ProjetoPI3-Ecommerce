<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CADASTRO</title>
    <link rel="stylesheet" href="http://localhost:8080/cadProduto/cadProduto.css">
    <link rel="stylesheet" href="/style.css">
</head>

<body>
    <div class="header_Border">
        <div class="header">
            <h1>Cadastrar produto</h1>
            <div class="Logo">
                <a href="/index.jsp"><img src="http://localhost:8080/logo-techstore/LOGOpng.png" alt="logo"></a>
            </div>
        </div>
    </div>

    <span>${requestScope.message}</span>

    <form class="form" action="/create-produto" method="post" enctype="multipart/form-data">
        <div class="loginBox">
            <input type="text" class="input" name="nome" id="nome" placeholder="Nome do produto">
            <input type="number" class="input" name="preco" id="preco" placeholder="Preço unitário">
            <input type="number" class="input" name="quantidade" id="quantidade" placeholder="Quantidade">
            <input type="text" class="input" name="fabricante" id="fabricante" placeholder="Fabricante">
            <input type="text" class="input" name="marca" id="marca" placeholder="Marca">
            <select class="Categoria">
                <option value="null">Selecionar</option>
                <option value="placa-mae">Placa mãe</option>
                <option value="processador">Processador</option>
                <option value="memoria-ram">Memória RAM</option>
                <option value="armazenamento">Armazenamento interno</option>
                <option value="fonte">Fonte de alimentção</option>
                <option value="gabinete">Gabinete</option>
                <option value="roteador">roteador</option>
                <option value="periferico">Periférico</option>
            </select>
            <input type="text" class="input" name="descricao" id="descricao" placeholder="Descrição">

            <input type="file" name="file" id="file">
            <button class="buttonLogin" type="submit">Adicionar Produto</button>
        </div>
    </form>
</body>

</html>