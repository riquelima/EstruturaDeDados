/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista03;

public class PilhaLivros {
	private int tamanho;   
	private LivroMetodos[] livros;
	
	public PilhaLivros() {
		livros = new LivroMetodos[5];
		tamanho = 0;
	}
	
	// Adiciona livro a pilha
	public void AdicionaLivro(String titulo, int quantidade) {
		if (tamanho < livros.length) {
			LivroMetodos livro = new LivroMetodos(titulo, quantidade);
			livros[tamanho] = livro;                     
			tamanho ++;
			
			for (int i = 0; i < tamanho; i ++) {
				System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
			}
		}
		else{
			System.out.println("Pilha de livros cheia");    
		}
		
	}
	
	// Remove livro da pilha
	public void RemoveLivro() {
		if (livros.length >= 1 && tamanho > 0) {
			
			livros[tamanho-1] = null;
			tamanho --;
			
			System.out.println("Livro removido do final da pilha");
			
		} else {
			
			System.out.println("Pilha de livros ja esta vazia");
			
		}
	}
	
	// Exibe livro da pilha
	public void ExibeLivro() {
		for (int i = 0; i < tamanho; i ++) {
			System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
		}
	}

}
