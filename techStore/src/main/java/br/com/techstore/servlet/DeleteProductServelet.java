package br.com.techstore.servlet;

import br.com.techstore.dao.ProdutoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-produto")
public class DeleteProductServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        int pId = Integer.parseInt(req.getParameter("id"));

        new ProdutoDao().deleteProductByID(pId);

        resp.sendRedirect("/find-all-produtos");

    }

}
