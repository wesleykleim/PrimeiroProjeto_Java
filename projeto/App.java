package br.com.fiap.primeiro.projeto;

public class App {

	//M�todo que inicia a execu��o do programa
	public static void main(String[] args) {
		System.out.print("Ol� Devs!");
		
		//Criar o objeto Pessoa
		Pessoa churros = new Pessoa();
		
		//Chamar os m�todos
		churros.andar(6);
		String fala = churros.falar("Ganhei?");
		System.out.println(fala);
	}
}