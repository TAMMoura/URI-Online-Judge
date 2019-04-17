package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Uri1002 {

	 
    public static void main(String[] args) throws IOException {
    	
		Locale.setDefault(Locale.US);
		
		//Invocar a classe Scanner
		Scanner sc = new Scanner(System.in);
		
		//Entrar com o valor do raio
		double raio = sc.nextDouble();
		
		//Calcular a area de acordo com o valor do raio digitado
		double area = 3.14159 * (Math.pow(raio, 2));
		
		//Fechar o Scanner
		sc.close();
		
		//Imprimindo a solução de acordo com a saída proposta no exercício
		System.out.printf("A=%.4f\n", area);
	}
}