package br.com.techstore.dao;

import br.com.techstore.model.Produto;
import br.com.techstore.model.Venda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendaDao {
    public boolean createVenda(Venda venda) {

        String SQL = "INSERT INTO VENDA (ID_CLIENTE, ID_PRODUTO, NOME_CLIENTE, DATA_COMPRA, QUANTIDADE_VENDIDA, VALOR_TOTAL, CEP_ENTREGA, ENDERECO_ENTREGA, PAGAMENTO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:h2:~/test",
                    "sa",
                    "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, venda.getIdCliente());
            preparedStatement.setInt(2, venda.getIdProduto());
            preparedStatement.setString(3, venda.getNomeCliente());
            preparedStatement.setString(4, venda.getData());
            preparedStatement.setInt(5, venda.getQuantidade());
            preparedStatement.setDouble(6, venda.getValor());
            preparedStatement.setString(7, venda.getCep());
            preparedStatement.setString(8, venda.getEndereco());
            preparedStatement.setString(9, venda.getPagamento());
            preparedStatement.execute();
            connection.close();
            System.out.println("Sucess in connection, venda concluída");

            return true;

        } catch (Exception e) {

            System.out.println("Fail na realização da venda");
            System.out.println(e.getMessage());

            return false;

        }
    }

    public List<Venda> historicoVenda(int pId) {

        String SQL = "SELECT * FROM VENDA WHERE ID_CLIENTE LIKE ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1, pId);

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Venda> historico = new ArrayList<>();
            while (resultSet.next()) {
                int idVenda = resultSet.getInt("id_venda");
                int idCliente = resultSet.getInt("id_cliente");
                int idProduto = resultSet.getInt("id_produto");
                String nome = resultSet.getString("nome_cliente");
                String data = resultSet.getString("data_compra");
                int quantidade = resultSet.getInt("quantidade_vendida");
                double valor = resultSet.getDouble("valor_total");
                String cep = resultSet.getString("cep_entrega");
                String endereco = resultSet.getString("endereco_entrega");
                String pagamento = resultSet.getString("pagamento");

                Venda venda = new Venda(idVenda, idCliente, idProduto, nome, quantidade, data, valor, cep, endereco, pagamento);

                historico.add(venda);
                System.out.println(venda);
            }

            System.out.println("Deu tudo certo, saindo da DAO");

            return historico;

        } catch (Exception e) {

            System.out.println("Fail na realização da venda");
            System.out.println(e.getMessage());

            return null;

        }
    }


}
