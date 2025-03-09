
package aulaPooEx01;


public class main {
    public static void main(String[] args){
        //Instanciar cliente
        Cliente cliente = new Cliente("Maria Soares",32456874,"maria.soares@cs.cruzeirodosul.edu.br");
        
        //Instanciar curso
        Curso curso = new Curso("Programação Orientada a Objetos",80,599.00);
        
        //Imprimir informações cliente
        System.out.println("Cliente:\n" + 
                "Nome: " + cliente.getNome()+ "\n" +
                "RGM: " + cliente.getRgm() + "\n" + 
                "E-mail: " + cliente.getEmial());
        
        //Imprimir informações curso
        System.out.println("Curso:\n" +
                "Nome do curso: " + curso.getNome() + "\n" +
                "Carga horária: " + curso.getCargaHoraria() + "\n" + 
                "Valor: " + curso.getValor());
    }
    
    
    
}
