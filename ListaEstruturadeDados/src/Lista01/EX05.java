/*
 *************************
Exerc�cio 5 - Criar e carregar uma matriz [4 x 4] inteiro, onde os valores da diagonal principal 
ser�o carregados pela aplica��o conforme o gr�fico e os demais dados ser�o digitados pelo usu�rio
Diagonal: 1 3 9 27
    
Programador: Henrique Souza Lima
Professor: F�bio
 *************************
 */


package Lista01;

import java.util.Random;

public class EX05 {

	public static void main(String[] args) {
	int matriz [][] = new int [4][4];
	
	Random valor = new Random();
	
	for (int l = 0; l < 4; l++) {
		for (int c = 0; c < 4; c++) {
			matriz[l][c] = valor.nextInt(30) + 1;
			
			if(l == c) {
				if (l==0) {
					matriz[l][c] = 1;
					
				}
				if(l==1) {
					matriz[l][c] = 3;
				}
				if(l==2) {
					matriz[l][c] = 9;
				}
				if(l==3) {
					matriz[l][c] = 27;
					
				}
				
			}
		}
	}
	
	for(int l=0; l < 4; l++) {
		for(int c=0; c < 4; c++) {
			System.out.println(matriz[l][c]+" ");
			
		}
		System.out.println();
	}
	
	
	
	}

}
