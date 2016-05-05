package PilhaOrdenacao;

import java.util.Random;

public class ExemploPilha {
	  public static void main(String[] args) {
	        Pilha p1 = new Pilha();
	        Pilha p3 ;
	        Random ale = new Random();
	        NumerosInteiros num;
	        for (int i = 0; i < 100; i++) {
	            p1.empilhar(new NumerosInteiros(ale.nextInt(1001)));
	        }
	        p1.imprimirPilha();
	        
	        
	       p3= p1.ordenar(p1);
	        
	       p3.imprimirPilha();
		 }

}
