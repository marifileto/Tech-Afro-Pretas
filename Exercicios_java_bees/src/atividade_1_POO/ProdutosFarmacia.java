package atividade_1_POO;

public class ProdutosFarmacia {
	
	//Atributos da classe Produtos Farmácia
	private String nomeProduto;
	private int quantidade;
	private double preco;
	private String fabricante;
	private String validade;
	
	//Método Construtor da classe Produtos Farmácia - com todos os parâmetros
	public ProdutosFarmacia(String nomeProduto, int quantidade, double preco, String fabricante, String validade) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fabricante = fabricante;
		this.validade = validade;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do produto é: " + this.getNomeProduto() + ", a quantidade deste produto em estoque é de: " +
		this.getQuantidade() + ", o valor deste produto é R$ " + this.getPreco() + ", o fabricante deste produto é: " + 
		this.getFabricante() + " e a validade do produto é: " + this.getValidade() + ".");
		
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


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}

	
	
}
