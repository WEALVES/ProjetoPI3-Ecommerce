package br.com.techstore.model;

public class Venda {
    private int idVenda;
    private int idCliente;
    private int idProduto;
    private String nomeCliente;
    private int quantidade;
    private String data;
    private Double valor;
    private String cep;
    private String endereco;
    private String pagamento;

    public Venda() {

    }

    public Venda(int idCliente, int idProduto, String nomeCliente, int quantidade, String data, Double valor, String cep, String endereco, String pagamento) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.nomeCliente = nomeCliente;
        this.quantidade = quantidade;
        this.data = data;
        this.valor = valor;
        this.cep = cep;
        this.endereco = endereco;
        this.pagamento = pagamento;
    }

    public Venda(int idVenda, int idCliente, int idProduto, String nomeCliente, int quantidade, String data, Double valor, String cep, String endereco, String pagamento) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.nomeCliente = nomeCliente;
        this.quantidade = quantidade;
        this.data = data;
        this.valor = valor;
        this.cep = cep;
        this.endereco = endereco;
        this.pagamento = pagamento;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        valor = valor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", idCliente=" + idCliente +
                ", idProduto=" + idProduto +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", quantidade=" + quantidade +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pagamento='" + pagamento + '\'' +
                '}';
    }
}
