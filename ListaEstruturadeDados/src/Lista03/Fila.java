/* Lista de Exercícios 01 - Estrutura de Dados
 * 
 * Aluno: Henrique Souza Lima
 */

package Lista03;

public class Fila {
	private int dados[];                  
	private int tamanho;
	
	public Fila() {                       
		dados=new int [10];                    
		tamanho=0;                            
	}
	
	// Adiciona elemento a fila
	public void AdicionaElemento(int elemento) {     

		if (tamanho < dados.length) {
			dados[tamanho] = elemento;                     
			tamanho ++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
		
		System.out.println("Fila:");
		for (int i = 0; i < dados.length; i ++) {
			System.out.println(dados[i]);
		}
		
	} 
	
	// Remove elemento da fila
	public int RemoveElemento() {

		int retorno = 0;
		if (tamanho>=1){                              
			retorno=dados[0];
			dados[0] = 0;
			for (int i=1;i<=tamanho;i++){                      
				dados[i-1]=dados[i];                        
			} 
			tamanho--;
			
			System.out.println("Fila:");
			for (int i = 0; i < dados.length; i ++) {
				System.out.println(dados[i]);
			}
		}
		else {
			System.out.println("Lista já está vazia !");
		}
		
		return retorno;
	}

}
	
	
	
	
	



