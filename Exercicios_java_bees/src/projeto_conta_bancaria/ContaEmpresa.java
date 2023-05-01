package projeto_conta_bancaria;

public class ContaEmpresa extends Conta {
	
	private double emprestimoEmpresa = 10000;
	
	public ContaEmpresa(int numero, String cPF, double saldo) {
		super(numero, cPF, saldo);
		
	}
	
	public double consultaEmprestimo() {
		return emprestimoEmpresa;
	}

	public void pedirEmprestimo(double valor) {
		
		if (valor > emprestimoEmpresa) {
			System.out.println("Valor solicitado excede o valor disponível.");
		}else {		
			emprestimoEmpresa = emprestimoEmpresa - valor;
			super.credito(valor);
			System.out.println("Empréstimo realizado com sucesso! "
					+ "Seu saldo atualizado é de R$"+super.getSaldo()+".\n");
		}
				
	}

}
