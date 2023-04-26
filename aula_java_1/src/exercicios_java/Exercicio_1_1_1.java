package exercicios_java;

import java.util.Scanner;

public class Exercicio_1_1_1 {
	
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double numero, numMaior = 0;
		int contNumIgual = 0;
		
		for (int y = 1; y <= 3; y++){
			System.out.println("Digite o número " + y + ": ");
			numero = leia.nextInt();
		
			if (numero > numMaior) {
				numMaior = numero;
			}
				
			else{ 
				if (numero == numMaior) {
				contNumIgual ++;
				}
			}
		}
		if (contNumIgual == 2) {
			System.out.println("Dentre os números informados, não há um número maior que outro.");
			
		}else {
			System.out.println("Dentre os números informados, o maior é: " + numMaior);
		}
			
	}

}
