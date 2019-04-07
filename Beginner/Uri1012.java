package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangle = (a * c)/2;
		double circle = 3.14159 * (Math.pow(c, 2));
		double trapezium = ((a + b) * c)/2;
		double square = Math.pow(b, 2);
		double rectangle = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapezium);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectangle);
	}

}