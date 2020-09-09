/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista01;

public class LivroMetodos {
	
	private String titulo;
	private int quantidade;
	
	public LivroMetodos(String titulo, int quantidade) {
		this.titulo = titulo;
		this.quantidade = quantidade;
		
	}
    // Retornando o titulo do livro 
	public String getTitulo() {
		return titulo;
	}
	// Definindo o titulo do livro 
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// Retornando a quantidade de livros
	public int getQuantidade() {
		return quantidade;
	}

	// Definindo a quantidade de livros
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
