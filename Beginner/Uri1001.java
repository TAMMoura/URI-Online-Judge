package Beginner;

import java.io.IOException;
import java.util.Scanner;
public class Uri1001 {
 
    public static void main(String[] args) throws IOException {
    	
    	//Inicializando classe Scanner para receber numeros inteiros do usuário:
        Scanner sc = new Scanner(System.in);
		//Atribuindo o primeiro inteiro digitado na variavel a:
        int a = sc.nextInt();
        //Atribuindo o segundo inteiro digitado na variavel b:
		int b = sc.nextInt();
		//Atribuindo a soma da variavel a com a variavel b na variavel x:
		int x = a + b;
		//Fechando o Scanner:
		sc.close();
		//Imprimindo a soma no formato que a questão solicita:
		System.out.println("X = " + x);
	}
}