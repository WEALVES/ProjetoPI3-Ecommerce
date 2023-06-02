<html lang="en">

<head>
 <meta charset="UTF-8">
  <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>LOGIN</title>
      <link rel="stylesheet" href="/carrinho/carrinho.css">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>

<body>
  <div class="header_Border">
    <div class="header">
      <div class="Logo">
        <a href="/find-all-produtos">
          <img style="width: 100%; height: 100%;" class="img" src="/assets/logo-techstore/logo.png" alt="logo">
        </a>
      </div>
    </div>
  </div>



  <h3>Meu Carrinho</h3>
  <form action="/confirm-buy" method="get">
    <div class="container text-center">

      <div class="row  justify-content-evenly">
        <div class="col-8" id="fundoTabela">

          <table class="table ">
            <thead>
              <tr>
                <th scope="col">Produto</th>
                <th scope="col"></th>
                <th scope="col">Quantidade</th>
                <th scope="col">Preco </th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">
                  <div>
                    <div><img src="${produto.imagem}" style="height: 100px; width: 100px;"></div>
                  </div>
                </th>
                <td>${produto.nome}</td>
                <td>
                  ${quantidadeSelecionada}
                </td>
                <td>${produto.preco}</td>
              </tr>
            </tbody>
          </table>
        <div class="frete"
            style="width: 60%; display: flex; flex-direction: row; align-items: center; justify-content: space-around;">
            <p style="width: 150px">
              Calcule o frete
            </p>
            <input type="text" id="cep" name="cep" class="input" placeholder="CEP" autocomplete="off">
          </div>
          <div class="frete"
            style="width: 60%; display: flex; flex-direction: row; align-items: center; justify-content: space-around;">
            <p style="width: 150px">
              Endereço
            </p>
            <input type="text" id="endereco" name="endereco" class="input" placeholder="Endereço" autocomplete="off">
          </div>
        </div>
        <div class="col-3" id="fundoResumo">

          <table class="table ">
            <thead>
              <tr>
                <th scope="col">Resumo dos Produtos</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>Produto</td>
                <td>R$ ${produto.preco}</td>
              </tr>
              <tr>
                <td>Frete</td>
                <td>R$: 15</td>
              </tr>
              <tr>
                <td>Valor Total</td>
                <td>R$ ${valorCarrinho + 15}</td>
              </tr>
            </tbody>
          </table>
          <div style="display: flex;flex-direction: row-reverse; justify-content: space-between; width: 100%;">
            <button type="submit" class="btn btn-success">Continuar</button>
            <a href="/find-all-produtos" style="width: 100%;">
              <button type="button" class="btn btn-danger">Cancelar</button>
            </a>
          </div>
        </div>


      </div>
    </div>
    <div class="area-pagamento">
      <h2>Formas de pagamento disponíveis:</h2>
      <div>
        <div class="ui_checkRadio">
          <input type="checkbox" name="pix-pay" id="pix-pay" checked />
          <label for="pix-pay">PIX</label>
        </div>
        <div class="row-pag">
          <label for="">Cartão de crédito (indiponível)</label>
        </div>
      </div>
    </div>
    <input type="hidden" name="id-produto" value="${produto.id}">
    <input type="hidden" name="id-cliente" value="${sessionScope.id}">
    <input type="hidden" name="quantidade-selecionada" value="${quantidadeSelecionada}">
    <input type="hidden" name="nome-cliente" value="${sessionScope.loggedUser}">
    <input type="hidden" name="valor-total" value="${valorCarrinho + 15}">
  </form>

</body>
<script>
</script>


</html>