package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			float number1 = sc.nextFloat();
			float number2 = sc.nextFloat();
			float number3 = sc.nextFloat();
			float result = ((number1 * 2) + (number2 * 3) + (number3 * 5)) / 10f;
			System.out.printf("%.1f\n" , result);

		}
	}

}