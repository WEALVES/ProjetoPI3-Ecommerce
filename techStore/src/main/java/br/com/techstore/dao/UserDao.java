package br.com.techstore.dao;



import br.com.techstore.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            System.out.println("Success in connection.");

        } catch (Exception e) {
            System.out.println("fail in connection.");
        }
    }

    public List<User> findAllUsers() {

        String SQL = "SELECT * FROM USUARIO";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {

                String userName = resultSet.getString("name");
                String senha1 = resultSet.getString("senha");
                String senha2 = resultSet.getString("senha");
                String userNascimento = resultSet.getString("nascimento");
                String userCpf = resultSet.getString("cpf");
                String userEndereco = resultSet.getString("endereco");
                String userEmail = resultSet.getString("email");
                String userCep = resultSet.getString("cep");

                    User user = new User(userName, senha1, userNascimento, userCpf, userEndereco, userEmail, userCep);

                    users.add(user);

            }

            System.out.println("success in select * usuario");

            connection.close();

            return users;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }

    }
}
