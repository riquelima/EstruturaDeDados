/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista03;
import javax.swing.JOptionPane;

import Lista03.Pilha;

public class Teste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		int opc = 0;
		int elemento;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Adicionar Fila \n 2 - Remove Fila \n 3 - Adiciona Pilha \n 4 - Remove Pilha"));
			switch (opc) {
			case 1:
				fila.AdicionaElemento(Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento: ")));
				break;
			case 2:
				fila.RemoveElemento();
				break;
			case 3:
				pilha.AdicionaElemento(Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento: ")));
				break;
			case 4:
				elemento = pilha.RemoveElemento();
				fila.AdicionaElemento(elemento);
			}
		}

	}

}
