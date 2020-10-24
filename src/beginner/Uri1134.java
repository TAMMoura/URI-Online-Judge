package beginner;

import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		int type = 0;
		while( type != 4) {
			type = sc.nextInt();
			while ( type < 1 || type > 4) {
				type = sc.nextInt();
			}
			
			switch (type) {
			case 1: alcohol++;
			break;
			
			case 2: gasoline++;
			break;
			
			case 3: diesel++;
			break;
			}
		}
		sc.close();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		

	}

}
