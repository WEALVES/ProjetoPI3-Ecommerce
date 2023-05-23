package br.com.techstore.model;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private String marca;
    private Double preco;
    private String descricao;
    private int quatidade;
    private String imagem;

    public Produto(int id, String nome, String categoria, String marca, Double preco, String descricao, int quatidade, String imagem) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
        this.quatidade = quatidade;
        this.imagem = imagem;
    }

    public Produto(String nome, String categoria, String marca, Double preco, String descricao, int quatidade, String imagem) {
        this.nome = nome;
        this.categoria = categoria;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", categoria='" + categoria + '\'' +
            ", marca='" + marca + '\'' +
            ", preco=" + preco +
            ", descricao='" + descricao + '\'' +
            ", quatidade=" + quatidade +
            ", imagem='" + imagem + '\'' +
            '}';
    }
}