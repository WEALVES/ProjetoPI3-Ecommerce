package br.com.techstore.dao;


import br.com.techstore.model.Produto;

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
            preparedStatement.setInt(6, produto.getQuantidade());
            preparedStatement.setString(7, produto.getImagem());
            preparedStatement.execute();
            connection.close();

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());

            return false;

        }
    }
    public List<Produto> findAllProdutos() {

        String SQL = "SELECT * FROM PRODUTO";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

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


            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return Collections.emptyList();

        }
    }

    public Produto findProduto(int pId) {

        String SQL = "SELECT * FROM PRODUTO WHERE ID_PRODUTO LIKE ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1, pId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id_produto");
                String nome = resultSet.getString("nome_produto");
                String categoria = resultSet.getString("categoria");
                String marca = resultSet.getString("marca");
                Double preco = resultSet.getDouble("preco");
                String descricao = resultSet.getString("descricao");
                int quantidade = resultSet.getInt("qtd");
                String imagem = resultSet.getString("image");

                Produto produto = new Produto(id, nome, categoria, marca, preco, descricao, quantidade, imagem);
                return produto;
            }
            connection.close();





        } catch (Exception e) {

            System.out.println(e.getMessage());

            return null;
        }
        return null;
    }

    public void deleteProductByID(int pId){


            String SQL = "DELETE PRODUTO WHERE ID_PRODUTO = ?";

            try {

                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");


                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                preparedStatement.setInt(1, pId);
                preparedStatement.execute();

                connection.close();

            } catch (Exception e) {

                System.out.println("fail in database connection erro aqui");

            }


    }

    public void updateProduto(Produto produto) {

        String SQL = "UPDATE PRODUTO SET NOME_PRODUTO = ?, CATEGORIA = ?, MARCA = ?, PRECO = ?, DESCRICAO = ?, QTD = ?, IMAGE = ? WHERE ID_PRODUTO = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);


            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setString(3, produto.getMarca());
            preparedStatement.setDouble(4, produto.getPreco());
            preparedStatement.setString(5, produto.getDescricao());
            preparedStatement.setInt(6, produto.getQuantidade());
            preparedStatement.setString(7, produto.getImagem());
            preparedStatement.setInt(8, produto.getId());
            preparedStatement.execute();


            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }

    }

}
