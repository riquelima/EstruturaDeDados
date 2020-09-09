/*
 *************************
Exercício 4 - Carregar uma matriz [4 x 4 inteiro]. Apresentar:
            Soma dos valores no intervalo de 1 a 100
           Quantidade de números ímpares entre 30 a 50
           Quantidade de números divisíveis por 8
           Quantidade de números ímpares divisíveis por 3
           Fatorial do maior número informado na matriz
    
Programador: Henrique Souza Lima
Professor: Fábio
 *************************
 */

package Atividade01;

import java.util.Random;

public class EX04 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int soma = 0, numDivisiveispor8 = 0, numDivisiveispor3 = 0 , numImparesIntervalo=0;
		

		Random valor = new Random();

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				matriz[l][c] = valor.nextInt(100) + 1; // matriz recebe valor aleatório entre 1 e 100
				soma = soma + matriz[l][c]; // soma dos valores antre 1 e 100

				if (matriz[l][c] / 8 == 0) { // Quantidade de Numeros Divisiveis por 8.
					numDivisiveispor8 = numDivisiveispor8 + 1;

				}
				if (matriz[l][c] % 2 == 1) { // Verificando os ímpares.
					if (matriz[l][c] / 3 == 0) { // Quantidade de Ímpares Divisíveis por 3.
						numDivisiveispor3 = numDivisiveispor3 + 1;

					} else if (matriz[l][c] >= 30 && matriz[l][c] <= 50) {
						numImparesIntervalo = numImparesIntervalo + 1;
						

					}

				}

			}
		}
		System.out.println("SOMA = " + soma);
		System.out.println("numDivPor8 = " + numDivisiveispor8);
		System.out.println("numDivPor3 = " + numDivisiveispor3);
		System.out.println("numImpares entre 30 e 50 = " + numImparesIntervalo);

	}

}
