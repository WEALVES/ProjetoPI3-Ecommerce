<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Administrador</title>
        <link rel="stylesheet" href="administrador.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
    <div class="header_Border">
            <div class="header">
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
                          <form action="/perfil" method="get">
                            <button style="width: 50px; height: 50px;" type="submit">
                              <input type="hidden" name="id-cliente" value="${sessionScope.id}">
                              <img src="../assets/perfil.png" alt="perfil">
                            </button>
                          </form>
                        </div>
                      </c:if>
        </div>
    </div>



<div class="container">
     <div class="novo"><a href="../pageProduto/pagProduto.jsp"><button type="button" id="new" class="btn btn-success">Adicionar novo Produto</button></a>
</div>
  <div class="row  justify-content-evenly" >
    <div class="col-12"id="fundoTabela">

    <table class="table">
      <thead>
        <tr>
          <th scope="col">Nome</th>
          <th scope="col">Marca</th>
          <th scope="col">Quantidade</th>
          <th scope="col">Preco</th>
          <th scope="col">Fabricante</th>
          <th scope="col">Categoria</th>
          <th scope="col">Descricao</th>
        </tr>
      </thead>
      <tbody>
        <tr>
         <td>Mouse Redragon MK 1</td>
         <td>1</td>
         <td>R$: 150</td>
         <td>Mouse Redragon MK 1</td>
         <td>1</td>
         <td>R$: 150</td>
         <td>R$: 150</td>
        </tr>
      </tbody>
    </table>
    </div>
    </div>

  </div>
</div>
</body>

</html>