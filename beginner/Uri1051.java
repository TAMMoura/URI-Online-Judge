package beginner;

import java.util.Scanner;
import java.util.Locale;

public class Uri1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		sc.close();
		
		if (salary <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salary <= 3000.00) {
			System.out.printf("R$ %.2f\n", (salary - 2000.00) * 0.08);
			
		}
		else if (salary <= 4500.00) {
			System.out.printf("R$ %.2f\n", (salary - 3000.00) * 0.18 + (1000.00 * 0.08));
			
		}
		else if (salary > 4500.00) {
			System.out.printf("R$ %.2f\n", (salary - 4500.00) * 0.28 + (1500.00 * 0.18) + (1000.00 * 0.08));
		}
	}
}