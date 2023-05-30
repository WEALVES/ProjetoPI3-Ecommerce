package br.com.techstore.model;

public class User {
    private int id;
    private String name;
    private String nascimento;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String cep;

    private String admin;

    public User() {

    }

    public User(String name, String nascimento, String cpf, String email, String senha, String endereco, String cep) {
        this.name = name;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cep = cep;
    }

    public User(int id, String name, String nascimento, String cpf, String email, String senha, String endereco, String cep) {
        this.id = id;
        this.name = name;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cep = cep;
        this.admin = "false";
    }

    public User(int id, String name, String nascimento, String cpf, String email, String senha, String endereco, String cep, String admin) {
        this.id = id;
        this.name = name;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cep = cep;
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        nascimento = nascimento;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nascimento='" + nascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep='" + cep + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }
}
