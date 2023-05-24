package br.com.techstore.servlet;

import br.com.techstore.dao.UserDao;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-account")
public class DeleteAccountServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String cpfUser = req.getParameter("cpf");
    System.out.println(cpfUser);
    boolean deletou = new UserDao().deleteUser(cpfUser);

    if(deletou) {
      System.out.println("Tudo certo, usuário excluído!");
      req.getSession().invalidate();
      req.getRequestDispatcher("/find-all-produtos").forward(req, resp);
    } else {
      System.out.println("Nâo foi possível realizar a exclusão do usuário");
      req.setAttribute("message", "Invalid credentials!");
      req.getRequestDispatcher("/perfil/perfil.jsp").forward(req, resp);
    }
  }
}