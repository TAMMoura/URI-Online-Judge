package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			if (number %2 == 0) {
				pares++;
				
			}else {
				impares++;
			}
			if (number > 0) {
				positivos++;
			} else if (number < 0) {
				negativos++;
			}
		}
		sc.close();

		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

	}

}
