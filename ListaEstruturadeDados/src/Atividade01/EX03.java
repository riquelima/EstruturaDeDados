/*
 *************************
Exercício 3 - Lista 01 - Estrutura de Dados 
3 - Carregar um vetor [100] inteiros positivos ou negativos. 
Classificar este vetor em ordem crescente e apresentar os valores.
    
Programador: Henrique Souza Lima
Professor: Fábio
 *************************
 */

package Atividade01;

public class EX03 {

	public static void main(String[] args) {
		
		int vet[] = {5, 3,-2, 0, 7}; 
		int aux = 0;
				
		
		// odenacao vetor de forma crescente
		for (int j=0; j < vet.length; j++ ) {
			for (int c=0; c < vet.length; c++) {
				if(vet[j] < vet[c]) {
					aux = vet[j];
					vet[j] = vet[c];
					vet[c] = aux;
					
				}
			}
			
		}
		
		// exibição vetor ordenado
		for (int i=0; i < vet.length; i++) {
			System.out.println(vet[i]+" "); 
			
		}
		

	}


}
