package br.com.fiap.primeiro.projeto;

import java.util.Scanner;

public class LeituraDados {

	//Ler os dados do usu�rio
	public static void main(String[] args) {
		//Objeto que � capaz de ler as informa��es
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		//Lendo um n�mero inteiro
		int idade = leitor.nextInt();
		//Exibindo a idade inserida pelo usu�rio
		System.out.println(idade);
		
		System.out.println("Digite o nome");
		//Ler o nome 
		String nome = leitor.next();
		//Exibindo o nome inserido pelo usu�rio
		System.out.println(nome);
		
		System.out.println("Digite o sal�rio");
		//Ler o sal�rio 
		double salario = leitor.nextDouble();
		//Exibir o sal�rio inserido
		System.out.println(salario);
		
		leitor.close();//fechar os recursos
		
	}
}