package br.com.fiap.primeiro.projeto;

public class ExemploOperadoresAritmeticos {

	public static void main(String[] args) {

		//Declarar as vari�veis para armazenar os dados do tri�ngulo
		double base = 6.5;
		double altura = 15;
		
		//Calcular a �rea do tri�ngulo 
		double area = base * altura / 2;
		
		//Exibir a �rea
		System.out.println(area);
		
		//Calcular a m�dia final 
			//(m�dia das 2 notas no primeiro semestre, valendo 40%)
			//(m�dia das 2 notas no segundo semestre, valendo 60%)
		//Declarar as vari�veis para armazenar as notas
		float nota1 = 2;
		float nota2 = 9.5f; //f no final, determina que o n�mero � do tipo float
		float nota3 = 8;
		float nota4 = 10;
		
		//Calcular a m�dia do primeiro semestre
		float media1 = ( nota1 + nota2 ) / 2;
		
		//Calcular a m�dia do segundo semestre
		float media2 = ( nota3 + nota4 ) / 2;
		
		//Calcular a m�dia final
		float mediaFinal = media1 * 0.4f + media2 * 0.6f;
				
		//Exibir a m�dia final
		System.out.println(mediaFinal);
		
		//Calcular o resto da divis�o de dois n�meros
		int x = 9;
		int y = 2;
		int resto = x % y;
		System.out.println("Resto da divis�o: " + resto);
		
		//Incremento 
		x++;
		System.out.println("Incremento: " + x);
		
		//Decremento
		y--;
		System.out.println("Decremento: " + y);
		
		x += 10; // x = x + 10;
		System.out.println("X �: " + x);
		
		x-=2; //x = x - 2;
		System.out.println("X �: " + x);
		
		x*=2; //x = x * 2;
		System.out.println("X �: " + x);
		
		x/=3; //x = x / 3;
		System.out.println("X �: " + x);
		
		x%=2; //x = x % 2; 
		System.out.println("X �: " + x);
		
	}
}