package br.com.techstore.servlet;

import br.com.techstore.dao.UserDao;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/find-user")
public class LoginUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        User user = new UserDao().effectLogin(email);

        req.setAttribute("user", user);
        req.setAttribute("cpf", user.getCpf());
        if(user.getSenha().equals(senha)) {
            System.out.println("Tudo certo, realizar sessão!");
            req.getSession().setAttribute("loggedUser", user.getName());
            req.getSession().setAttribute("endereco", user.getEndereco());
            req.getSession().setAttribute("nascimento", user.getNascimento());
            req.getSession().setAttribute("cep", user.getCep());
            req.getSession().setAttribute("cpf", user.getCpf());
            req.getSession().setAttribute("endereco", user.getEndereco());
            req.getSession().setAttribute("email", user.getEmail());
            req.getRequestDispatcher("/find-all-produtos").forward(req, resp);
        } else {
            System.out.println("Deu tudo errado");
            req.setAttribute("message", "Invalid credentials!");
            req.getRequestDispatcher("/login/login.jsp").forward(req, resp);
        }
    }
}
