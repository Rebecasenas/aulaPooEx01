package aulaPooEx02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // scanner para coletar entrada
        Scanner scanner = new Scanner(System.in);
        
        // criação do primeiro objeto
        System.out.println("CADASTRO DO PACIENTE 1");
        
        Paciente paciente1 = new Paciente(); // Construtor vazio
        
        System.out.print("Digite o nome do paciente: ");
        paciente1.setNome(scanner.nextLine());
        System.out.print("Digite o RG do paciente: ");
        paciente1.setRg(scanner.nextLine());
        System.out.print("Digite o endereço do paciente: ");
        paciente1.setEndereco(scanner.nextLine());
        System.out.print("Digite o telefone do paciente: ");
        paciente1.setTelefone(scanner.nextLine());
        System.out.print("Digite a data de nascimento do paciente: ");
        paciente1.setDataNascimento(scanner.nextLine());
        System.out.print("Digite a profissão do paciente: ");
        paciente1.setProfissao(scanner.nextLine());
        
        
         // Criação do segundo objeto usando o construtor com argumento
        System.out.println("\n== Cadastro do Paciente 2 ==");

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente2 = scanner.nextLine(); // O nome será passado diretamente no construtor
        Paciente paciente2 = new Paciente(nomePaciente2); // Construtor com argumento
        System.out.print("Digite o RG do paciente: ");
        paciente2.setRg(scanner.nextLine());
        System.out.print("Digite o endereço do paciente: ");
        paciente2.setEndereco(scanner.nextLine());
        System.out.print("Digite o telefone do paciente: ");
        paciente2.setTelefone(scanner.nextLine());
        System.out.print("Digite a data de nascimento do paciente: ");
        paciente2.setDataNascimento(scanner.nextLine());
        System.out.print("Digite a profissão do paciente: ");
        paciente2.setProfissao(scanner.nextLine());
        
        // Exibir os dados dos dois pacientes
        System.out.println("\n Dados do Paciente 1 ");
        paciente1.exibirDados();

        System.out.println("\n Dados do Paciente 2");
        paciente2.exibirDados();

        scanner.close(); // Fechar o Scanner para liberar recursos
    }
}
