package br.com.fiap.primeiro.projeto;

public class Pessoa {

	//Atributos
	//[tipo de dado] [nome do atributo]; 
	String nome;
	
	int idade;
	
	int posicao; //posição da pessoa no tabuleiro
	
	//Métodos
	//[tipo do retorno] [nome do método]([parâmetros])
	//void -> não ter retorno
	void andar(int casas) {
		posicao += casas;
	}
	
	String falar(String pensamento) {
		String texto = pensamento + 
					" estou na casa: " + posicao;
		return texto;
	}
	
}