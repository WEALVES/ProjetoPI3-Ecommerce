<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Site</title>
      <link rel="stylesheet" href="/style.css">
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>

<body>
  <div class="header_Border">
    <!-- <a href="/find-all-produtos">Carregar</a> -->
    <div class="header">
      <div class="filter">
        <img src="/assets/option.png" alt="filtro" onclick="clickMenu()">
      </div>
      <div class="Logo">
        <img src="/assets/logo-techstore/logo.png" alt="logo">
      </div>
      <div class="search_Bar">
        <input type="search" class="search" placeholder="Buscar">
        <img src="/assets/lupa.png" class="btnBusca">
      </div>

      <c:if test="${sessionScope.loggedUser != null}">
        <c:if test="${sessionScope.admin == true}" >
          <div class="cadProduto">
            <a href="/cadProduto/cadProduto.jsp"><img src="./assets/pacote.png" alt="Cadastrar Produtos"></a>
          </div>
        </c:if>
        <div class="infos">
          <span>${sessionScope.loggedUser}
          </span>
          <a href="/logout">Sair</a>
        </div>
        <div class="profile">
          <form action="/perfil" method="get">
            <button style="width: 50px; height: 50px; background-color: transparent; border: none;" type="submit">
              <input type="hidden" name="id-cliente" value="${sessionScope.id}">
              <img src="/assets/perfil.png" alt="perfil">
            </button>
          </form>
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

  <div id="menuFilter">

  </div>
  <section class="main_Screen">
    <c:forEach var="produto" items="${produtos}">



      <form action="/search-produto" method="get" class="produto">
        <button type="submit" class="produto-button block">
          <input type="hidden" name="id-produto" value="${produto.id}">
          <p class="categoria-produto">${produto.categoria}</p>
          <div class="content-img">
            <img src="${produto.imagem}" alt="">
          </div>
          <h3>${produto.nome}</h3>
          <p class="preco">R$ ${produto.preco}</p>



        </button>
      </form>



      <c:if test="${sessionScope.admin == true}" >
                        <a href="/cadProduto/cadProduto.jsp"><img class = "alterar" src="./assets/alterar.png" alt="Alterar"</a>
     <form action="/delete-produto" method="post">
                                        <input type="hidden" id="id" name="id" value="${produto.id}">
                                        <button type="submit">Delete</button>
                                    </form>
                         <img class="excluir" src="/assets/excluir.png" alt="">
                         </c:if>

    </c:forEach>


  </section>



  <script>

    function clickMenu() {
      if (menuFilter.style.display == 'block') {
        menuFilter.style.display = 'none'
      }

      else {
        menuFilter.style.display = 'block'
      }
    }

    if (window.location.href == "http://localhost:8080/") {
      window.location.href = "http://localhost:8080/find-all-produtos"
    }


    console.log(window.location.href);
  </script>
</body>

</html>