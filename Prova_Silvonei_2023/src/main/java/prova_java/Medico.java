
package prova_java;

import java.time.LocalDate;


public class Medico extends Funcionario{
    //Atributos
    private String crm;

    //Construtor
    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Médico " + 
                "\nCRM: " + crm;
    }
    
    //Getters and Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
}
