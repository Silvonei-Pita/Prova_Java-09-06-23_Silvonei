
package prova_java;

import java.time.LocalDate;


public class Cliente extends Fisica{
    //Atributos
    private int protocoloAtendimento;

    //Construtor
    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n\nClassificação: Cliente " + 
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
    
    //Getters and Setters
    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
    
    
    
}
