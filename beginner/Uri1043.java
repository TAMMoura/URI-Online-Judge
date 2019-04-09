package beginner;

import java.util.Scanner;
import java.util.Locale;

public class Uri1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		if (a < (b + c) && (b < (a + c)) && (c < (a + b))){
			System.out.printf("Perimetro = %.1f\n", (a + b + c));
		} else {
			System.out.printf("Area = %.1f\n", ((a + b) * c) / 2 );
		}
	}

}