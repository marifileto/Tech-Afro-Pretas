package atividade_1_POO;

public class CursoEAD {
	
	//Atributos da classe CursoEAD
	private String nomeCurso;
	private int qtdAlunos;
	private String professor;
	private int cargaHoraria;
	private double valor;
	
	//Método Construtor da classe CursoEAD - com todos os parâmetros
	public CursoEAD(String nomeCurso, int qtdAlunos, String professor, int cargaHoraria, double valor) {
		super();
		this.nomeCurso = nomeCurso;
		this.qtdAlunos = qtdAlunos;
		this.professor = professor;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	
	//Método visualizar para imprimir os dados na tela
	public void visualizar() {
		System.out.println("O nome do curso é: " + this.getNomeCurso() + ", a quantidade de alunos aceita é de: " +
		this.getQtdAlunos() + ", o professor responsável é: " + this.getProfessor() + ", a carga horária do curso é de: " + 
		this.getCargaHoraria() + " horas" + " e o valor do curso é de R$" + this.getValor() + " mensais.");
		
	}
	
	//Método GET para ler os dados dos atributos
	//Método SET para modificar os atributos
	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public int getQtdAlunos() {
		return qtdAlunos;
	}


	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
