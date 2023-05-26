package br.com.techstore.model;

public class Admin {

    private int id;

    private String name;

    private String senha;

    private String email;

    private String cpf;

    public Admin() {
    }

    public Admin(String name, String senha, String email, String cpf) {
        this.name = name;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
    }

    public Admin(int id, String name, String senha, String email, String cpf) {
        this.id = id;
        this.name = name;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
