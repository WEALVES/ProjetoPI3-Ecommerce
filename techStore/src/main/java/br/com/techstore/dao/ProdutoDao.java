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

    public boolean createProduto(Produto produto) {

        String SQL = "INSERT INTO PRODUTO (NOME_PRODUTO, CATEGORIA, MARCA, PRECO, DESCRICAO, QTD, IMAGE) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:h2:~/test",
                    "sa",
                    "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setString(3, produto.getMarca());
            preparedStatement.setDouble(4, produto.getPreco());
            preparedStatement.setString(5, produto.getDescricao());
            preparedStatement.setInt(6, produto.getQuatidade());
            preparedStatement.setString(7, produto.getImagem());
            preparedStatement.execute();
            connection.close();

            System.out.println("Sucess in connection, teste cadastro");

            return true;

        } catch (Exception e) {

            System.out.println("Fail in connection");
            System.out.println(e.getMessage());

            return false;

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
                int id = resultSet.getInt("id_produto");
                String nome = resultSet.getString("nome_produto");
                String categoria = resultSet.getString("categoria");
                String marca = resultSet.getString("marca");
                Double preco = resultSet.getDouble("preco");
                String descricao = resultSet.getString("descricao");
                int quantidade = resultSet.getInt("qtd");
                String imagem = resultSet.getString("image");

                Produto produto = new Produto(id, nome, categoria, marca, preco, descricao, quantidade, imagem);

                produtos.add(produto);

            }

            System.out.println("success in select * produto");

            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println("fail in database connection, de produto");
            System.out.println(e.getMessage());

            return Collections.emptyList();

        }
    }

}
