package br.com.techstore.dao;

import br.com.techstore.model.Admin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdminDao {

    public List<Admin> findUser(String email) {

        String SQL = "SELECT * FROM ADMINISTRADOR WHERE EMAIL LIKE ?";

        try {


            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, "%" + email + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Admin> admins = new ArrayList<>();

            while (resultSet.next()) {
                String userName = resultSet.getString("name");
                String userSenha = resultSet.getString("senha");
                String userEmail = resultSet.getString("email");
                String userCpf = resultSet.getString("cpf");

                Admin admin = new Admin(userName, userCpf, userEmail, userSenha);
                admins.add(admin);

            }

            System.out.println("success in select * usuario");

            connection.close();

            return admins;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println(e.getMessage());

            return Collections.emptyList();

        }

    }

    public Admin effectLogin(String email) {

        String SQL = "SELECT * FROM ADMINISTRADOR WHERE EMAIL LIKE ?";
        Admin admin = new Admin();

        try {


            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int adminId = resultSet.getInt("ID");
                String userName = resultSet.getString("NAME");
                String userSenha = resultSet.getString("SENHA");
                String userEmail = resultSet.getString("EMAIL");
                String userCpf = resultSet.getString("CPF");

                admin = new Admin(adminId ,userName, userEmail, userSenha, userCpf);
            }
            System.out.println("success in select * usuario");

            connection.close();

            return admin;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println(e.getMessage());

            return admin;
        }
    }

}
