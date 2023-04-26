package portugol_to_java;

import java.util.Scanner;

public class Exercicio_1_4 {
	
	/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5, 
	deveremos observar na tela a seguinte sequência: 5 15 45 135.*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//declarando as variáveis que receberão valores
		int y = 0, cont = 0;

		//solicita na tela que o valor seja digitado
		System.out.println("Digite um número até 100: ");
		//atribui o valor digitado à variável "y"
		y = leia.nextInt();

		//inicializa a contagem com o valor digitado pelo usuário
		cont = y;

		//imprime o valor de y na tela
		System.out.println(" " + cont);

		//iniciando o loop para o cálculo solicitado
		while (cont <= 100){
					
			cont = cont * 3;
			//imprime os resultados na tela
			System.out.println(" " + cont);
		}
	}

}
