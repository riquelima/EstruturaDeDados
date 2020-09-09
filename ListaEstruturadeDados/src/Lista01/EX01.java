/*
 *************************
Exerc�cio 1 - Lista 01 - Estrutura de Dados 
1 - Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
        M�dia dos saldos positivos entre 100 � 1000
        M�dia geral dos saldos
        Soma dos saldos negativos
Programador: Henrique Souza Lima
Professor: F�bio
 *************************
 */

package Lista01;
import java.util.Random;

public class EX01 {

	public static void main(String[] args) {
		System.out.println();;
		// Declarando vari�veis
		float vet[] = new float [100];
		float mediapositivos=0, mediageral=0, somanegativos=0;
		
		// Entrada de dados e manipula��o	
		Random r = new Random();  
		for(int i= 0; i < vet.length; i++){			
			vet[i] = r.nextInt(1000); // gerando n�mero aleat�rio
			System.out.println("Posi��o " + (i+1) + " = " + vet[i] );
			mediageral= mediageral + vet[i];			
			
			if ((vet[i] >= 100)&&(vet[i] <= 1000)) {
				mediapositivos = mediapositivos + vet[i];				
			}else if (vet[i] < 100) {
				somanegativos = somanegativos + vet[i];
				
			}
			
			
		}
		mediageral = mediageral/100; //coletando a m�dia geral dos saldos
		mediapositivos= mediapositivos/100; // coletando a m�dia dos saldos entre 100 a 1000
		System.out.println(" --------------------------------------- ");
		System.out.println("M�dia dos Saldos Entre 100 a 1000 = " + mediapositivos );
		System.out.println("M�dia Geral dos Saldos = " + mediageral);
		System.out.println("A soma dos negativos < 100 = " + somanegativos);
		

	}

}
