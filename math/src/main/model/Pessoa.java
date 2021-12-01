package model.Pessoa;

public class Pessoa {

    public String nome;
    public String telefone;
    public String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Pessoa = "
                " nome: " + nome +
                " telefone: " + telefone +
                " email: " + email;
    }
}