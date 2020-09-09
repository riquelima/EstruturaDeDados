package Atividade02;

public class EX05 {

	public static void main(String[] args) {
		// definindo a lista e seu tamanho
		ListaMetodos lista = new ListaMetodos(10);

		// adicionando elementos ao inicio da lista
		lista.adiciona("30� Celsius");
		lista.adiciona("40� Celsius");
		lista.adiciona("50� Celsius");
		lista.adiciona("60� Celsius");
		lista.adiciona("70� Celsius");

		// verificar se a lista esta vazia
		System.out.println("Verificando espa�os vazios na lista:");
		lista.vazia();

		// verificar se a lista esta cheia
		System.out.println("------------------");
		System.out.println("Verificando se a lista est� cheia:");
		lista.cheia();

		// inserindo novos elementos ao final da lista cheia
		System.out.println("-----------");
		System.out.println("Inserindo sexto elemento a lista[10]:");
		lista.adicionaFinal("100� Celsius");
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
