<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Produto</title>
            <link rel="stylesheet" href="/style.css">
            <link rel="stylesheet" href="/pageProduto/pagProduto.css">
</head>

<body>
    <div class="header_Border">
        <div class="header">
            <div class="Logo">
                <a href="/find-all-produtos">
                    <img src="/assets/logo-techstore/logo.png" alt="logo">
                </a>
            </div>
            <div class="search_Bar">
                <input type="search" class="search" placeholder="Buscar">
                <img src="./assets/lupa.png" class="btnBusca">
            </div>
            <div class="carrinho">
                <a href="./carrinho/carrinho.jsp"><img src="./assets/carrinho.png" alt="Carrinho Compras"></a>
            </div>

            <c:if test="${sessionScope.loggedUser != null}">
                <div class="cadProduto">
                    <a href="./cadProduto/cadProduto.jsp"><img src="./assets/pacote.png" alt="Cadastrar Produtos"></a>
                </div>
                <div class="infos">
                    <span>${sessionScope.loggedUser}
                    </span>
                    <a href="/logout">Sair</a>
                </div>
                <div class="profile">
                    <a href="./perfil/perfil.jsp"><img src="./assets/perfil.png" alt="perfil"></a>
                </div>
            </c:if>

            <c:if test="${sessionScope.loggedUser == null}">
                <a href="/login/login.jsp">Login</a>
                <div class="profile">
                    <a href="/login/login.jsp"><img src="./assets/perfil.png" alt="perfil"></a>
                </div>
            </c:if>



        </div>
    </div>


    <section class="main_Screen">
        <div class="imgProduto">
            <img src="${produto.imagem}" alt="${produto.nome}">
        </div>
        <div class="infoProduto">
            <h1>
                ${produto.nome}
            </h1>
            <p>R$ ${produto.preco}
            </p>
            <form action="/buy-product">
                <input type="hidden" name="id-produto" value="${produto.id}">
                <button type="submit" class="botaoCompra">
                    Comprar
                </button>

                <input style="height: auto;" type="number" name="quantidade-selecionada" value="1"> 
                <span style="height: 40px; color: red;">
                    ${messageQuantidade}
                </span>
            </form>
            </a>
        </div>
        <div class="descricao">
            <p>
                ${produto.descricao}
            </p>
        </div>
    </section>



</body>

</html>