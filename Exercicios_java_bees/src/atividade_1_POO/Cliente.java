package atividade_1_POO;

public class Cliente {

	//Atributos da classe Cliente
	private String nome;
	private int idade;
	private String endereco;
	private String CPF;
	private String RG;
	
	//Método Construtor da classe Cliente - com todos os parâmetros
	public Cliente(String nome, int idade, String endereco, String cPF, String rG) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.CPF = cPF;
		this.RG = rG;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do meu cliente é: " + this.getNome() + ", sua idade é: " +
		this.getIdade() + ", seu endereço é: " + this.getEndereco() + ", seu CPF é: " + 
		this.getCPF() + ", seu RG é: " + this.getRG() + ".");
	}
	
	//Método GET para ler os dados dos atributos
	//Método SET para modificar os atributos
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
