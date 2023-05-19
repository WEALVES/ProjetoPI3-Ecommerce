package br.com.techstore.dao;


import br.com.techstore.model.Produto;
import br.com.techstore.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProdutoDao {

    public void createProduto(Produto produto) {
        String SQL = "INSERT INTO PRODUTO (NOME, CATEGORIA, FABRICANTE, MARCA, PRECO, DESCRICAO, QUANTIDADE, IMAGEM) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:h2:~/test",
                    "sa",
                    "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setString(3, produto.getFabricante());
            preparedStatement.setString(4, produto.getMarca());
            preparedStatement.setString(5, produto.getPreco());
            preparedStatement.setString(6, produto.getDescricao());
            preparedStatement.setString(7, produto.getQuatidade());
            preparedStatement.setString(8, produto.getImagem());
            preparedStatement.execute();
            connection.close();

            System.out.println("Sucess in connection, teste cadastro");
        } catch (Exception e) {
            System.out.println("Fail in connection");
        }


        }
    public List<Produto> findAllProdutos() {

        String SQL = "SELECT * FROM PRODUTO";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection,  Teste busca");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {

                String nome = resultSet.getString("nome");
                String categoria = resultSet.getString("categoria");
                String fabricante = resultSet.getString("fabricante");
                String marca = resultSet.getString("marca");
                String preco = resultSet.getString("preco");
                String descricao = resultSet.getString("descricao");
                String quantidade = resultSet.getString("quantidade");
                String imagem = resultSet.getString("imagem");

                Produto produto = new Produto(nome, categoria, fabricante, marca, preco, descricao, quantidade, imagem);

                produtos.add(produto);

            }

            System.out.println("success in select * produto");

            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println("fail in database connection, de produto");

            return Collections.emptyList();

        }
    }
}
