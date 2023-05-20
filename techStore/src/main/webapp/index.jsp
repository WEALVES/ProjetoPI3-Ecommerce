<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Site</title>
  <link rel="stylesheet" href="./style.css">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
<div class="header_Border">

  <div class="header">
    <div class="filter" >
      <img src="./assets/option.png" alt="filtro" onclick="clickMenu()">
    </div>
    <div class="Logo">
      <img src="./LOGO TECHSTORE/LOGOpng.png" alt="logo">
    </div>
    <div class="search_Bar">
      <input type="search" class="search" placeholder="Buscar">
      <img src="./assets/lupa.png" class="btnBusca">
    </div>
    <div class="cadProduto">
      <a href="./cadProduto/cadProduto.jsp"><img src="./assets/pacote.png" alt="Cadastrar Produtos"></a>
    </div>
    <div class="profile">
      <a href="./login/login.html"><img src="./assets/perfil.png" alt="perfil" ></a>
    </div>
  </div>
</div>

<div id="menuFilter">

</div>
<section class="main_Screen">

  <div class="block" id="produto-1" ><div><a href="./pagProduto/pagProduto.html"><img src="./assets/pc foda.jpg" style="height: 200px; width: 200px;"></a>
        <c:forEach var="produto" items="${produtos}">
              <tr>
                ${produto.nome}
              </tr>
          </c:forEach>
</div></div>
  <div class="block" id="produto-2"><div><img src="./assets/mouse foda.png"style="height: 200px; width: 200px;"></div></div>
  <div class="block" id="produto-3"><div><img src="./assets/teclado foda.jpg"style="height: 200px; width: 200px;"></div></div>


</section>



<script>
        function clickMenu(){
            if(menuFilter.style.display == 'block'){
                menuFilter.style.display = 'none'
            }

            else{
                menuFilter.style.display = 'block'
            }
        }

    </script>
</body>

</html>