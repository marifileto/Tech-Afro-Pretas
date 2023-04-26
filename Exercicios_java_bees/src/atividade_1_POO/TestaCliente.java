package atividade_1_POO;

import atividade_1_POO.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente Cliente1;
		Cliente Cliente2;
		
		Cliente1 = new Cliente("José", 10, "Rua A", "458.584.485-78", "85.975.888-6");
		Cliente2 = new Cliente("Maria", 55, "Rua X", "111.222.444-88", "22.333.888-4");
		
		//Exemplo de set individual de parâmetros
		//Cliente1.setNome("José");
		//Cliente1.setCPF("458.584.485-78");
		//Cliente1.setEndereco("Rua A");
		//Cliente1.setIdade(10);
		//Cliente1.setRG("22.333.888-4");
		
		Cliente1.visualizar();
		Cliente2.visualizar();
		
	}

}
