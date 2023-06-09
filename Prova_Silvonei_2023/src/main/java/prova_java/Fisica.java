
package prova_java;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa{
    //Atributos
    protected LocalDate dataNascimento;
    protected Genero genero;
    
    //Construtor

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    //toString
    
    @Override
    public String toString() {
        return  super.toString() +
                "\nTipo: Fisica " + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nIdade: " + getIdade() +
                "\nGênero: " + genero.getTexto();
    }
    
 
    //Getters and Setters
    
        //getIdade
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
        //
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
    
    
}
