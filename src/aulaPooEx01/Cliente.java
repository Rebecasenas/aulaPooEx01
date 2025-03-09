package aulaPooEx01;

public class Cliente {

    // Atribytos
    private String nome;
    private Integer rgm;
    private String email;


    // Construtor, para iniciar objetos
    public Cliente(String nome, Integer rgm, String email) {
        this.nome = nome;
        this.rgm = rgm;
        this.email = email;
    }

    // Métodos get
    public String getNome(){
        return nome;
    }

    public Integer getRgm(){
        return rgm;
    }

    public String getEmial() {
        return email;
    }
}
