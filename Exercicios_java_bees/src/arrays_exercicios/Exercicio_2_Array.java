package arrays_exercicios;

import java.util.Scanner;

public class Exercicio_2_Array {

	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa 
	 que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e 
	 imprima a média aritmética dos lançamentos, contabilize e apresente também quantas 
	 foram as ocorrências da maior pontuação.*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		int[] valor = new int [10]; //Criando um vetor de 10 posições
		int soma = 0, contNumIgual = 0, contMaiorIgual = 0;
		double media = 0, maiorValor = 0;
		
		//Inserindo os dados na matriz solicitando-os ao usuário	
		for (int i = 0; i < valor.length; i++) {
			System.out.println("Informe o " + (i+1) + "º valor: ");
			valor[i] = input.nextInt();	
		}	
		//Imprimindo os dados declarados pelo usuário na tela, conforme suas posições
		System.out.println("Os valores informados foram: " + valor[0] + ", " + 
				valor[1] + ", " + valor[2] + ", " + valor[3] + ", " + valor[4] + ", " + 
				valor[5] + ", " + valor[6] + ", " + valor[7] + ", " + valor[8] + ", " + 
				valor[9] + ".\n");
		
		/*Utilizando o Método length, calculando a somatória dos dados para depois 
		calcular a média*/
		for (int k = 0; k < valor.length; k++) {
				soma = soma + valor[k];
		}
		//Utilizando o Método length, calculando a média dos dados 
		media = soma/valor.length;
		System.out.println("A média aritmética dos valores informados é: " + media + ".\n");
		
		//Verificando o maior valor dentre os dados
		for (int j = 0; j < valor.length; j++) {
			
			if (valor[j] > maiorValor) {
				maiorValor = valor[j];
			}else if (valor[j] == maiorValor) {
					contNumIgual = contNumIgual + 1;//contNumIgual++
				
			}
		}
		//Verificando se os valores informados são todos iguais
		for (int m = 0; m < valor.length; m++) {
			if (maiorValor == valor[m]) {
				contMaiorIgual++;
			}
		}
		//Condicionando os resultados para imprimir na tela o esperado
		if (contNumIgual == 9) {
			System.out.println("Os valores informados são iguais, portanto não existe um maior que outro.");
		}else {
			System.out.println("O maior valor informado foi: " + maiorValor + ". Este valor foi informado " + contMaiorIgual + " vezes.\n");
		}
		
		}
		
}

