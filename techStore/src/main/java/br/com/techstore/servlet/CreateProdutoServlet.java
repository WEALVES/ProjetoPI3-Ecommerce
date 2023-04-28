package br.com.techstore.servlet;


import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-produto")
public class CreateProdutoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {

        String nome = servletRequest.getParameter("nome");
        String categoria = servletRequest.getParameter("categoria");
        String fabricante = servletRequest.getParameter("fabricante");
        String marca = servletRequest.getParameter("marca");
        String preco = servletRequest.getParameter("preco");
        String descricao = servletRequest.getParameter("descricao");
        String quantidade = servletRequest.getParameter("quantidade");


        Produto produto = new Produto(nome, categoria, fabricante, marca, preco, descricao, quantidade );


        new ProdutoDao().createProduto(produto);

        servletResponse.sendRedirect("/find-all-produtos");

    }
}
