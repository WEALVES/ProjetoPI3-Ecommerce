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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Map<String, String> parameters = uploadImage(req);
        System.setProperty("file.encoding","UTF-8");
        String nome = parameters.get("nome");
        String categoria = parameters.get("categoria");
        System.out.println("categoria" + categoria);
        String marca = parameters.get("marca");
        Double preco = Double.valueOf(parameters.get("preco"));
        String descricao = parameters.get("descricao");
        int quantidade = Integer.parseInt(parameters.get("quantidade"));
        String imagePath = parameters.get("image");
        System.out.println(imagePath);


        Produto produto = new Produto(nome, categoria, marca, preco, descricao, quantidade, imagePath);


        boolean isSuccessOnUpload = new ProdutoDao().createProduto(produto);

        if(isSuccessOnUpload) {

            resp.sendRedirect("/find-all-produtos");

        } else {

            req.setAttribute("message", "fail on upload image");

            req.getRequestDispatcher("/cadProduto/cadProduto.jsp").forward(req, resp);

        }



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
                System.out.println("erro no create produto servlet");

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
        System.out.println("RESULTADO: " + fileName);
        return fileName;
    }
}
