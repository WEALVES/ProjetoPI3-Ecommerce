<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pagamento</title>
        <link rel="stylesheet" href="formaPagamento.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
    <div class="header_Border">
            <div class="header">
                <div class="Logo">
                    <a href="/index.jsp"><img  class ="img" src="/assets/logo-techstore/logo.png" alt="logo"></a>
                </div>
        </div>
    </div>

  <h3 class="titulo"><img class="img2" src="../assets/CarrinhoPedidos.png">Meu Carrinho</h3>

<div class="container">

  <div class="row  justify-content-evenly" >
    <div class="col-8"id="fundoTabela">

    <table class="table">
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
          <th scope="row"><div><div><img src="../assets/mouse foda.png"style="height: 100px; width: 100px;"></div></div></th>
          <td>Mouse Redragon MK 1</td>
          <td>1</td>
          <td>R$: 150</td>
        </tr>
      </tbody>
    </table>

    <div class="frete">
    calcule frete
        <input type="email" id="email" name="email" class="input" placeholder="CEP" autocomplete="off">
     <button type="button" class="btn btn-outline-danger">OK</button>
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
          <td>1 Produto</td>
          <td>R$ 500</td>
        </tr>
               <tr>
                  <td>Frete</td>
                  <td>R$: 15</td>
                </tr>
                <tr>
                  <td>Valor Total</td>
                  <td>R$: 515</td>
                </tr>
      </tbody>
    </table>
              <a href="./formaPagamento.html"><button type="button" class="btn btn-danger">Continuar</button></a>
        </div>

  </div>
</div>
</body>

</html>