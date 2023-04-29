package br.com.techstore.model;

public class Produto {
    private String nome;
    private String categoria;
    private String fabricante;
    private String marca;
    private String preco;
    private String descricao;
    private String quatidade;

    public Produto(String nome, String categoria, String fabricante, String marca, String preco, String descricao, String quatidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
        this.quatidade = quatidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public String getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getQuatidade() {
        return quatidade;
    }

    public String getNome() {
        return nome;
    }
}
