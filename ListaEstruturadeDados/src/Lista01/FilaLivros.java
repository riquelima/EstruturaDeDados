/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista01;

public class FilaLivros {
	
	private int tamanho;   
	private LivroMetodos[] livros;
	
	public FilaLivros() {
		livros = new LivroMetodos[5];
		tamanho = 0;
	}
	
	// Adiciona livro a fila
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
			System.out.println("Fila de livros cheia");    
		}
		
	}
	
	// Remove Livro da fila	
	public LivroMetodos RemoveLivro() {
		LivroMetodos elemento = null;
		if (livros.length >= 1 && tamanho > 0) {
						
			elemento = livros[tamanho-1];
			livros[tamanho-1] = null;
			tamanho --;
			
			System.out.println("Livro removido do final da fila");
			
		} else {
			
			System.out.println("Fila de livros ja esta vazia");
			
		}
		
		return elemento;
	}
	
	// Exibe livros da fila
	public void ExibeLivros() {
		for (int i = 0; i < tamanho; i ++) {
			System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
		}
	}

}
