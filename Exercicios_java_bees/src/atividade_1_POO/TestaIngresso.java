package atividade_1_POO;

import atividade_1_POO.IngressoEvento;

public class TestaIngresso {

	public static void main(String[] args) {
		
		//Chamando o objeto Ingresso Evento e seus parâmetros criados para imputar os dados necessários
		IngressoEvento ingresso1 = new IngressoEvento("Show de The Beatles", 525, 655.25, "16/06/2024", 
				"Arena Blue Sky");
		IngressoEvento ingresso2 = new IngressoEvento("Teatro Mágico", 82, 130.35, "06/05/2023", 
				"Teatro Bonfim");
		
		//Método visualizar para mostrar os dados na tela
		ingresso1.visualizar();
		ingresso2.visualizar();

	}

}
