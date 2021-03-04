package exercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lista {
	public int lista[];
	public int elementos;
	public Lista(){
		lista = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da " + this.getClass().getSimpleName()))];
		elementos = 0;
	}
	
	protected void adicionaElemento(int l,int n) {
		if(elementos < lista.length) {
				for(int i = elementos; i > l; i--) {
					lista[i] = lista[i - 1];
				}
			lista[l] = n;
			elementos++;			
		}
		else {
			JOptionPane.showMessageDialog(null,this.getClass().getSimpleName() + " cheia!");
		}
	}
	
	protected int removeElemento(int l) {
		if(elementos > 0) {
			if(l >= 0) {
				for (int i = l; i < elementos -1; i++) {
					lista[i] = lista[i + 1];
				}
				int aux = lista[elementos - 1];
				lista[elementos - 1] = 0;
				elementos--;
				return aux;
			}else {
				JOptionPane.showMessageDialog(null, "Indice inválido!");
				return 0;
			
			}
		}
		else {
			JOptionPane.showMessageDialog(null, this.getClass().getSimpleName() + " vazia!");
			return 0;
			
		}

	}
	
	public void preenche() {		
		Random r = new Random();
		for (int i = elementos; i < lista.length; i++) {		
			adicionaElemento(elementos, r.nextInt(100));
		}
	}
	
}
