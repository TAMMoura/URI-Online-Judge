package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double value1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double value2 = sc.nextDouble();
		double total = (num1 * value1) + (num2 * value2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
	}
}