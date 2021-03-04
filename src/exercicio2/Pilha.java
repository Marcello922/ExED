package exercicio2;

import exercicio1.Lista;

public class Pilha extends Lista {
	
	public void adicionaElemento(int n) {
		adicionaElemento(elementos,n);
	}
	public void removeElemento() {
		removeElemento(elementos);
	}
	
}
