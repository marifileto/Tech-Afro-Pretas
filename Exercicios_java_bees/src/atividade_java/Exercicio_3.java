package atividade_java;

import java.util.Scanner;

public class Exercicio_3 {

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variáveis que receberão valores
		float   nota1, nota2, nota3, media;

		//solicita na tela que o valor seja digitado
		System.out.println("Digite a primeira nota: ");
		//atribui o valor digitado à variável "nota1"
		nota1 = leia.nextFloat();

		//solicita na tela que o valor seja digitado  
		System.out.println("Digite a segunda nota: ");
		//atribui o valor digitado à variável "nota2"
		nota2 = leia.nextFloat();

		//solicita na tela que o valor seja digitado
		System.out.println("Digite a terceira nota: ");
		//atribui o valor digitado à variável "nota3"
		nota3 = leia.nextFloat();
		   
		//cálculo da média ponderada
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / (2+3+5);
		   
		//imprime o resultado na tela
		System.out.println("A média final do aluno é: " + media);		
		
		
		
		
		
	}

}
