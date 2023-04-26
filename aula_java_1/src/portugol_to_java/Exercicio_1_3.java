package portugol_to_java;

import java.util.Scanner;

public class Exercicio_1_3 {
	
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
	no final o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras 
	dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando 
	o usuário fornecer um valor negativo.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//igualando todas as variáveis a zero afim de garantir o valor inicial
		int cont = 0, soma = 0, y = 0, media = 0, total = 0;

		//solicitando o primeiro valor para que y seja inicializado
		System.out.println("\nForneça um valor: ");
		y = leia.nextInt();

		//iniciando o loop para o cálculo solicitado
		while (y >= 0){

			//atribuindo o valor de y ao valor anterior de soma
			soma = soma + y;
			//incrementando o cont para contar a quantidade de números positivos que serão inseridos pelo usuário
			cont = cont + 1;

			/*solicitando novo(s) valor(es) para que possa se dar a y os cálculos solicitados ou encerrar o 
			loop em caso de valor negativo*/
			System.out.println("\nForneça um novo valor ou um número negativo para encerrar o programa: ");
			y = leia.nextInt();
					
		}
		//verificando se pelo menos um valor fornecido é maior que zero, para exibir os resultados dos cálculos
		if (cont > 0){
			media = soma / cont;
			total = cont;
					
			//imprimindo os resultados para os valores positivos
			System.out.println("\nA soma dos valores positivos informados é de " + soma + "\n");
			System.out.println("\nA media dos valores positivos informados é de " + media + "\n");
			System.out.println("\nO total de valores positivos informados é de " + total + "\n");
		}
		//verificando se o valor fornecido é menor que zero para encerramento do programa
		if (y < 0){
			if (cont <= 1){
				//imprimindo os resultados para o valor negativo
				System.out.println("\nEste valor não será calculado.");
			}			
			System.out.println("\nVocê informou um valor negativo, por isso este programa foi encerrado.\n");
		}		

	}

}
