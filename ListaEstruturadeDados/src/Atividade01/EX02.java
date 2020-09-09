/*
 *************************
Exerc�cio 2 - Lista 01 - Estrutura de Dados 
2 - Carregar um vetor [5] inteiro. Enviar cada elemento para uma fun��o e
    esta ir� retornar o seu fatorial que ser� armazenado em um outro vetor.
    Exibir os dados dos vetores.
    
Programador: Henrique Souza Lima
Professor: F�bio
 *************************
 */


package Atividade01;


public class EX02 {

	public static void main(String[] args) {
				int vetA[] = {1, 2, 3, 4, 5};   // Declarando vari�veis
				int vetB[] = new int [5];
							
				
				for (int i = 0; i < vetB.length; i++) {
					vetB[i] = SetFatorial(vetA[i]);
					
					if (i == vetB.length - 1) {
						System.out.println(vetB[i]);						
					}else {
						System.out.println(vetB[i] + ", " );
					}
					
				}
				
	 
						
	}
	
	public static int SetFatorial (int valor) {
		return ( (valor <= 1) ? 1 : (valor * SetFatorial(valor-1)) );
		
	}
	


}
