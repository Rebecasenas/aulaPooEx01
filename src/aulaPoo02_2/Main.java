package aulaPoo02_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //criar scanner
        Scanner scanner = new Scanner(System.in);
        
        //objeto 1
        System.out.println("Produto 1");
         Produto produto1 = new Produto(); // Construtor vazio
        System.out.print("Digite a marca do produto:  ");
        produto1.setMarca(scanner.nextLine());
        System.out.print("Digite o fabricante do produto:  ");
        produto1.setFabricante(scanner.nextLine());
        System.out.print("Digite o código de barras do produto:  ");
        produto1.setCod_barras(scanner.nextLine());
        System.out.print("Digite o preço do produto:  ");
        produto1.setPreco(scanner.nextFloat());
        
         // Criando o segundo objeto usando o construtor com parâmetros
        System.out.println("\n Cadastro do Produto 2 ");
        System.out.print("Digite a marca do produto:  ");
        String marca = scanner.nextLine();
        System.out.print("Digite o fabricante do produto:  ");
        String fabricante = scanner.nextLine();
        System.out.print("Digite o código de barras do produto:  ");
        String cod_barras = scanner.nextLine();
        System.out.print("Digite o preço do produto:  ");
        float preco = scanner.nextFloat();

        Produto produto2 = new Produto(marca, fabricante, cod_barras, preco);

        // Mostrando os dados dos dois produtos
        System.out.println("\n== Dados do Produto 1 ==");
        produto1.exibirDados();

        System.out.println("\n== Dados do Produto 2 ==");
        produto2.exibirDados();

        scanner.close(); // Fechar o Scanner
    }
    
}
