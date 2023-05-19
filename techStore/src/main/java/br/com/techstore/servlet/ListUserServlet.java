package br.com.techstore.servlet;

import br.com.techstore.dao.UserDao;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/find-all-users")
public class ListUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> users = new UserDao().findAllUsers();

        req.setAttribute("users", users);

        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);

    }
}
