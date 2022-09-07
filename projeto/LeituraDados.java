package br.com.fiap.primeiro.projeto;

import java.util.Scanner;

public class LeituraDados {

	//Ler os dados do usuário
	public static void main(String[] args) {
		//Objeto que é capaz de ler as informações
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		//Lendo um número inteiro
		int idade = leitor.nextInt();
		//Exibindo a idade inserida pelo usuário
		System.out.println(idade);
		
		System.out.println("Digite o nome");
		//Ler o nome 
		String nome = leitor.next();
		//Exibindo o nome inserido pelo usuário
		System.out.println(nome);
		
		System.out.println("Digite o salário");
		//Ler o salário 
		double salario = leitor.nextDouble();
		//Exibir o salário inserido
		System.out.println(salario);
		
		leitor.close();//fechar os recursos
		
	}
}