package projeto_conta_bancaria;

public class ContaEstudantil extends Conta {

	private double limiteEstudantil = 5000;
	
	public ContaEstudantil(int numero, String cPF, double saldo) {
		super(numero, cPF, saldo);
		
	}

	public double consultaLimiteEstudantil () {
		return limiteEstudantil;
	}

	public void usarEstudantil(double valor) {
		
		if (valor > limiteEstudantil) {
			System.out.println("Valor solicitado excede o valor disponível.");
		}else {		
			limiteEstudantil = limiteEstudantil - valor;
			super.credito(valor);
		}
				
	}
}
