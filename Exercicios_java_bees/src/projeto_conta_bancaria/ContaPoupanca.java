package projeto_conta_bancaria;

public class ContaPoupanca extends Conta {
	
	private int diaAniversarioPoupanca;
	
	public ContaPoupanca(int numero, String cPF, double saldo, int dia) {
		super(numero, cPF, saldo);
		diaAniversarioPoupanca = dia;
	}

	public void correcao(int dia) {
		double saldoCorrecao = super.getSaldo();
		if (dia == diaAniversarioPoupanca) {
			 saldoCorrecao = (saldoCorrecao * 0.05);
			 super.credito(saldoCorrecao);
		 }
	}
	
	

}
