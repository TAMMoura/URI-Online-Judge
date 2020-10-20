package beginner;

import java.io.IOException;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		sc.close();
		
		switch (cod) {
		case 1: 
			double hotdog = 4 * qtd;
			System.out.printf("Total: R$ %.2f\n", hotdog);
			break;
			
		case 2:
			double xSalad = 4.5 * qtd;
			System.out.printf("Total: R$ %.2f\n", xSalad);
			break;
		
		case 3:
			double xBacon = 5 * qtd;
			System.out.printf("Total: R$ %.2f\n", xBacon);
			break;
			
		case 4:
			double toast = 2 * qtd;
			System.out.printf("Total: R$ %.2f\n", toast);
			break;
			
		case 5:
			double soda = 1.5 * qtd;
			System.out.printf("Total: R$ %.2f\n", soda);
			break;
			
		}
	}

}
