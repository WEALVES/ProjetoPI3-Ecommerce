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
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;

@WebServlet("/alter-produto")
public class AlterProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Map<String, String> parameters = uploadImage(req);
        System.setProperty("file.encoding","UTF-8");
        int id = Integer.parseInt(parameters.get("id"));
        String nome = parameters.get("nome");
        Double preco = Double.valueOf(parameters.get("preco"));
        String categoria = parameters.get("categoria");
        String marca = parameters.get("marca");
        String descricao = parameters.get("descricao");
        int quantidade = Integer.parseInt(parameters.get("quantidade"));
        String imagePath = parameters.get("image");


        Produto produto = new Produto(id, nome, categoria, marca, preco, descricao, quantidade, imagePath);

        ProdutoDao produtoDao = new ProdutoDao();

        produtoDao.updateProduto(produto);

        resp.sendRedirect("/find-all-produtos");




    }

    private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {

        System.setProperty("file.encoding","UTF-8");
        Map<String, String> requestParameters = new HashMap<>();

        if (isMultipartContent(httpServletRequest)) {

            try {
                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                for (FileItem fileItem : fileItems) {

                    checkFieldType(fileItem, requestParameters);

                }

            } catch (Exception ex) {

                requestParameters.put("image", "assets/imgProduct/default-car.jpg");

            }

        }

        return requestParameters;

    }

    private void checkFieldType(FileItem item, Map requestParameters) throws Exception {

        if (item.isFormField()) {

            requestParameters.put(item.getFieldName(), item.getString());

        } else {

            String fileName = processUploadedFile(item);
            requestParameters.put("image", "assets/imgProduct/".concat(fileName));

        }

    }

    private String processUploadedFile(FileItem fileItem) throws Exception {
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("assets/imgProduct").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        return fileName;
    }
}
