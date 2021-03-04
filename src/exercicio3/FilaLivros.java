package exercicio3;

import javax.swing.JOptionPane;

public class FilaLivros {
	Livro dados[];
	private int quantidade;
	
	public FilaLivros(int capacidade) {
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
			for(int i = 0;i < quantidade;i++) {
				dados[i] = dados[i+1];
			}
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
				System.out.println("T�tulo: " + dados[i].getTitulo() +". Exemplares: "+ dados[i].getExemplares());				
			}
		}
	}
}
