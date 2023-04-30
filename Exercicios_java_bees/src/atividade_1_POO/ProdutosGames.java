package atividade_1_POO;

public class ProdutosGames {
	
	//Atributos da classe Produtos Games
	private String nomeProduto;
	private int quantidade;
	private double preco;
	private String fabricante;
	private String garantia;
	
	//Método Construtor da classe Produtos Games - com todos os parâmetros
	public ProdutosGames(String nomeProduto, int quantidade, double preco, String fabricante, String garantia) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fabricante = fabricante;
		this.garantia = garantia;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do produto é: " + this.getNomeProduto() + ", a quantidade deste produto em estoque é de: " +
		this.getQuantidade() + ", o valor deste produto é R$ " + this.getPreco() + ", o fabricante deste produto é: " + 
		this.getFabricante() + " e a garantia do produto é de: " + this.getGarantia() + ".");
	}

	//Método GET para ler os dados dos atributos
	//Método SET para modificar os atributos
	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getGarantia() {
		return garantia;
	}


	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	
	

}
