package br.com.techstore.model;

public class User {
    private String name;
    private String Nascimento;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String cep;

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

    public String getNascimento() {
        return Nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }
}
