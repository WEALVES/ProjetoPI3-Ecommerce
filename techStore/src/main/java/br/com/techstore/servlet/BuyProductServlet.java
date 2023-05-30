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

@WebServlet("/buy-product")
public class BuyProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("loggedUser") == null) {
            resp.sendRedirect("/login/login.jsp");
        } else {
            int quantidade = Integer.parseInt(req.getParameter("quantidade-selecionada"));
            int id = Integer.parseInt(req.getParameter("id-produto"));
            Produto produtoSelecionado = new ProdutoDao().findProduto(id);

            req.setAttribute("produto", produtoSelecionado);
            req.setAttribute("valorCarrinho", String.valueOf(produtoSelecionado.getPreco() * quantidade));
            if (quantidade > 0) {
                req.setAttribute("quantidadeSelecionada", quantidade);
            } else {
                req.setAttribute("quantidadeSelecionada", String.valueOf(1));
            }

            if (quantidade <= produtoSelecionado.getQuantidade()) {
                req.getRequestDispatcher("/carrinho/carrinho.jsp").forward(req, resp);
            } else {
                req.setAttribute("messageQuantidade", "Não temos a quantidade escolhida no estoque, o estoque possui " + produtoSelecionado.getQuantidade() + " unidades");
                req.getRequestDispatcher("/pageProduto/pagProduto.jsp").forward(req, resp);
            }

        }


    }
}
