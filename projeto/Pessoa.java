package br.com.fiap.primeiro.projeto;

public class Pessoa {

	//Atributos
	//[tipo de dado] [nome do atributo]; 
	String nome;
	
	int idade;
	
	int posicao; //posi��o da pessoa no tabuleiro
	
	//M�todos
	//[tipo do retorno] [nome do m�todo]([par�metros])
	//void -> n�o ter retorno
	void andar(int casas) {
		posicao += casas;
	}
	
	String falar(String pensamento) {
		String texto = pensamento + 
					" estou na casa: " + posicao;
		return texto;
	}
	
}