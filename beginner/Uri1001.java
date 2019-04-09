package beginner;

import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) {
		
		//Lendo os dois números inteiros do teclado com a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Entrando com o primeiro número inteiro
		int a = sc.nextInt();
		
		//Entrando com o segundo número inteiro
		int b = sc.nextInt();
		
		//Declarando uma variável x e atribuindo a ela o somatório da variável a com a variável b
		int x = a + b;
		
		//Fechando a classe Scanner
		sc.close();
		
		//Imprimindo a solução de acordo com a saída proposta no exercício
		System.out.println("X = " + x);
	}
}