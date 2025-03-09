package aulaPooEx01;

public class Curso {
    
    //Atributos
    private String nome;
    private int cargaHoraria;
    private double valor;
         
    // Construtor, para iniciar objetos
    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }
    
    // Métodos
    public String getNome(){
        return nome;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }  
    
    public double getValor(){
        return valor;
    }
}
