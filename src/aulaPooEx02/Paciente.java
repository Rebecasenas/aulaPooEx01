package aulaPooEx02;


public class Paciente {
    
    //atributos
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;
    
    //cosntrutor
    public Paciente(){
        //vazio
    }
    
    //contrutor que inicia nome
    public Paciente(String nome){
        this.nome = nome; 
    }
    
    //metodo getter e setter para acessar e modificar os atributos
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRg(){
        return rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getProfissao(){
        return profissao;
    }
    
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    
    //metodo para exibir os dados do objeto
    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Profissão: " + this.profissao);
    }
}