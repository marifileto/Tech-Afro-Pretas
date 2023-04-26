package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_6_repet_do_while {
	
	/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 
	até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.*/
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//declarando as variáveis e seus valores
		int numero = 0, valor = 1, soma = 0;

		//solicita na tela que o valor seja digitado
		System.out.println("Digite um número: ");
		//atribui o valor digitado à variável "numero"
		numero = leia.nextInt();

		//inicia a estrutura de repetição	
		do {
			//somando cada valor ao seu anterior
			soma = soma + valor;
			//somando cada valor
			valor = valor + 1;

		//limita o looping até o número digitado	
		}while (valor <= numero);

		//imprime na tela o resultado da doma de todos os números de 1 até o valor digitado
		System.out.println("\nO número digitado foi: " + numero + " e a soma final é: " + soma + ".\n");
				
	}

}
