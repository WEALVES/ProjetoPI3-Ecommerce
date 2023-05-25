package br.com.techstore.servlet;

import javax.servlet.http.HttpServletRequest;

import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.dao.UserDao;
import br.com.techstore.dao.VendaDao;
import br.com.techstore.model.Produto;
import br.com.techstore.model.User;
import br.com.techstore.model.Venda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/perfil")
public class LoadProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int idCliente = Integer.parseInt(req.getParameter("id-cliente"));

        System.out.println("id do cliente");

        List<Venda> historico = new VendaDao().historicoVenda(idCliente);

        List<Produto> produtosComprados = new ArrayList<Produto>();

        if (historico.size() > 0) {
            for (int i = 0; i < historico.size(); i++) {
                Produto produtoSelecionado = new ProdutoDao().findProduto(historico.get(i).getIdProduto());
                produtosComprados.add(produtoSelecionado);
                System.out.println(produtosComprados.get(i));
            }
        }

        System.out.println(produtosComprados.size());


        req.setAttribute("historico", historico);
        req.setAttribute("produtos", produtosComprados);
        req.getRequestDispatcher("/perfil/perfil.jsp").forward(req, resp);
    }
}
