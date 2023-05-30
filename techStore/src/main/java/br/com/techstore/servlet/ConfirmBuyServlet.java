package br.com.techstore.servlet;

import br.com.techstore.dao.ProdutoDao;
import br.com.techstore.dao.UserDao;
import br.com.techstore.model.Produto;
import br.com.techstore.model.User;
import br.com.techstore.dao.VendaDao;
import br.com.techstore.model.Venda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/confirm-buy")
public class ConfirmBuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int idProduto = Integer.parseInt(req.getParameter("id-produto"));
        int idCliente = Integer.parseInt(req.getParameter("id-cliente"));
        int quantidade = Integer.parseInt(req.getParameter("quantidade-selecionada"));
        String endereco = req.getParameter("endereco");
        String cep = req.getParameter("cep");
        String nome = req.getParameter("nome-cliente");
        double valor = Double.parseDouble(req.getParameter("valor-total"));

        String pagamento = "PIX";
        String data = String.valueOf(new Date());

        Venda venda = new Venda(idCliente, idProduto, nome, quantidade, data, valor, cep, endereco, pagamento);

        boolean retorno = new VendaDao().createVenda(venda);

        if(retorno) {
            resp.sendRedirect("/venda/vendaConcluida.jsp");
        } else {
            resp.sendRedirect("/venda/vendaFracassada.jsp");
        }




    }
}
