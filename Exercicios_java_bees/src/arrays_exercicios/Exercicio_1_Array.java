package arrays_exercicios;

import java.util.Scanner;

public class Exercicio_1_Array {

	/*Faça um programa que crie um vetor por leitura com 5 valores 
	 de pontuação de uma atividade e o escreva em seguida. Encontre 
	 após a maior pontuação e a apresente.*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		double[] pontuacao = new double[5];//Criando um vetor de 5 posições
		double maiorPontuacao = 0;
		int contNumIgual = 0;
		
        //Inserindo os dados na matriz
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "º valor de pontuação: ");
			pontuacao[i] = input.nextDouble();		
		}
		
		//Informando os valores declarados pelo usuário
		System.out.println("Os valores informados foram: " + pontuacao[0] + ", " + 
		pontuacao[1] + ", " + pontuacao[2] + ", " + pontuacao[3] + ", " +
		pontuacao[4] + ", ");
			
		//Método for para cálculo da maior pontuação e contagem de números iguais
		for (int k = 0; k < 5; k++) {
			if (pontuacao[k] > maiorPontuacao) {
				maiorPontuacao = pontuacao[k];
			}else {
				if (pontuacao[k] == maiorPontuacao) {
					contNumIgual ++;
				}
			}
		}
		//Declarando as condições para imprimir os resultados esperados na tela
		if (contNumIgual == 4) {
			System.out.println("As pontuações informadas são iguais.\n");
			
		}else {
			System.out.println("O valor da maior pontuação é: " + maiorPontuacao + ".");
		}
	}

}
