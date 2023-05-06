package br.com.techstore.servlet;


import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.model.Produto;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;

@WebServlet("/create-produto")
public class CreateProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {

        Map<String, String> parameters = uploadImage(req);

        String carImagePath = parameters.get("image");
        String carName = parameters.get("car-name");

        String nome = servletRequest.getParameter("nome");
        String categoria = servletRequest.getParameter("categoria");
        String fabricante = servletRequest.getParameter("fabricante");
        String marca = servletRequest.getParameter("marca");
        String preco = servletRequest.getParameter("preco");
        String descricao = servletRequest.getParameter("descricao");
        String quantidade = servletRequest.getParameter("quantidade");
        String imagem = servletRequest.getParameter("imagem");


        Produto produto = new Produto(nome, categoria, fabricante, marca, preco, descricao, quantidade, imagem);


        new ProdutoDao().createProduto(produto);

        servletResponse.sendRedirect("/find-all-produtos");

    }
}
