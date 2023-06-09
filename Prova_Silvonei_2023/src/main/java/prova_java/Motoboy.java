
package prova_java;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    //Atributos
    private String cnh;
    
    //Construtor
    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + 
                "\nCargo: Motoboy" + 
                "\nCNH: " + cnh;
    }
    
    //Getters and Setters
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    
    
}
