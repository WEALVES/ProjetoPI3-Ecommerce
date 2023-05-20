package br.com.techstore.servlet;

import br.com.techstore.dao.UserDao;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/find-user")
public class ListUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entrei no servlet");

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        /*
        List<User> users = new UserDao().findUser(email);
        System.out.println(users.get(0));
        */

        User user = new UserDao().effectLogin(email);
        /*
        System.out.println(user);
        System.out.println(user.getSenha());
        System.out.println(senha);
        */

        //req.setAttribute("users", users);
        if(user.getSenha().equals(senha)) {
            System.out.println("Tudo certo, realizar sessão!");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            System.out.println("Deu tudo errado");
        }
    }
}
