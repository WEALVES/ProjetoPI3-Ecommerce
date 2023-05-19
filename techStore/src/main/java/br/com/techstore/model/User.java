package br.com.techstore.model;

public class User {
    private String name;
    private String Nascimento;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String cep;

    public User() {

    }

    public User(String name, String nascimento, String cpf, String email, String senha, String endereco, String cep) {
        this.name = name;
        Nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String nascimento) {
        Nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
