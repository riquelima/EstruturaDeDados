package Lista02;

// ------ LISTA DE STRING COM SEUS M�TODOS E OPERA��ES ------

public class ListaMetodos {
	private String[] dados; // array de strings
	private int tamanho; // capacidade de elementos guardados no array

	// **** Metodo construtor ****
	public ListaMetodos(int capacidade) {
		this.dados = new String[capacidade];
		this.tamanho = 0;
	}

	// **** Adiciona elementos a uma lista de strings ****
	public boolean adiciona(int i) {

		// verifica se a quantidade dos elementos = capacidade do vetor
		if (this.tamanho < this.dados.length) {
			this.dados[this.tamanho] = i;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// **** Remove elemento ****
	public void remove(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			String aux = this.dados[i];
			this.dados[i] = this.dados[i + 1]; // posicao i recebe elemento posi��o seguinte

			

		}

		this.tamanho--;

	}

	// **** Verifica se lista est� vazia ****
	public void vazia() {
		for (int i = 0; i < this.dados.length; i++) {
			if (this.dados[i] == null) {
				System.out.println("Elemento vazio na posi��o " + (i + 1));

			}
		}
	}

	// **** Verifica se lista est� cheia ****
	public void cheia() {
		if (tamanho == dados.length) {
			System.out.println("Lista Cheia");
		} else {
			System.out.println("Lista Vazia");
		}

	}

	// **** Adiciona elementos ao final da lista ****
	public void adicionaFinal(String elemento) {
		// verifica se o tamanho dos elementos = capacidade do vetor
		if (this.tamanho < this.dados.length) {
			this.dados[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			System.out.println("Lista cheia, n�o � poss�vel adicionar mais elementos");
		}

	}
	
	// **** Adiciona elemento a qualquer posicao do vetor
	public boolean adicionaQualquerPosicao(int posicao, String elemento) {
		//verifica se essa posicao � valida
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		
		//mover todos os elementos para abrir espa�o
		for(int i=this.tamanho-1; i >= posicao; i--) {
			this.dados[i+1]= this.dados[i]; 		
		}
		//inserir elemento na posicao desejada
		this.dados[posicao]= elemento;
		this.tamanho++;
		
		return false;
	}

	// **** Retorna os elementos da lista ****
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.dados[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.dados[this.tamanho - 1]);

		}
		s.append("]");

		return s.toString();
	}

}
