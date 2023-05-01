package projeto_conta_bancaria;

public class Conta implements Banco {

	private int numero;
	private String CPF;
	private double saldo;
	private boolean ativo;
	
	
	public Conta(int numero, String cPF, double saldo) {
		super();
		this.numero = numero;
		CPF = cPF;
		this.saldo = saldo;
		
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
	
}
