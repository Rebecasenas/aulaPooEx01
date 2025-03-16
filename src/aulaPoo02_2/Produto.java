package aulaPoo02_2;


public class Produto {
    
    //atributos
    private String marca;
    private String fabricante;
    private String cod_barras;
    private float preco;
    
    //construtor
    public Produto(){
        //vazia
    }
    
    //Construtor com parâmetros para todos os atributos
    public Produto(String marca, String fabricante, String cod_barras, float preco){
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }
    
    //metodo get e set
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    public String getCod_barras(){
        return cod_barras;
    }
    
    public void setCod_barras(String cod_barras){
        this.cod_barras = cod_barras;
    }
    
     public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    // Método para exibir os dados do produto
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Código de Barras: " + cod_barras);
        System.out.println("Preço: R$ " + preco);
    }
    
}
