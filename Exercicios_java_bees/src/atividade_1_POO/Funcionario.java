package atividade_1_POO;

public class Funcionario {

	//Atributos da classe Funcionário
	private String nome;
	private String funcao;
	private String setor;
	private String registro;
	private String unidade;
	
	//Método Construtor da classe Funcionário - com todos os parâmetros
	public Funcionario(String nome, String funcao, String setor, String registro, String unidade) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.setor = setor;
		this.registro = registro;
		this.unidade = unidade;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do funcionário é: " + this.getNome() + ", sua função é: " +
		this.getFuncao() + ", seu setor é: " + this.getSetor() + ", seu registro é: " + 
		this.getRegistro() + ", sua unidade é: " + this.getUnidade());
		
	}
	
	//Método GET para ler os dados dos atributos
	//Método SET para modificar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
	
}
