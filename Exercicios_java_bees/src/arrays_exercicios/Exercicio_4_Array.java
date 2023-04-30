package arrays_exercicios;

import java.util.Scanner;

public class Exercicio_4_Array {
	
	/*Crie um programa que receba valores do usuário para 
	preencher uma matriz 3X3, e em seguida, exiba a soma dos 
	valores dela e a soma dos valores da primeira diagonal, ou 
	seja, diagonal principal.*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		final int ArraySize1 = 3;
		final int ArraySize2 = 3;
		int numero = 0, result = 0;
		int soma = 0;
		//Criando uma matriz 3x3
		int[][] valor = new int[3][3];
		
		//Inserindo os dados na matriz solicitando-os ao usuário
		for (int i = 0; i < ArraySize1; ++i) {
			for (int j = 0; j < ArraySize2; ++j) {
			System.out.println("Digite o " + (j+1) + "º valor da posição " + i + ": ");
			numero = input.nextInt();
			valor[i][j] = numero;			
			soma =  soma + numero;//somando os dados informados
			}
		}
		//realizando a soma dos valores da primeira diagonal
		for (int i = 0; i < ArraySize1; ++i) {
			result = result + valor[i][i];
	
		}		
		System.out.println("O valor da soma dos valores é: " + soma + "\n");
		System.out.println("A soma dos valores da primeira diagonal (diagonal principal) é: " + result);	
	}

}
