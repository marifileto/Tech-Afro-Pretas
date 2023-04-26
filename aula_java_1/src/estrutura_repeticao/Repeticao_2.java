package estrutura_repeticao;

import java.util.Scanner;

public class Repeticao_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	

		int resultado, numero, contador = 1;
		
		while (contador < 4) {
			System.out.println("Digite o " + contador + "º número:");
			numero = leia.nextInt();
			
			resultado = numero * 3;
			
			System.out.println(numero + " x 3 = " + resultado);
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
			contador++;
			
		}
		
		System.out.println("\t\t______Fim do problema______");
	}

}
