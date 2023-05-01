package projeto_conta_bancaria;

import java.util.ArrayList;

public class Conta implements Banco {

	private int numero;
	private String CPF;
	private double saldo;
	private boolean ativo;
	private ArrayList<String> movimentoConta;
	
	
	public Conta(int numero, String cPF, double saldo) {
		super();
		this.numero = numero;
		CPF = cPF;
		this.saldo = saldo;
		this.movimentoConta = new ArrayList<String>();
		
	}
	
	@Override
	public void visualizar() {
		System.out.println("conta: " + numero + " saldo: " + saldo);
	}
	
	@Override
	public void debito(double valor) {
		saldo = saldo - valor;
		
	}
	
	@Override
	public void credito(double valor) {
		saldo = saldo + valor;
		
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void salvaMovimento(String movimento) {
		movimentoConta.add(movimento);
	}
	
	public void visualizaMovimentos() {
		System.out.println("Os movimentos realizados para esta conta foram:\n");
		for(int i = 0 ; i < movimentoConta.size(); i++) {
			System.out.println((i+1) + "° Movimento\n"+ movimentoConta.get(i)+".\n");
		}
		System.out.println("\nObrigado por utilizar nosso banco\n");
	}
	
}
