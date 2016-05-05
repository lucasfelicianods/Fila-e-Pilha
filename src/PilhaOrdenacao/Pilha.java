package PilhaOrdenacao;

public class Pilha {

	private NumerosInteiros topo;
	
	public Pilha(){
		
	}
	
	public boolean vazia(){
		return topo == null;
	}
	
	public NumerosInteiros topoPilha(){
		return topo;
	}
	
	  public void empilhar(NumerosInteiros numero){
	        
	        if(!vazia())
	            numero.setProximo(topo);
	        
	        topo = numero;
	    }
	
	  public NumerosInteiros desempilhar(){
	        if(vazia()){
	            return null;
	        }
	        NumerosInteiros retorno = topo;
	        topo = topo.getProximo();
	        retorno.setProximo(null);
	        return retorno;
	    }
	  public Pilha ordenar(Pilha p1){
		  Pilha p3 = new Pilha();
		  Pilha aux = new Pilha();
		  NumerosInteiros menor;
		  
		  menor = p1.desempilhar();
		 
		  while (menor!=null){
			if (p3.vazia()){
				p3.empilhar(menor);
				
			}else{
					while (!p3.vazia()&&menor.getNumeros() > p3.topoPilha().getNumeros()){
						aux.empilhar(p3.desempilhar());
					}
						p3.empilhar(menor);
					while (!aux.vazia()) {
						p3.empilhar(aux.desempilhar());
						
					}
					
			  
				 }
			menor = p1.desempilhar();
		  }	  
		  return p3;
	  }
		
	public void imprimirPilha(){
		if(vazia())
            System.out.println("Pilha vazia");
        else{
            System.out.println("elementos da pilha");
            NumerosInteiros aux = topo;
            int i=0;
            while(aux != null){
                if(i%10 == 0)
                    System.out.println("");
                System.out.print(aux+"\t");
                aux = aux.getProximo();
                i++;
            }
            System.out.println("");
        }
		System.out.println("-------------\n");
    }
	
	

}