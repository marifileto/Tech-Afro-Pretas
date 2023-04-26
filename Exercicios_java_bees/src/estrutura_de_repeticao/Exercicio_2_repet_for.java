package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_2_repet_for {

	/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de 
	três e que se encontram no conjunto dos números de 1 até 500.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		//declarando as variáveis que receberão valores
		int y, soma = 0; 

		//atribuindo a instrução de repetição		
		for (y = 1; y <= 500; y = y + 1){
			//atribuindo a condição
			if (y % 2 != 0 && y % 3 == 0){
				soma = soma + y;
			}
		}
		//imprimindo os resultados
		System.out.println("A soma dos ímpares múltiplos de três de 1 até 500 é: " + soma + ".\n");		
		
	}

}
