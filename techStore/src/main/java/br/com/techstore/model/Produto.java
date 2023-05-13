package br.com.techstore.model;

public class Produto {
    private String nome;
    private String categoria;
    private String fabricante;
    private String marca;
    private String preco;
    private String descricao;
    private String quatidade;
    private String imagem;

    public Produto(String nome, String categoria, String fabricante, String marca, String preco, String descricao, String quatidade, String imagem) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
        this.quatidade = quatidade;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(String quatidade) {
        this.quatidade = quatidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}