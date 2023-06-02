<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ page contentType="text/html; charset=UTF-8" %>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Perfil</title>
        <link rel="stylesheet" href="/perfil/perfil.css">
        <link rel="stylesheet" href="/style.css">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        </div>
    </div>



    <section class="telaPerfil">
        <div class="menuPerfil">

            <div class="fotoPerfil">
                <img src="/assets/fotoUsuario.png">
            </div>
            <div class="nomePerfil">
                <p>
                    Seu Nome
                </p>
            </div>
            <button class="tipoDados" id="perfil" onclick="mostrarPerfil()">

                <img src="/assets/perfil.png">
                <p>Perfil</p>

            </button>
            <button class="tipoDados" id="historico" onclick="mostrarHist()">
                <img src="/assets/listaPedidos.png">
                <p>Pedidos</p>
            </button>

            <a href="/perfil/excluirPerfil.jsp">
                <div class="tipoDados" id="historico">
                    <img src="/assets/trash.png">
                    <p>Apagar conta</p>
                    <input type="hidden" name="cpf-user" value="${sessionScope.cpf}">
                </div>
            </a>
        </div>




        <div class="infoPerfil">
            <h1>Informações do usuario</h1>

            <div class="pb" id="pb">
                <label id="nome">Nome
                    <p class="nome">${sessionScope.loggedUser}</p>
                </label>
                <div class="linha"></div>

                <label id="nome">CPF
                    <p class="nome">${sessionScope.cpf}</p>
                </label>
                <div class="linha"></div>

                <label id="nome">Data de Nascimento
                    <p class="nome">${sessionScope.nascimento}</p>
                </label>
                <div class="linha"></div>

                <label id="nome">Endereço
                    <p class="nome">${sessionScope.endereco}</p>
                </label>
                <div class="linha"></div>

                <label id="nome">CEP
                    <p class="nome">${sessionScope.cep}</p>
                </label>
                <div class="linha"></div>
            </div>

            <div class="hb" id="hb">
                <h1>HISTÓRICO</h1>
                <div class="pedidos">
                    <c:forEach var="produto" items="${historico}">
                        <div class="infos-pedido">
                            <div class="cabecalho">
                                <h3>${produto.nomeProduto}</h3>
                                <h3>${produto.data}</h3>
                            </div>
                            <div class="main">
                                <img src="${produto.imagem}" alt="">
                                <p>Categoria: ${produto.categoria}</p>
                                <p>Marca: ${produto.marca}</p>
                            </div>
                            <div class="column">
                                <div class="valores">
                                    <p>Valor unitário: R$ ${produto.preco}</p>
                                    <p>Quantidade: ${produto.quantidadeVendida}</p>
                                    <p>Total: R$ ${produto.valor}</p>
                                    <p>Tipo de pagamento: ${produto.pagamento}</p>
                                </div>
                                <div class="entrega">
                                    <h3>
                                        Entrega
                                    </h3>
                                    <p>CEP: ${produto.cep}</p>
                                    <p>Endereço: ${produto.endereco}</p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>



                    <!-- private int idVenda;
                    private int idProduto;
                    private String nomeProduto;
                    private String categoria;
                    private String marca;
                    private Double preco;
                    private String descricao;
                    private String imagem;
                    private int quantidadeVendida;
                    private String data;
                    private Double valor;
                    private String cep;
                    private String endereco;
                    private String pagamento; -->
                </div>
                <div class="linha"></div>
            </div>
        </div>
        </div>
    </section>


    <script src="/perfil/script.js" defer> </script>

</body>

</html>