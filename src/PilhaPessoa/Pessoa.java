package PilhaPessoa;

public class Pessoa {
    
    private String nome;
    private int fone;
    private String endereco;
    private Pessoa proximo;  
  

    public Pessoa(String nome, int fone, String endereco){
        
        this.nome = nome;
        this.fone = fone;
        this.endereco = endereco;
        proximo = null;
    }
    
    public Pessoa(){
        
    }
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getFone() {return fone;}

    public void setFone(int fone) {this.fone = fone;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String email) {this.endereco = endereco;}

    public Pessoa getProximo() {return proximo;}

    public void setProximo(Pessoa proximo) {this.proximo = proximo;}
    
    public String toString(){
        
        return String.format("Nome: %s, Fone: %d, Endereco: %s", nome, fone, endereco);
    }
    
}
