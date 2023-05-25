<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <a href="/find-all-produtos"><img src="http://localhost:8080/logo-techstore/LOGOpng.png" alt="logo"></a>
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
            <select class="Categoria" id="categoria" name="categoria">
                <option value="Não selecionado">Não definido</option>
                <option value="Placa Mãe">Placa mãe</option>
                <option value="Processador">Processador</option>
                <option value="Memoria Ram">Memória RAM</option>
                <option value="Armazenamento">Armazenamento interno</option>
                <option value="Fonte">Fonte de alimentção</option>
                <option value="Gabinete">Gabinete</option>
                <option value="Roteador">roteador</option>
                <option value="Periférico">Periférico</option>
            </select>
            <input type="text" class="input" name="descricao" id="descricao" placeholder="Descrição">

            <div class="insert-img">
                <label for="file">Choose file</label>
                <input type="file" name="file" id="file">
            </div>

            <button class="buttonLogin" type="submit">Adicionar Produto</button>
        </div>
    </form>
</body>

</html>