package portugol_to_java;

	import java.util.Scanner;

public class Exercicio_1 {

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		//variáveis que receberão valores
		int segundos, totalSegundos, totalMinutos, totalHoras;
		
		//solicita na tela que o valor seja digitado
		System.out.println("Digite o número de segundos: ");
		//atribui o valor digitado à variável "segundos"
		segundos = leia.nextInt();
		
		//calcula o total de horas
		totalHoras = segundos / 3600;
		
		//calcula o total de minutos
		totalMinutos = segundos / 60 - totalHoras * 60;
		
		//calcula o total de segundos
		totalSegundos = segundos % 60;
				
		//imprime o resultado na tela
		System.out.println("O tempo de duração de um evento em uma fábrica é de: " + 
		totalHoras + " horas, " + totalMinutos + " minutos e " + totalSegundos + 
		" segundos.");
			
		
	}
}
