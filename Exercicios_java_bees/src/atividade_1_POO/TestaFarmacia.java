package atividade_1_POO;

import atividade_1_POO.ProdutosFarmacia;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		//Chamando o objeto Produtos Farmacia e seus parâmetros criados para imputar os dados necessários
		ProdutosFarmacia prod1 = new ProdutosFarmacia("Tylenol", 58, 5.58, "McNeil Consumer Healthcare",
				"28/06/2025");
		ProdutosFarmacia prod2 = new ProdutosFarmacia("Shampoo Pantene", 135, 15.99, "Procter & Gamble",
				"01/08/2026");
		
		//Método visualizar para mostrar os dados na tela
		prod1.visualizar();
		prod2.visualizar();

	}

}
