package atividade_java;

import java.util.Scanner;

public class Exercicio_2 {
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
	expressa em anos, meses e dias.*/

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//variáveis que receberão valores
		int idade, anos, meses, dias;
		
		
		//solicita na tela que o valor seja digitado	
		System.out.println("Digite sua idade em dias: ");
		//atribui o valor digitado à variável "idade"
		idade = leia.nextInt();
		
		//calcula o total de anos
		anos = idade / 365;
		//calcula o total de dias
		dias = idade % 365;
		//calcula o total de meses
		meses = dias / 30;
		//calcula o total de dias
		dias = dias % 30;
		
		//imprime o resultado na tela
		System.out.println("Marília, você tem " + anos + " anos, " + meses + 
		" meses e " + dias + " dias de vida.");
		
	}

}
