<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CADASTRO DO PRODUTO</title>
    <link rel="stylesheet" href="/style.css">
    <link rel="stylesheet" href="http://localhost:8080/cadastro/cadastro.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>
</head>


<body>
    <script type="text/javascript">$("#telefone").mask("000.000.000-00");</script>
    <script type="text/javascript">
        $("#user-cpf").mask("000-000-000.00");
        $("#user-cep").mask("0000-000");
    </script>
    <div class="header_Border">

        <div class="header">
            <h1>Criar conta</h1>
            <div class="header">
                <div class="Logo">
                    <a href="index.jsp"><img src="../LOGO TECHSTORE/LOGOpng.png" alt="logo"></a>
                </div>
            </div>
        </div>
    </div>
    <form class="form" action="/create-user" method="post">
        <div class="loginBox">
            <div class="display-form">
                <div class="row-input">
                    <input type="text" class="input" name="user-name" id="user-name" placeholder="Nome Completo">
                    <input type="email" class="input" name="user-email" id="user-email" placeholder="Email">
                </div>
                <div class="row-input">
                    <input type="password" class="input" name="senha-1" id="senha-1" placeholder="Senha">
                    <input type="password" class="input" name="senha-2" id="senha-2" placeholder="Confirmar senha">
                </div>
                <div class="row-input">
                    <input type="number" class="input" name="user-cpf" id="user-cpf" placeholder="CPF">
                    <input type="date" class="input" name="user-nascimento" id="user-nascimento"
                        placeholder="Data de Nascimento">
                </div>
                <div class="row-input">
                    <input type="nunber" class="input" name="user-cep" id="user-cep" placeholder="CEP">
                    <input type="text" class="input" name="user-endereco" id="user-endereco" placeholder="Endereço">
                </div>  
            </div>
            <a href="/create-user"> cadastrar</a>
            <button class="buttonLogin" type="submit">Cadastrar</button>
        </div>
    </form>


</body>

</html>