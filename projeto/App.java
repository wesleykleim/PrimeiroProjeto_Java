package br.com.fiap.primeiro.projeto;

public class App {

	//Método que inicia a execução do programa
	public static void main(String[] args) {
		System.out.print("Olá Devs!");
		
		//Criar o objeto Pessoa
		Pessoa churros = new Pessoa();
		
		//Chamar os métodos
		churros.andar(6);
		String fala = churros.falar("Ganhei?");
		System.out.println(fala);
	}
}