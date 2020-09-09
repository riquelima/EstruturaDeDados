/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista01;

import javax.swing.JOptionPane;
import Lista01.PilhaLivros;
import Lista01.LivroMetodos;
import Lista01.FilaLivros;

public class TesteLivro {

	public static void main(String[] args) {
		PilhaLivros livros = new PilhaLivros();
		FilaLivros livrosFila = new FilaLivros();
		int opc = 0;
		String titulo;
		int quantidade;
		LivroMetodos elemento;
	
		// Criando Menu 
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro(Pilha) \n2 - Remove Livro(Pilha) "
					+ "\n3 - Exibir Livros(Pilha) \n4 - Adicionar Livro(Fila) \n5 - Remove Livro(Fila) \n6 - Exibir Livros(Fila)"));
			switch(opc) {
			case 1: titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares"));
					livros.AdicionaLivro(titulo, quantidade);
			break;
			case 2: livros.RemoveLivro();
			break;
			case 3: livros.ExibeLivro();
			break;
			case 4: titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares"));
			livrosFila.AdicionaLivro(titulo, quantidade);
			break;
			case 5: elemento = livrosFila.RemoveLivro();
					livros.AdicionaLivro(elemento.getTitulo(), elemento.getQuantidade());
			break;
			case 6: livrosFila.ExibeLivros();
			break;
			}
		}

		
	}

}
