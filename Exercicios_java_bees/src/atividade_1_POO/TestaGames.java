package atividade_1_POO;

import atividade_1_POO.ProdutosGames;

public class TestaGames {

	public static void main(String[] args) {
		
		//Chamando o objeto Produtos Games e seus parâmetros criados para imputar os dados necessários
		ProdutosGames prod1 = new ProdutosGames("Jogo God Of War", 3, 350.51, 
				"Sony Interactive Entertainment (SIE)","1 mês");
		ProdutosGames prod2 = new ProdutosGames("Controle PS5", 5, 415.58, 
				"Sony Interactive Entertainment (SIE)","1 ano");
		
		
		//Método visualizar para mostrar os dados na tela
		prod1.visualizar();
		prod2.visualizar();

	}

}
