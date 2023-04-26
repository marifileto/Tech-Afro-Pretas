package exercicios_java;

import java.util.Scanner;

public class Exercicio_1_1_3 {
	
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float y, infantil, juvenil, adulto;
		int idade;
		
		System.out.println("Digite a idade de uma pessoa: ");
		idade = leia.nextInt();
		
							
			if ((idade <= 14) && (idade >= 10)) {
				System.out.println("Esta pessoa se encaixa na categoria infantil.");
			}
			
			else if ((idade <= 17) &&(idade >= 15)) {
				System.out.println("Esta pessoa se encaixa na categoria juvenil.");
			}
			
			else if ((idade <= 25) && (idade >= 18)) {
				System.out.println("Esta pessoa se encaixa na categoria adulto.");
			}
			
			else {
				System.out.println("Esta pessoa não se encaixa em nenhuma categoria.");
			}
	}

}
