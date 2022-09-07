package br.com.fiap.primeiro.projeto;

public class ExemploOperadoresAritmeticos {

	public static void main(String[] args) {

		//Declarar as variáveis para armazenar os dados do triângulo
		double base = 6.5;
		double altura = 15;
		
		//Calcular a área do triângulo 
		double area = base * altura / 2;
		
		//Exibir a área
		System.out.println(area);
		
		//Calcular a média final 
			//(média das 2 notas no primeiro semestre, valendo 40%)
			//(média das 2 notas no segundo semestre, valendo 60%)
		//Declarar as variáveis para armazenar as notas
		float nota1 = 2;
		float nota2 = 9.5f; //f no final, determina que o número é do tipo float
		float nota3 = 8;
		float nota4 = 10;
		
		//Calcular a média do primeiro semestre
		float media1 = ( nota1 + nota2 ) / 2;
		
		//Calcular a média do segundo semestre
		float media2 = ( nota3 + nota4 ) / 2;
		
		//Calcular a média final
		float mediaFinal = media1 * 0.4f + media2 * 0.6f;
				
		//Exibir a média final
		System.out.println(mediaFinal);
		
		//Calcular o resto da divisão de dois números
		int x = 9;
		int y = 2;
		int resto = x % y;
		System.out.println("Resto da divisão: " + resto);
		
		//Incremento 
		x++;
		System.out.println("Incremento: " + x);
		
		//Decremento
		y--;
		System.out.println("Decremento: " + y);
		
		x += 10; // x = x + 10;
		System.out.println("X é: " + x);
		
		x-=2; //x = x - 2;
		System.out.println("X é: " + x);
		
		x*=2; //x = x * 2;
		System.out.println("X é: " + x);
		
		x/=3; //x = x / 3;
		System.out.println("X é: " + x);
		
		x%=2; //x = x % 2; 
		System.out.println("X é: " + x);
		
	}
}