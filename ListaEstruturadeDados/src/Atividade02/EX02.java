package Atividade02;

import Atividade02.ListaMetodos;

/*------ CLASSE PRINCIPAL DE EXECUÇÃO DO PROGRAMA ------
      2 - Implemente na classe Lista um método que remove o elemento de uma posição 
      específica recebida por parâmetro.
*/

public class EX02 {

	public static void main(String[] args) {

		// definindo a lista e seu tamanho
		ListaMetodos lista = new ListaMetodos(5);

		// adicionando elementos a lista
		lista.adiciona("Elemento 01");
		lista.adiciona("Elemento 02");
		lista.adiciona("Elemento 03");
		lista.adiciona("Elemento 04");
		lista.adiciona("Elemento 05");

		// imprime a lista antes de remover o elemento desejado
		System.out.println(lista);
		lista.remove(1);

		// imprime a lista apos remover o elemento desejado
		System.out.println(lista);

	}

}
