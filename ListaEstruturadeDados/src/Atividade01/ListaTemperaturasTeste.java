package Atividade01;

import Lista02.ListaMetodos;

public class ListaTemperaturasTeste {

	public static void main(String[] args) {
		
		// definindo a lista e seu tamanho
				ListaMetodos lista = new ListaMetodos(10);

				// adicionando elementos a lista
				lista.adiciona("25� graus");
				lista.adiciona("41� graus");
				lista.adiciona("17� graus");
				lista.adiciona("20� graus");
				lista.adiciona("30� graus");

				// imprime a lista com temperaturas
				System.out.println("------- Lista de temperaturas ---------");
				System.out.println(lista);				

				// adiciona uma temperatura no inicio da lista
				System.out.println("");
				System.out.println("------- Adicionando temperatura ao inicio ---------");
				lista.adicionaQualquerPosicao(0, "22� graus");				
				System.out.println(lista);
				
				// adiciona uma temperatura no final  da lista
				System.out.println("");
				System.out.println("------- Adicionando temperatura ao inicio ---------");
				lista.adicionaFinal("90� graus");			
				System.out.println(lista);
				
				// adiciona uma temperatura na posicao desejada da lista
				System.out.println("");
				System.out.println("------- Adicionando temperatura ao inicio ---------");
				lista.adicionaQualquerPosicao(4, "52� graus");				
				System.out.println(lista);
				
				// remove a temperatura do inicio da lista
				System.out.println("");
				System.out.println("------- Removendo temperatura ao inicio ---------");
				lista.remove(0);
				System.out.println(lista);
				
				// remove a temperatura do inicio da lista
				System.out.println("");
				System.out.println("------- Removendo temperatura do final ---------");
				lista.remove(4);
				System.out.println(lista);
				
				// remove a temperatura da posicao desejada da lista
				System.out.println("");
				System.out.println("------- Removendo temperatura do final ---------");
				lista.remove(2);
				System.out.println(lista);
				
				
				
				
				
				
				

			}

	}


