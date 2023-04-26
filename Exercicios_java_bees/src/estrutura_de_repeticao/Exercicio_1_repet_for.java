package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_1_repet_for {

	/*A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados 
	sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.  */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/*declarando as variáveis que receberão valores e 
		igualando todas as variáveis a zero afim de garantir o valor inicial*/
		double salario, filhos, maiorSalario = 0,  contSalarioAte100 = 0, mediaSalario = 0, 
				mediaFilhos = 0, percentualSalarioAte100, somaSalario = 0, somaFilhos = 0;
		int y;

		//atribuindo a instrução de repetição
				for (y = 1; y <= 3; y = y + 1) {
					//solicitando o primeiro valor para que o valor de salario seja inicializado
					System.out.println("Digite o salário da pessoa " + y + ": ");
					//atribui o valor digitado à variável "salario"
					salario = leia.nextInt();

					//solicitando o primeiro valor para que o valor de filhos seja inicializado
					System.out.println("Digite o número de filhos da pessoa " + y + ": ");
					//atribui o valor digitado à variável "filhos"
					filhos = leia.nextInt();
				
					//atribuindo o valor de salario ao valor anterior de soma
					somaSalario = somaSalario + salario;
					//teste: escreva("Valor soma salário ", somaSalario, ": ")

					//atribuindo o valor de filhos ao valor anterior de soma
					somaFilhos = somaFilhos + filhos;

					//atribuindo a condição
					if (salario > maiorSalario){
						maiorSalario = salario;
						//teste: escreva("Valor maior salário ", maiorSalario, ": ")
					}
					//atribuindo a condição
					if (salario <= 100){
						contSalarioAte100 = contSalarioAte100 + 1;
					}	
				}
				//realizando os cálculos solicitados
				mediaSalario = somaSalario / 3;
				mediaFilhos = somaFilhos / 3;
				percentualSalarioAte100 = (contSalarioAte100 / 3) * 100;

				//imprimindo os resultados
				System.out.println("\nMédia do salário da população: R$ " + mediaSalario);
				System.out.println("\nMédia do número de filhos: " + mediaFilhos);
				System.out.println("\nMaior salário: R$ " + maiorSalario);
				System.out.println("\nPercentual de pessoas com salário até R$100,00: " + 
				percentualSalarioAte100 + "%");

	}

}
