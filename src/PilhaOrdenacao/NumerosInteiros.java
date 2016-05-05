package PilhaOrdenacao;

public class NumerosInteiros {
	private int numeros;
	private NumerosInteiros proximo;
	
	public NumerosInteiros (int numero){
		this.numeros = numero;
		this.proximo = null;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public NumerosInteiros getProximo() {
		return proximo;
	}

	public void setProximo(NumerosInteiros proximo) {
		this.proximo = proximo;
	}
	
	 public String toString(){
	        return String.format("%d", numeros);
	    }

}
