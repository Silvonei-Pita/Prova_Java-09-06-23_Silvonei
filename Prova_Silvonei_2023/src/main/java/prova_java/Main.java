
package prova_java;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        //Instanciar Objetos
        
            //Pessoa Jurídica
            Juridica pessoa_juridica = new Juridica("036.840.86/001-65", 
                    "1967353461", 
                    "SENAI", 
                    "(71)4022-8922", 
                    "senai.tecnico@ba.estudante.senai.br", 
                    new Endereco("Av. Dendezeiros do Bonfim", "s/n", "Em frente ao CPM", "21195-980", "Salvador", UnidadeFederativa.BAHIA));
            
            //Cliente (Pessoa Física)
            Cliente cliente1 = new Cliente(105, 
                    LocalDate.of(2000, Month.MARCH, 20), 
                    Genero.FEMININO, 
                    "Sandra", 
                    "(74)96435-1234", 
                    "Sandra.lindaCliente@gmai.com",
                    new Endereco("Alphaville", "211", "Próxima à Padaria Doces Sonhos", "12345-920", "São Paulo", UnidadeFederativa.SAO_PAULO));
            
            //Motoboy (Funcionário)
            Motoboy motoboy1 = new Motoboy("987654321-01", 
                    "895.467.123-12", 
                    "65.963.124-89", 
                    "9483232789", 
                    Setor.OPERACOES, 
                    1300, 
                    LocalDate.of(1998, Month.JUNE, 10), 
                    Genero.MASCULINO,
                    "Anderson", 
                    "(21)986743-1234", 
                    "Anderson.motoboy@gmail.com", 
                    new Endereco("Ribeira, Rua das Margaridas", "87", "Próximo à Escola Grandes Conquistas", "98543-840", "Salvador", UnidadeFederativa.BAHIA));
            
            //Médico (Funcionário)
            Medico medico1 = new Medico("8456244856-897", 
                    "517.597.247-34", 
                    "41.578.345-21", 
                    "4878952365", 
                    Setor.SAUDE, 
                    5000, 
                    LocalDate.of(1996, Month.DECEMBER, 25), 
                    Genero.FEMININO, 
                    "Raiane", 
                    "(71)98854-9875", 
                    "Raiane.medica@hotmail.com", 
                    new Endereco("Arenoso, Parque das pétalas", "56", "Em frente à Determinação", "12556-785", "Jardim Encantado", UnidadeFederativa.RIO_DE_JANEIRO));
            
            //Advogado (Funcionário)
            Advogado advogado1 = new Advogado("54411874656-856", 
                    "257.549.785-89", 
                    "74.645.486-87", 
                    "7851166865", 
                    Setor.JURIDICO, 
                    3000, 
                    LocalDate.of(1990, Month.NOVEMBER, 15), 
                    Genero.MASCULINO, 
                    "Manuel", 
                    "(12)94232-4752", 
                    "Manuel.Advogado@yahoo.com", 
                    new Endereco("Maracutaia, Cidade dos Heróis", "45", "Ao lado da Praça da Fé", "78564-987", "Salvador", UnidadeFederativa.BAHIA));
        
        //Exibir Dados
        
        System.out.println("Pessoa Jurídica: ");
        System.out.println(pessoa_juridica.toString());
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Cliente: ");
        System.out.println(cliente1.toString());
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Motoboy: ");
        System.out.println(motoboy1.toString());
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Médico: ");
        System.out.println(medico1.toString());
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Advogado: ");
        System.out.println(advogado1.toString());
        System.out.println("");
        
        
        
        
        
        
        
    }
    
}
