package atividade_1_POO;

import java.util.Scanner;

public class TestaFuncionario {
	
	//Variáveis criadas externas à main para serem utilizadas dentro de outros métodos
	public static Funcionario func1;
	public static Funcionario func2;
	
	public static void main(String[] args) {
	
		//Para inserir os dados dos funcinários manualmente comente esse código
		func1 = new Funcionario("José", "pedreiro", "obra", "5558-9", "Campinas");
		func2 = new Funcionario("Maria", "professora", "escola", "5489-2", "Santos");
		
		//Para inserir os dados dos funcinários manualmente descomente esse código
		//func1 = new Funcionario();
		//func2 = new Funcionario();
		//System.out.println("Funcionário 1: /n");
		//CriaFuncionario(func1);
		//System.out.println("Funcionário 2: /n");
		//CriaFuncionario(func2);	
		
		//Método visualizar para mostrar os dados na tela
		func1.visualizar();
		func2.visualizar();
				
	}	
	
	
	
	//Método para criar funcionário manualmente
	public static void CriaFuncionario(Funcionario func) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do funcionário: ");
		func.setNome(leia.nextLine());
		System.out.println("Digite a função do funcionário: ");
		func.setFuncao(leia.nextLine());
		System.out.println("Digite o setor do funcionário: ");
		func.setSetor(leia.nextLine());
		System.out.println("Digite o registro do funcionário: ");
		func.setRegistro(leia.nextLine());
		System.out.println("Digite a unidade do funcionário: ");
		func.setUnidade(leia.nextLine());
	}
}
