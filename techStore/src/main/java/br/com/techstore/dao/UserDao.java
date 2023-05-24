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
    public boolean createUser(User user) {
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
            return true;

        } catch (Exception e) {
            System.out.println("fail in connection.");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<User> findUser(String email) {

        String SQL = "SELECT * FROM USUARIO WHERE EMAIL LIKE ?";

        try {


            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, "%" + email + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {
                String userName = resultSet.getString("name");
                String userSenha = resultSet.getString("senha");
                String userNascimento = resultSet.getString("data_nascimento");
                String userCpf = resultSet.getString("cpf");
                String userEndereco = resultSet.getString("endereco");
                String userEmail = resultSet.getString("email");
                String userCep = resultSet.getString("cep");

                    User user = new User(userName, userNascimento, userCpf, userEmail, userSenha, userEndereco, userCep);
                    users.add(user);

            }

            System.out.println("success in select * usuario");

            connection.close();

            return users;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println(e.getMessage());

            return Collections.emptyList();

        }

    }

    public User effectLogin(String email) {

        String SQL = "SELECT * FROM USUARIO WHERE EMAIL LIKE ?";
            User user = new User();

        try {


            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String userName = resultSet.getString("NAME");
                String userSenha = resultSet.getString("SENHA");
                String userNascimento = resultSet.getString("DATA_NASCIMENTO");
                String userCpf = resultSet.getString("CPF");
                String userEndereco = resultSet.getString("ENDERECO");
                String userEmail = resultSet.getString("EMAIL");
                String userCep = resultSet.getString("CEP");

                user = new User(userName, userNascimento, userCpf, userEmail, userSenha, userEndereco, userCep);
            }
            System.out.println("success in select * usuario");

            connection.close();

            return user;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println(e.getMessage());

            return user;
        }
    }


    public boolean deleteUser(String cpf) {

        String SQL = "DELETE FROM USUARIO WHERE CPF LIKE ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection" + cpf);

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cpf);

            preparedStatement.executeUpdate();
            System.out.println("success in select * usuario");

            connection.close();

            return true;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println(e.getMessage());

            return false;
        }
    }
}