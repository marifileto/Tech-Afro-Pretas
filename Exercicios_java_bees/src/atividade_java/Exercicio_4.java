package atividade_java;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio_4 {

/*Construa um programa em que, tendo como dados de entrada dois pontos quaisquer 
no plano, P(x1, y1) e P(x2, y2),escreva a distância entre eles. A fórmula que 
efetua tal cálculo é:*/
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		//variáveis que receberão valores
		float x1, x2, y1, y2;
		double d;

		//solicita na tela que o valor seja digitado
		System.out.println("Digite o valor de x1: ");
		//atribui o valor digitado à variável "x1"
		x1 = leia.nextFloat();

		//solicita na tela que o valor seja digitado
		System.out.println("Digite o valor de x2: ");
		//atribui o valor digitado à variável "x2"
		x2 = leia.nextFloat();

		//solicita na tela que o valor seja digitado
		System.out.println("Digite o valor de y1: ");
		//atribui o valor digitado à variável "y1"
		y1 = leia.nextFloat();

		//solicita na tela que o valor seja digitado
		System.out.println("Digite o valor de y2: ");
		//atribui o valor digitado à variável "y2"
		y2 = leia.nextFloat();

		//calcula a variável "d"
		d = Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));

		
		//imprime o resultado na tela
		System.out.println("\n A tal distancia é " + d);	
		
				
	}

}
