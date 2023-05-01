package projeto_conta_bancaria;

public class ContaCorrente extends Conta {
	
	private int contadorTalao = 1;
	
	public ContaCorrente(int numero, String cPF, double saldo) {
		super(numero, cPF, saldo);
		
	}
	
	public int pedeTalao() {
		
		double saldoCorrecao = super.getSaldo();
		
		if (saldoCorrecao >= 30){
			
			if(contadorTalao <= 3) { 
				contadorTalao++;
				super.debito(30);
				System.out.println("Você adquiriu um talão de cheques! Seu saldo "
						+ "é de " + super.getSaldo() + "\n");
			}else {
				System.out.println("Limite de talões atingido.\n");
			}
		}else {
			System.out.println("Saldo insuficiente.\n");
		}
				
		return contadorTalao;		
		
	
	}
	
}
