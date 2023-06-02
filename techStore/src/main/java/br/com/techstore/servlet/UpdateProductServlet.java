package br.com.techstore.servlet;

import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.dao.UserDao;
import br.com.techstore.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-product")
public class UpdateProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        Produto produto = new ProdutoDao().findProduto(id);
        req.getSession().setAttribute("produto", produto);
        req.getRequestDispatcher("/cadProduto/altProduto.jsp").forward(req, resp);
    }
}