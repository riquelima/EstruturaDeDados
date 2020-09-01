package Lista02;

import Lista02.ListaMetodos;

/*------ CLASSE PRINCIPAL DE EXECUÇÃO DO PROGRAMA ------
3  - 
*/

public class EX03 {

	public static void main(String[] args) {

		// definindo a lista e seu tamanho
		ListaMetodos lista = new ListaMetodos(10);

		// adicionando elementos ao inicio da lista
		lista.adiciona("Elemento 01");
		lista.adiciona("Elemento 02");
		lista.adiciona("Elemento 03");
		lista.adiciona("Elemento 04");
		lista.adiciona("Elemento 05");

		// imprime lista de elementos adicionados
		System.out.println("Elementos adicionados");
		System.out.println(lista);
		System.out.println("-----------");

		// utilizando metodo que verifica se a lista possui campos vazios
		lista.vazia();

		// utilizando metodo que verifica se lista esta cheia
		System.out.println(" --------------- ");
		System.out.println("Capacidade da Lista:");
		lista.cheia();

		// inserindo novos elementos ao final da lista cheia
		System.out.println("-----------");
		System.out.println("Inserindo sexto elemento a lista[10]:");
		lista.adicionaFinal("Elemento 06"); // exibe erro de lista cheia
		System.out.println(lista);

		// inserindo elemento em qualquer posicao da lista
		System.out.println("----------");
		System.out.println("Inserindo elemento X na posicao 1 da lista");
		System.out.println(lista); // exibindo lista antes de inserir elemento.
		lista.adicionaQualquerPosicao(1, "Elemento X");
		System.out.println(lista);

		// remover caractere na posicao desejada na lista
		System.out.println("------------");
		System.out.println("Remover caractere do inicio da lista (posicao 1)");
		System.out.println(lista); // exibindo a lista antes de remover elemento
		lista.remove(1); // removendo elemento da lista na posicao desejada
		System.out.println(lista); // exibindo a lista com elemento removido

	}

}
