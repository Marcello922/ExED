package exercicio2;

import java.util.Arrays;

import javax.swing.JOptionPane;

import exercicio1.Fila;

public class Teste {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		Fila f = new Fila();
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 - Adicionar Valores \n Trocar valores de: \n 2 - Fila para Pilha \n 3 - Pilha para Fila \n 4 - Sair"));
			switch(op) {
			case 1:
				int op2;
				do {
					 op2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Preencher fila \n 2 - Preencher pilha \n 3 - Voltar"));
					 switch(op2){
					 case 1:
						 f.preenche();
						 JOptionPane.showMessageDialog(null, Arrays.toString(f.lista));
						 break;
					 case 2:
						 p.preenche();
						 JOptionPane.showMessageDialog(null, Arrays.toString(p.lista));
						 break;
					 case 3:
					 	 break;
					 default:
						 JOptionPane.showMessageDialog(null, "Nº de operação inválido!");
					 }
				}while(op2 != 3);
				
				break;
			case 2:
				try{
					p.adicionaElemento(f.lista[0]);
					f.removeElemento();
				}
				catch(ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "Pilha vazia!");
				}
				JOptionPane.showMessageDialog(null, "Fila: \n"+Arrays.toString(f.lista) + "\n Pilha:" + Arrays.toString(p.lista));
				break;
			case 3:
				try {
					f.adicionaElemento(p.lista[p.elementos - 1]);
					p.removeElemento();					
				}catch(ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "Pilha vazia!");
				}
				JOptionPane.showMessageDialog(null, "Fila: \n"+Arrays.toString(f.lista) + "\n Pilha:" + Arrays.toString(p.lista));
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nº de Operação inválido!");
			}
		}while(op != 4);
	}
	

}
