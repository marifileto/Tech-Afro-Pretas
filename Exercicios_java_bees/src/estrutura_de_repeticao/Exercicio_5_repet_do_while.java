package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_5_repet_do_while {
	
	/*Faça um programa que mostre uma contagem na tela de 233 a 456, só contando de 3 em 3 
	quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//declarando a variável e seu valor para início do looping
		int numero = 233;

		//inicia a estrutura de repetição
		do {
			if (numero >= 300 && numero <= 400){

				//declara a soma alternada
				numero += 3;

				//saída de dados
				System.out.print(numero);
				System.out.print(" somando de 3 em 3\n");
						
			}else{

				//declara a soma alternada
				numero += 5;

				//saída de dados
				System.out.print(numero);
				System.out.print(" somando de 5 em 5\n");
			}

		//limita o looping até o número 456
		}while (numero <= 456);		
		
		
	}

}
