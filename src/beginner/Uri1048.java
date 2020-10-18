package beginner;

import java.util.Scanner;
import java.util.Locale;

public class Uri1048 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		sc.close();
		
		if (salary <= 400.00) {
			System.out.printf("Novo salario: %.2f\n", (1.15 * salary));
			System.out.printf("Reajuste ganho: %.2f\n", ((1.15 * salary) - salary));
			System.out.println("Em percentual: 15 %");
		} 
		else if (salary <= 800.00) {
			System.out.printf("Novo salario: %.2f\n", (1.12 * salary));
			System.out.printf("Reajuste ganho: %.2f\n", ((1.12 * salary) - salary));
			System.out.println("Em percentual: 12 %");
		}
		else if (salary <= 1200.00) {
			System.out.printf("Novo salario: %.2f\n", (1.10 * salary));
			System.out.printf("Reajuste ganho: %.2f\n", ((1.10 * salary) - salary));
			System.out.println("Em percentual: 10 %");
		} 
		else if (salary <= 2000) {
			System.out.printf("Novo salario: %.2f\n", (1.07 * salary));
			System.out.printf("Reajuste ganho: %.2f\n", ((1.07 * salary) - salary));
			System.out.println("Em percentual: 7 %");
		} 
		else if (salary > 2000) {
			System.out.printf("Novo salario: %.2f\n", (1.04 * salary));
			System.out.printf("Reajuste ganho: %.2f\n", ((1.04 * salary) - salary));
			System.out.println("Em percentual: 4 %");
		} 
	}
}