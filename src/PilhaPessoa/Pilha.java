package PilhaPessoa;
import javax.swing.JOptionPane;


public class Pilha {
    private Pessoa topo;
    
    public Pilha(){
        topo = null;
    }

    public boolean vazia(){
        return topo == null;
    }
 
    public Pessoa topoDaPilha(){
        return topo;
    }

    public void empilhar(Pessoa pessoa){
        
        if(!vazia())
            pessoa.setProximo(topo);
        
        topo = pessoa;
    }
    
  
    public Pessoa desempilhar(){
        if(vazia()){
            return null;
        }
        Pessoa retorno = topo;
        topo = topo.getProximo();
        retorno.setProximo(null);
        return retorno;
    }

   

  

    public void imprimirPilha(){
        if(vazia())
            JOptionPane.showMessageDialog(null, "Pilha vazia");
        else{
            String dados = "";
            Pessoa aux = topo;
            int i=0;    
            while (aux != null) {
                dados = dados+"\n"+aux;
                aux = aux.getProximo();
            }
        JOptionPane.showMessageDialog(null, dados);
            }
            System.out.println("");
    }
}
