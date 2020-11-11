package Atividade07;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int v[] = {149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105};
		
		quicksort(v, 0, v.length -1);
		System.out.println(Arrays.toString(v));
		

	}

	// Achando pivô e fazendo chamada recursiva de método para separar os elementos menores e maiores que o pivô
	private static void quicksort(int[] v, int esq, int dir) {
		if (esq < dir) {
			int j = separar(v, esq, dir);
			quicksort(v, esq, j-1);
			quicksort(v, j+1, dir);
		}
		
	}

	// Separar elementos menores e maiores que pivo
	private static int separar(int[] v, int esq, int dir) {
		int i = esq+1;
		int j = dir;
		int pivo = v[esq];
		while (i <= j ) {
			if (v[i] <= pivo) i++;
			else if (v[j] > pivo) j--;
			else if (i <= j) {
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esq, j); // Reinserindo o pivô no centro
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}

}
