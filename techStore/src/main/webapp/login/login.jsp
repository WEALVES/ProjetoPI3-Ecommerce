<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>LOGIN</title>
        <link rel="stylesheet" href="/login/login.css">
        <link rel="stylesheet" href="/style.css">
</head>

<body>
    <div class="header_Border">

        <div class="header">
            <h1>Login</h1>
                <div class="Logo">
                    <a href="/"><img src="/assets/logo-techstore/logo.png" alt="logo"></a>
                </div>
        </div>
    </div>

    <form class="form" action="/find-user" method="get" enctype="multipart/form-data">
        <div class="loginBox">
            <h3 style="height: auto; width: auto; color: white; font-size: 20px;">${message}</h3>
            <input type="email" id="email" name="email" class="input" placeholder="EMAIL" autocomplete="off">
            <input type="password" id="senha" name="senha" class="input" placeholder="SENHA">
            <a href="../cadastro/cadastro.jsp" class="linkCad">
                Não tem conta? Crie uma.
            </a>
            <button class="buttonLogin" type="submit">
                ENTRAR
            </button>
        </div>
    </form>
</body>

</html>