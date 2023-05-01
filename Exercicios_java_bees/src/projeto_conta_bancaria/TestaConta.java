package projeto_conta_bancaria;

import java.util.Scanner;

import projeto_conta_bancaria.*;

public class TestaConta {
	
	public static Scanner input;
	public static ContaPoupanca contaPoup;
	public static ContaCorrente contaCorr;
	public static ContaEspecial contaEsp;
	public static ContaEmpresa contaEmpr;
	public static ContaEstudantil contaEstud;
	
	public final static int MAXMOVIMENTOS = 10;
	static int contaMovimentoPoup = 0;
	static int contaMovimentoCorr = 0;
	static int contaMovimentoEsp = 0;
	static int contaMovimentoEmp = 0;
	static int contaMovimentoEstud = 0;
	
	
	
	public static void main(String[] args) {

		
		inicializarPrograma();
		
		criarMenu();
				
	}
	
	public static void inicializarPrograma() {
		input = new Scanner (System.in);
		
		contaPoup = new ContaPoupanca(25156, "256.659.985-98", 10000, 10);
		contaCorr  = new ContaCorrente(21548, "111.594.987-87", 600);
		contaEsp  = new ContaEspecial(15487, "154.987.941-55", 50);
		contaEmpr  = new ContaEmpresa(16457, "124.145.145-54", 5000);
		contaEstud  = new ContaEstudantil(25615, "514.414.147-87", 11550);
		
	}

	public static void telaInicial() {
		
		System.out.println("\n[AVENGERS BANK]\n");
		System.out.println("\nAqui seu dinheiro está protegido e rende com força!\n");
	}
	
	public static void criarMenu() {
		
		int opcaoMenu = 0;
		
		while (opcaoMenu != 6) {
		
			telaInicial();
			
			System.out.println("\n1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR\n");
			
			System.out.println("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
			
			opcaoMenu = input.nextInt();
			
			switch(opcaoMenu) {
			case 1: 
				tela2Poupanca();
				break;
			case 2: 
				tela2Corrente();
				break;
			case 3: 
				tela2Especial();
				break;
			case 4: 
				tela2Empresa();
				break;
			case 5: 
				tela2Estudantil();
				break;
			case 6: 
				System.out.println("Agradecemos a preferência, até logo!\n");
				break;
			default: 
				System.out.println("Selecione uma opção válida.\n");
			}
		}
		
		System.exit(0);
		
		
		
	}
	
	public static void tela2Poupanca() {
		
		String opcaoTela = new String();
		String operacao = new String();
		double valorOperacao = 0;
		
		while (!opcaoTela.equalsIgnoreCase("N")) {
			contaMovimentoPoup ++;
			telaInicial();
			System.out.println("\n\nConta Poupança\n\n");
			System.out.println("Saldo atual: R$ " + contaPoup.getSaldo());
			System.out.println("\nInforme o dia do aniversário da Poupança: ");
			contaPoup.correcao(input.nextInt());
			System.out.println("\nDébito [D] ou Crédito [C]: ");
			operacao = input.next();
			System.out.println("\nValor da operação: R$ ");
			valorOperacao = input.nextDouble();
			if (operacao.equalsIgnoreCase("D")) {
				if (contaPoup.getSaldo() >= valorOperacao) {
					contaPoup.debito(valorOperacao);
					contaPoup.salvaMovimento("Débito - R$"+ valorOperacao);
				}else {
					System.out.println("\nSaldo insuficiente para esta operação.\n");
					contaPoup.salvaMovimento("Débito - Falha, saldo insuficiente");
				}				
			}else if (operacao.equalsIgnoreCase("C")){
				contaPoup.credito(valorOperacao);
				contaPoup.salvaMovimento("Crédito - R$"+ valorOperacao);
			}else {
				System.out.println("\nOpção inválida.\n");
			}
			System.out.println("\nSeu saldo atualizado é de R$" + contaPoup.getSaldo()+"\n");
			System.out.println("Realizar nova operação [S] ou [N]?: ");
			opcaoTela = input.next();
			
			if(contaMovimentoPoup == MAXMOVIMENTOS) {
				break;
			}
		}
		contaPoup.visualizaMovimentos();
	}
	
	
	
	
	
	public static void tela2Corrente() {
		
		String opcaoTela = new String();
		String operacao = new String();
		double valorOperacao = 0;
		String opcaoTalao = new String();
				
		
		while (!opcaoTela.equalsIgnoreCase("N")){
			contaMovimentoCorr ++;
			telaInicial();
			System.out.println("\n\nConta Corrente\n\n");
			System.out.println("Saldo atual: R$ " + contaCorr.getSaldo());
			System.out.println("\nDébito [D] ou Crédito [C]: ");
			operacao = input.next();
			System.out.println("\nValor da operação: R$ ");
			valorOperacao = input.nextDouble();
			if (operacao.equalsIgnoreCase("D")) {
				if (contaCorr.getSaldo() >= valorOperacao) {
					contaCorr.debito(valorOperacao);
					contaCorr.salvaMovimento("Débito - R$"+ valorOperacao);
				}else {
					System.out.println("\nSaldo insuficiente para esta operação.\n");
					contaCorr.salvaMovimento("Débito - Falha, saldo insuficiente");
				}					
			}else if (operacao.equalsIgnoreCase("C")){
				contaCorr.credito(valorOperacao);
				contaCorr.salvaMovimento("Crédito - R$"+ valorOperacao);
			}else {
				System.out.println("\nOpção inválida.\n");
			}
			System.out.println("\nSeu saldo atualizado é de R$" + contaCorr.getSaldo()+"\n");
			System.out.println("Realizar nova operação [S] ou [N]?: ");
			opcaoTela = input.next();
		
			if(contaMovimentoCorr == MAXMOVIMENTOS) {
				break;
			}	
		}
		while (!opcaoTalao.equalsIgnoreCase("N")){
			System.out.println("Deseja solicitar um cheque? (limite: 3) [S] ou [N]: ");
			opcaoTalao = input.next();
			contaCorr.pedeTalao();
		}
		contaCorr.visualizaMovimentos();			
	}
	
	
	
	public static void tela2Especial() {
	
		String opcaoTela = new String();
		String operacao = new String();
		String opcaoLimite = new String();
		double valorOperacao = 0;
		double limite = 0;
		
		while (!opcaoTela.equalsIgnoreCase("N")) {
			contaMovimentoEsp ++;
			telaInicial();
			System.out.println("\n\nConta Especial\n\n");
			System.out.println("Saldo atual: R$ " + contaEsp.getSaldo());
			System.out.println("\nDébito [D] ou Crédito [C]: ");
			operacao = input.next();
			System.out.println("\nValor da operação: R$ ");
			valorOperacao = input.nextDouble();
			if (operacao.equalsIgnoreCase("D")) {
				if (contaEsp.getSaldo() >= valorOperacao) {
					contaEsp.debito(valorOperacao);
					contaEsp.salvaMovimento("Débito - R$"+ valorOperacao);
				}else {
					if (contaEsp.temLimite(valorOperacao)) {
						System.out.println("\nSaldo insuficiente. \nDeseja utilizar o limite do cheque especial? "
								+ "[S] ou [N]");
						opcaoLimite = input.next();
						if (opcaoLimite.equalsIgnoreCase("S")) {
							contaEsp.usarLimite(valorOperacao);
							limite = contaEsp.getLimite();
							System.out.println("\nO seu limite do cheque especial atualizado é R$" 
							+ limite);
							contaEsp.salvaMovimento("Débito com uso do limite - R$"+ valorOperacao);
						}
					}else {
						System.out.println("Valor solicitado excede o valor disponível.\n");
						contaEsp.salvaMovimento("Débito - falha, saldo  e limite insuficientes.");
					}	
				}
				
				}else if (operacao.equalsIgnoreCase("C")){
				contaEsp.credito(valorOperacao);
				contaEsp.salvaMovimento("Crédito - R$"+ valorOperacao);
			}else {
				System.out.println("\nOpção inválida.\n");
			}
			System.out.println("\nSeu saldo atualizado é de R$" + contaEsp.getSaldo()+"\n");
			System.out.println("Realizar nova operação [S] ou [N]?: ");
			opcaoTela = input.next();
			
			if(contaMovimentoEsp == MAXMOVIMENTOS) {
				break;
			}
		}
		contaEsp.visualizaMovimentos();

	}
	public static void tela2Empresa() {
		
		String opcaoTela = new String();
		String operacao = new String();
		String opcaoEmprestimo = new String();
		double valorOperacao = 0;
		
		while (!opcaoTela.equalsIgnoreCase("N")) {
			contaMovimentoEmp ++;
			telaInicial();
			System.out.println("\n\nConta Empresa\n\n");
			System.out.println("Saldo atual: R$ " + contaEmpr.getSaldo());
			System.out.println("\nDébito [D] ou Crédito [C]: ");
			operacao = input.next();
			System.out.println("\nValor da operação: R$ ");
			valorOperacao = input.nextDouble();
			if (operacao.equalsIgnoreCase("D")) {
				if (contaEmpr.getSaldo() >= valorOperacao) {
					contaEmpr.debito(valorOperacao);
					contaEmpr.salvaMovimento("Débito - R$"+ valorOperacao);
				}else {
					System.out.println("Saldo indisponível."
							+ "\nVocê tem R$" + contaEmpr.consultaEmprestimo() +
							" disponível para empréstimo, deseja aproveitar desse "
							+ "benefício [S] ou [N]?: ");
					opcaoEmprestimo = input.next();
					if(opcaoEmprestimo.equalsIgnoreCase("S")) {
						System.out.println("Qual valor deseja para o seu empréstimo?: ");
						contaEmpr.pedirEmprestimo(input.nextDouble());
						contaEmpr.debito(valorOperacao);
						contaEmpr.salvaMovimento("Débito com emprestimo - R$"+ valorOperacao);
					} else if(opcaoEmprestimo.equalsIgnoreCase("N")) {
						System.out.println("Saldo indisponível.\n");
						contaEmpr.salvaMovimento("Débito - falha, saldo insuficientes.");
					}
				}
				
			}else if (operacao.equalsIgnoreCase("C")){
				contaEmpr.credito(valorOperacao);
				contaEmpr.salvaMovimento("Crédito - R$"+ valorOperacao);
			}else {
				System.out.println("\nOpção inválida.\n");
			}
			if((contaMovimentoEmp == 3) || (contaMovimentoEmp == 7)) {
				System.out.println("Você tem R$" + contaEmpr.consultaEmprestimo() +
						" disponível para empréstimo, deseja aproveitar desse "
						+ "benefício [S] ou [N]?: ");
				opcaoEmprestimo = input.next();
				if(opcaoEmprestimo.equalsIgnoreCase("S")) {
					System.out.println("Qual valor deseja para o seu empréstimo?: ");
					contaEmpr.pedirEmprestimo(input.nextDouble());
				}
			}
			System.out.println("\nSeu saldo atualizado é de R$" + contaEmpr.getSaldo()+"\n");
			System.out.println("Realizar nova operação [S] ou [N]?: ");
			opcaoTela = input.next();
			
			if(contaMovimentoEmp == MAXMOVIMENTOS) {
				System.out.println("Você tem R$" + contaEmpr.consultaEmprestimo() +
						" disponível para empréstimo, deseja aproveitar desse "
						+ "benefício [S] ou [N]?: ");
				opcaoEmprestimo = input.next();
				if(opcaoEmprestimo.equalsIgnoreCase("S")) {
					System.out.println("Qual valor deseja para o seu empréstimo?: ");
					contaEmpr.pedirEmprestimo(input.nextDouble());
				}
				break;
			}

		}
		contaEmpr.visualizaMovimentos();
	
	}
	
	
	
	
	
	public static void tela2Estudantil() {

		String opcaoTela = new String();
		String operacao = new String();
		String opcaoEmprestimo = new String();
		double valorOperacao = 0;
		
		while (!opcaoTela.equalsIgnoreCase("N")) {
			contaMovimentoEstud ++;
			telaInicial();
			System.out.println("\n\nConta Estudantil\n\n");
			System.out.println("Saldo atual: R$ " + contaEstud.getSaldo());
			System.out.println("\nDébito [D] ou Crédito [C]: ");
			operacao = input.next();
			System.out.println("\nValor da operação: R$ ");
			valorOperacao = input.nextDouble();
			if (operacao.equalsIgnoreCase("D")) {
				if (contaEmpr.getSaldo() >= valorOperacao) {
					contaEstud.debito(valorOperacao);
					contaEstud.salvaMovimento("Débito - R$"+ valorOperacao);
				}else {
					
					System.out.println("Saldo indisponível."
							+ "\nVocê tem R$" + contaEstud.consultaLimiteEstudantil() +
							" disponível para empréstimo, deseja aproveitar desse "
							+ "benefício [S] ou [N]?: ");
					opcaoEmprestimo = input.next();
					if(opcaoEmprestimo.equalsIgnoreCase("S")) {
						System.out.println("Qual valor deseja para o seu empréstimo?: ");
						contaEstud.usarEstudantil(input.nextDouble());
						contaEstud.debito(valorOperacao);
						contaEstud.salvaMovimento("Débito com emprestimo - R$"+ valorOperacao);
					} else if(opcaoEmprestimo.equalsIgnoreCase("N")) {
						System.out.println("Saldo indisponível.\n");
						contaEstud.salvaMovimento("Débito - falha, saldo insuficientes.");
					}
				}
				
			}else if (operacao.equalsIgnoreCase("C")){
				contaEstud.credito(valorOperacao);
				contaEstud.salvaMovimento("Crédito - R$"+ valorOperacao);
			}else {
				System.out.println("\nOpção inválida.\n");
			}
			if((contaMovimentoEstud == 3) || (contaMovimentoEstud == 7)) {
				System.out.println("Você tem R$" + contaEstud.consultaLimiteEstudantil() +
						" disponível para empréstimo, deseja aproveitar desse "
						+ "benefício [S] ou [N]?: ");
				opcaoEmprestimo = input.next();
				if(opcaoEmprestimo.equalsIgnoreCase("S")) {
					System.out.println("Qual valor deseja para o seu empréstimo?: ");
					contaEstud.usarEstudantil(input.nextDouble());
				}
			}
			System.out.println("\nSeu saldo atualizado é de R$" + contaEstud.getSaldo()+"\n");
			System.out.println("Realizar nova operação [S] ou [N]?: ");
			opcaoTela = input.next();
			
			if(contaMovimentoEstud == MAXMOVIMENTOS) {
				System.out.println("Você tem R$" + contaEstud.consultaLimiteEstudantil() +
						" disponível para empréstimo, deseja aproveitar desse "
						+ "benefício [S] ou [N]?: ");
				opcaoEmprestimo = input.next();
				if(opcaoEmprestimo.equalsIgnoreCase("S")) {
					System.out.println("Qual valor deseja para o seu empréstimo?: ");
					contaEstud.usarEstudantil(input.nextDouble());
				}
				break;
			}

		}
		contaEstud.visualizaMovimentos();

	}
}
