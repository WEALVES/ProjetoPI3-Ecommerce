<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perfil</title>
</head>

<style>
  :root {
    font-family: arial;
    --bg-cinza: #8d8d8d;
    --color-1: #313030;
    --color-2: #292929;
    --color-3: #3b3b3b;
    --roxo: #695bf5;
    --roxo-claro: #8180c1;
    --roxo-forte: #682baf;
    --roxo-escuro: #27263d;
    --roxo-perola: #bdbcdd;
  }

  body {
    background-color: var(--color-1);
    color: var(--roxo);
    height: 100%;
  }

  div {
    display: flex;
    flex-direction: column;
    justify-content: center;
    width: 50%;
    height: 100%;
    margin: auto;
    text-align: center;
  }

  button {
    background-color: var(--roxo-escuro);
    border: none;
    cursor: pointer;
    border-radius: 20px;
    width: 200px;
    height: 40px;
    margin: 20px;
    color: #fff;
  }
</style>

<body>
  <header>
    <h2>
      ${sessionScope.loggedUser}
    </h2>
  </header>


  <div>
      <h2>Tem certeza que deseja excluir sua conta?</h2>
      <a href="/find-all-produtos">
        <button>
          Cancelar
        </button></a>
        <a href="/delete-account">
          <button type="">Excluir</button>
        </a>
  </div>
</body>

</html>