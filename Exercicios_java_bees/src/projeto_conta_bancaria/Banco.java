package projeto_conta_bancaria;

public interface Banco {
	public abstract void credito(double valor);
	public abstract void debito(double valor);
	public abstract void visualizar();
}
