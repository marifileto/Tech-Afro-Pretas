package estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio_2_If_Else {

	/*Faça um programa que entre com três números e coloque em ordem crescente.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float menor, maior, meio, contNumIgual = 0;
		int num1,num2, num3;
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
			
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();	
		
		System.out.println("Digite o 3º número: ");
		num3 = leia.nextInt();
		
		menor = num1;
		
		
		if (num2 < menor) {
			menor = num2;
		}	
		
		if (num3 < menor) {
			menor = num3;
		}
		
		maior = num1;
		
		if (num2 > maior){
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
	
		meio = (num1 + num2 + num3) - menor - maior;
	
		
		
		if (num1 == num2) {
			if (num2 == num3) {
			System.out.println("Os número informados são iguais.");
			}
		}else {
			System.out.println("A ordem crescente dos números informados é a seguinte: " + menor + ", " + meio + " e " + maior);
		}
	}
}
