package br.com.techstore.dao;

import br.com.techstore.model.Venda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
}
