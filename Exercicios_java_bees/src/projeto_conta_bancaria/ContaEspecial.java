package projeto_conta_bancaria;

public class ContaEspecial extends Conta {

	private double limite = 1000;
	
	public ContaEspecial(int numero, String cPF, double saldo) {
		super(numero, cPF, saldo);
		
	}
	
	public double getLimite() {
		return limite;
	}
	
	public boolean temLimite(double valor) {
		boolean existeLimite = true;
		
		if (limite < valor) {
			existeLimite = false;
		}
		
		return existeLimite;
	}
	
	public void usarLimite(double valor) {
		
		double consultaSaldo = super.getSaldo(); 
		double valorRestante = valor - consultaSaldo;
		
		limite = limite - valorRestante;
		
		super.debito(consultaSaldo);
				
	}
	
}
