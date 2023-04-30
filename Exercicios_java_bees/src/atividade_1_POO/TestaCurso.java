package atividade_1_POO;

import atividade_1_POO.CursoEAD;

public class TestaCurso {

	public static void main(String[] args) {
		
		//Chamando o objeto CursoEAD e seus parâmetros criados para imputar os dados necessários
		CursoEAD curso1 = new CursoEAD("Engenharia", 50, "Kevin Pereira", 3600, 1228.65);
		CursoEAD curso2 = new CursoEAD("Inglês", 15, "Guilherme Pontes", 550, 350.92);
		
		//Método visualizar para mostrar os dados na tela
		curso1.visualizar();
		curso2.visualizar();

	}

}
