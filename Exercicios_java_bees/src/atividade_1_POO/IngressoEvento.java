package atividade_1_POO;

public class IngressoEvento {
	
	//Atributos da classe Ingresso Evento
	private String nomeEvento;
	private int quantidade;
	private double preco;
	private String data;
	private String local;
	
	//Método Construtor da classe Ingresso Evento - com todos os parâmetros
	public IngressoEvento(String nomeEvento, int quantidade, double preco, String data, String local) {
		super();
		this.nomeEvento = nomeEvento;
		this.quantidade = quantidade;
		this.preco = preco;
		this.data = data;
		this.local = local;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do evento é: " + this.getNomeEvento() + ", a quantidade de ingressos restantes é de: " +
		this.getQuantidade() + ", o valor deste ingresso é R$ " + this.getPreco() + ", a data do evento é: " + 
		this.getData() + " e o local do evento será: " + this.getLocal() + ".");
	}

	//Método GET para ler os dados dos atributos
	//Método SET para modificar os atributos
	public String getNomeEvento() {
		return nomeEvento;
	}


	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}
	
	

}
