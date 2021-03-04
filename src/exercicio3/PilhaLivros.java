package exercicio3;

import javax.swing.JOptionPane;

public class PilhaLivros {

	Livro dados[];
	private int quantidade;
	
	public PilhaLivros(int capacidade) {
		dados = new Livro[capacidade];
		quantidade = 0;
	}
	
	public void adiciona(Livro e) {
		if(quantidade < dados.length){
			dados[quantidade] = e;
			quantidade++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Lista cheia");
		}
	}
	
	public void remove() {
		Livro r = null;
		if(quantidade > 0) {
			dados[quantidade - 1] = r;
			quantidade--;
		}
		else {
			JOptionPane.showMessageDialog(null, "Lista vazia!");
		}
	}
	
	public void percorre() {
		if(quantidade == 0) {
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
		}else {
			for(int i = 0; i<quantidade;i++) {
				System.out.println("Título: " + dados[i].getTitulo() +". Exemplares: "+ dados[i].getExemplares());				
			}
		}
	}
}
