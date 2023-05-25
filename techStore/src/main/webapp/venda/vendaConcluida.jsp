<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>CADASTRO DO PRODUTO</title>
      <link rel="stylesheet" href="/style.css">
      <link rel="stylesheet" href="/venda/styleVenda.css">
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
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
        <img src="/assets/lupa.png" class="btnBusca">
      </div>
      <div class="carrinho">
        <a href="/carrinho/carrinho.jsp"><img src="/assets/carrinho.png" alt="Carrinho Compras"></a>
      </div>

      <c:if test="${sessionScope.loggedUser != null}">
        <div class="cadProduto">
          <a href="/cadProduto/cadProduto.jsp"><img src="/assets/pacote.png" alt="Cadastrar Produtos"></a>
        </div>
        <div class="infos">
          <span>${sessionScope.loggedUser}
          </span>
          <a href="/logout">Sair</a>
        </div>
        <div class="profile">
          <a href="/perfil/perfil.jsp"><img src="/assets/perfil.png" alt="perfil"></a>
        </div>
      </c:if>

      <c:if test="${sessionScope.loggedUser == null}">
        <a href="/login/login.jsp">Login</a>
        <div class="profile">
          <a href="/login/login.jsp"><img src="/assets/perfil.png" alt="perfil"></a>
        </div>
      </c:if>
    </div>
  </div>

  <section>

    <h2>
      Compra concluída
   </h2>
   <h3>Por favor escaneie o QR-CODE e realize o pagamento para que ele seja confirmado</h3>
    <div class="content-code">
      <img src="/assets/pix-codigo.png" alt="">
    </div>

    <h3>
      A TECHSTORE AGRADECE À PREFERÊNCIA
    </h3>

    <a href="/find-all-produtos">
      <div class="button-div">
        <p>Voltar ao início</p>
      </div>
    </a>

  </section>


</body>

</html>