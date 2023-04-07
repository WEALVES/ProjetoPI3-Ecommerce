package br.com.techstore.dao;



import br.com.techstore.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {
    public void createUser(User user) {
        String SQL = "INSERT INTO USUARIO (NAME, DATA_NASCIMENTO, CPF, EMAIL, SENHA, ENDERECO, CEP) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getNascimento());
            preparedStatement.setString(3, user.getCpf());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getSenha());
            preparedStatement.setString(6, user.getEndereco());
            preparedStatement.setString(7, user.getCep());

            preparedStatement.execute();
            connection.close();
            System.out.println("Success in connection");

        } catch (Exception e) {
            System.out.println("fail in connection");
        }
    }
}
