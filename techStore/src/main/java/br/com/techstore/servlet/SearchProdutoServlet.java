package br.com.techstore.servlet;

import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.dao.UserDao;
import br.com.techstore.model.Produto;
import br.com.techstore.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search-produto")
public class SearchProdutoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    int id = Integer.parseInt(req.getParameter("id-produto"));
    System.out.println("ID: " + id);
    Produto produtoSelecionado = new ProdutoDao().findProduto(id);

    System.out.println("Resultado da busca: "+ produtoSelecionado);

    req.setAttribute("produto", produtoSelecionado);

    req.getRequestDispatcher("/pageProduto/pagProduto.jsp").forward(req, resp);

  }
}
