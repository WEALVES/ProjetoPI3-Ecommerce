# ProjetoPI3° Semestre - Turma D
#### Projeto Integrador: Desenvolvimento de Sistemas Orientado a Objetos
Lista de Funcionalidades - E-Commerc de Informática
- Login ou cadastro
- Perfil
- Pagina administrativa
- Cadastro de produtos
- Página inicial
- banner
- Pagina de produtos
- Carrinho de compras
- pagina de pagamento
- Historico de compras
- Página de Suporte ao Cliente


### Integrantes do Grupo
- João Vitor Estevam - GitHub estevam99
- Kayque Fernandes Melo - GitHub: kayqemelo
- Lucas de Jesus Silva - GitHub: LucasJesus17
- Lucas Ferreira Silva - GitHub: LucasLfs2004
- Wellington Alves - GitHub: WEALVES

# Diagrama Entidade Relacionamento


![Diagrama_mer](https://user-images.githubusercontent.com/99514168/222869068-493d71bb-a8dd-4e8c-b857-79cfae739f89.png)


# Protótipos das páginas

### - Página de login
![Página de Login](./Docs/Prototipos/Login.png)

### - Página de criação de conta
![Página de Criação de Login](./Docs/Prototipos/CriarConta.png)

### - Tela de cadastro de produtos
![Página de Cadastro de Produtos](./Docs/Prototipos/CadastroProduto.png)

### - Tela inicial
![Tela inicial](./Docs/Prototipos/TelaInicial.png)

### - Carrinho de compras
![Página de carrinho de compras](./Docs/Prototipos/CarrinhoCompras.png)

### - Histórico de compras
![Página de histórico de compras](./Docs/Prototipos/HistoricoCompras.png)

### - Minha conta
![Página minha conta](./Docs/Prototipos/MinhaConta.png)

### - Minha conta part II
![Página minha conta](./Docs/Prototipos/TELA_MINHA_CONTA.PNG)

### - Tela de adiministrador
![Página de adiministrador](./Docs/Prototipos/TelaADM.PNG)

# - Identidade visual
- Paleta de cores
![Paleta de cores](https://user-images.githubusercontent.com/99226403/232334571-88d769a9-a8da-44bf-b913-eebe5a1da223.PNG)

- Logotipos:
![Logo_01](https://user-images.githubusercontent.com/99226403/232334457-e932eb51-83d4-44fa-a2bb-12c6e7b41385.png)
![Logo_02](https://user-images.githubusercontent.com/99226403/232334459-ce548ded-ffcf-464e-9860-cc168094d4ac.png) 
![Prancheta 6_2](https://user-images.githubusercontent.com/99226403/232334613-397881b5-57a1-4315-a013-71afabab8281.png)

- ## [Link arquivos identidade visual](https://encurtador.com.br/yz036)
- ## [Cores em HEXA](https://encurtador.com.br/cmzAE)

## Script do banco de dados: 

CREATE DATABASE TECHSTORE;

USE TECHSTORE;

CREATE TABLE USUARIO(
  ID INT NOT NULL AUTO_INCREMENT, 
  NAME VARCHAR(255) NOT NULL,
  DATA_NASCIMENTO VARCHAR(255) NOT NULL,
  CPF VARCHAR(15) UNIQUE,
  EMAIL VARCHAR(70) UNIQUE,
  SENHA VARCHAR(50) NOT NULL,
  ENDERECO VARCHAR(100) NOT NULL,
  CEP VARCHAR(9) NOT NULL,
  ADMIN VARCHAR(5),
  PRIMARY KEY(`ID`)
);

CREATE TABLE PRODUTO(
  ID_PRODUTO INT NOT NULL AUTO_INCREMENT,
  NOME_PRODUTO VARCHAR(60) NOT NULL,
  MARCA VARCHAR(30) NOT NULL,
  CATEGORIA VARCHAR(255) NOT NULL,
  PRECO DOUBLE NOT NULL,
  DESCRICAO VARCHAR(255),
  IMAGE VARCHAR(255) NOT NULL,
  QTD INT NOT NULL,
  PRIMARY KEY (`ID_PRODUTO`)
);

CREATE TABLE VENDA (
  ID_VENDA INT NOT NULL AUTO_INCREMENT,
  ID_CLIENTE INT NOT NULL,
  ID_PRODUTO INT NOT NULL,
  NOME_CLIENTE VARCHAR(40) NOT NULL,
  DATA_COMPRA VARCHAR(255) NOT NULL,
  QUANTIDADE_VENDIDA INT NOT NULL,
  VALOR_TOTAL DOUBLE NOT NULL,
  CEP_ENTREGA VARCHAR(15) NOT NULL,
  ENDERECO_ENTREGA VARCHAR(255) NOT NULL,
  PAGAMENTO VARCHAR(30) NOT NULL,
  PRIMARY KEY (ID_VENDA),
  FOREIGN KEY (ID_CLIENTE) REFERENCES USUARIO (ID),
  FOREIGN KEY (ID_PRODUTO) REFERENCES PRODUTO (ID_PRODUTO)
);
