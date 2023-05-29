package br.com.techstore.servlet;

import javax.servlet.http.HttpServletRequest;

import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.dao.UserDao;
import br.com.techstore.dao.VendaDao;
import br.com.techstore.model.Historico;
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

        List<Venda> compras = new VendaDao().historicoVenda(idCliente);

        List<Historico> historico = new ArrayList<Historico>();

        if (compras.size() > 0) {
            for (int i = 0; i < compras.size(); i++) {
                Produto produtoSelecionado = new ProdutoDao().findProduto(compras.get(i).getIdProduto());
                Historico array;
                array = new Historico(compras.get(i).getIdVenda(), produtoSelecionado.getId(), produtoSelecionado.getNome(), produtoSelecionado.getCategoria(), produtoSelecionado.getMarca(), produtoSelecionado.getPreco(), produtoSelecionado.getDescricao(), produtoSelecionado.getImagem(), compras.get(i).getQuantidade(), compras.get(i).getData(), compras.get(i).getValor(), compras.get(i).getCep(), compras.get(i).getEndereco(), compras.get(i).getPagamento());
                historico.add(array);
            }
        req.setAttribute("historico", historico);
        }
        req.getRequestDispatcher("/perfil/perfil.jsp").forward(req, resp);
    }
}
