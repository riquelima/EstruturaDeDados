// --------------- EM CONSTRU��O ----------------

package EstruturaEstatica;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;

	}

	public EstruturaEstatica() {
		this(10);

	}

	// Adiciona elemento na posicao final
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// Adiciona em qualquer posicao
	public boolean adicionaQualquerPosicao(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) { // verifica se essa posicao � valida
			throw new IllegalArgumentException("Posi��o inv�lida");
		}

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) { // mover todos os elementos para abrir espa�o
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento; // inserir elemento na posicao desejada
		this.tamanho++;

		return true;
	}

	// Aumenta capacidade
	public void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// Retorna o tamanho da estrutura
	public int tamanho() {
		return this.tamanho;
	}
	
	//Adiciona capacidade a estrutura
	protected boolean adicionaCapacidade(T elemento) {
			this.aumentaCapacidade();
			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
			
		}

	// Retorna os elementos da estrutura utilizando a classe Arrays
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);

		}
		s.append("]");

		return s.toString();
	}

}

