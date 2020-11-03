package Lista04;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int v[] = { 11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82 };
		int w[] = new int[v.length];

		mergeSort(v, w, 0, v.length - 1);
		System.out.println(Arrays.toString(v));

	}

	// Definindo o meio do vetor e realizando a divisão por recursão
	private static void mergeSort(int v[], int w[], int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim)/2;
			mergeSort(v, w, ini, meio); // Ordena a primeira metade do vetor
			mergeSort(v, w, meio+1, fim); // Ordena a segunda metade do vetor
			intercalar(v, w, ini, meio, fim); // Método para intercalar e unir os vetores ordenados
		}

	}

	// Realizando a intercalação dos dois vetores ordenados
	public static void intercalar(int v[], int w[], int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) {
			w[k] = v[k];
		}

		int i = ini;
		int j = meio + 1;

		for (int k = ini; k <= fim; k++) {
			if (i > meio) {
				v[k] = w[j++];
			} else if (j > fim) {
				v[k] = w[i++];

			} else if (w[i] < w[j]) {
				v[k] = w[i++];
			} else {
				v[k] = w[j++];
			}
		}

	}

}
