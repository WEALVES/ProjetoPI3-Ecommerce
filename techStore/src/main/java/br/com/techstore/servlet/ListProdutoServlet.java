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

@WebServlet("/find-all-produtos")
public class ListProdutoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produto> produtos = new ProdutoDao().findAllProdutos();

        req.setAttribute("produtos", produtos);

        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
