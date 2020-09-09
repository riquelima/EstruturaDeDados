/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista03;

public class Pilha {

	private int pilha[];
	private int tamanho;

	public Pilha() {
		pilha = new int[5];
		tamanho = 0;
	}

	//Adiciona elemento a pilha
	public void AdicionaElemento(int elemento) {

		if (tamanho < pilha.length) {
			pilha[tamanho] = elemento;
			tamanho++;
		} else {
			System.out.println("Lista Cheia");
		}

		System.out.println("Pilha:");
		for (int i = 0; i < pilha.length; i++) {
			System.out.println(pilha[i]);
		}

	}

	//Remove elemento da pilha
	public int RemoveElemento() {

		int retorno = 0;
		if (tamanho >= 1) {
			retorno = pilha[tamanho - 1];
			pilha[tamanho - 1] = 0;
			tamanho--;

			System.out.println("Pilha:");
			for (int i = 0; i < pilha.length; i++) {
				System.out.println(pilha[i]);
			}
		} else {
			System.out.println("Pilha já está vazia !");
		}

		return retorno;
	}

}
