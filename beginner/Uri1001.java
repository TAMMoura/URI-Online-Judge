package beginner;

import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) {
		
		//Lendo os dois n�meros inteiros do teclado com a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Entrando com o primeiro n�mero inteiro
		int a = sc.nextInt();
		
		//Entrando com o segundo n�mero inteiro
		int b = sc.nextInt();
		
		//Declarando uma vari�vel x e atribuindo a ela o somat�rio da vari�vel a com a vari�vel b
		int x = a + b;
		
		//Fechando a classe Scanner
		sc.close();
		
		//Imprimindo a solu��o de acordo com a sa�da proposta no exerc�cio
		System.out.println("X = " + x);
	}
}