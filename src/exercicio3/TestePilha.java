package exercicio3;



import javax.swing.JOptionPane;

public class TestePilha {
	public static void main(String[] args) {
		PilhaLivros livros = new PilhaLivros(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da pilha de livros:")));
		int op;
		do {
			String titulo = "";
			int exemplares = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 - Adiciona Livro \n 2 - Remove Livro  \n 3- Mostra Pilha \n 4 - Sair."));
			switch(op) {
				case 1:
					titulo = JOptionPane.showInputDialog("Digite o titulo do livro: ");
					exemplares = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
					livros.adiciona(new Livro(titulo, exemplares));					
					break;
				case 2:
					livros.remove();
					break;
				case 3:
					livros.percorre();
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Nº de Operação inválido!");
					break;	
		}
		}while(op != 4);
	}
}
