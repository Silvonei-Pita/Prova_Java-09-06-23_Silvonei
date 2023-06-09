
package prova_java;

public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    //Construtor
    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    //toString
    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email +
               "\n\nEndereço: " + endereco +
               "\n";
    }
    
    //Getters and Setters
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
