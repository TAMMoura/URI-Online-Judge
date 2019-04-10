package beginner;

import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> sides = new ArrayList<Double>();
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		sc.close();
		sides.add(A);
		sides.add(B);
		sides.add(C);
		Collections.sort(sides, Collections.reverseOrder());
		double a = sides.get(0);
		double b = sides.get(1);
		double c = sides.get(2);
		
		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
		if (Math.pow(a,2) > Math.pow(b,2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (Math.pow(a,2) < Math.pow(b,2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && b == c && a == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if ((a == b) && (b != c) || (a == b) && (a != c) || (a != b) && (b == c) || (a != b) && (a == c)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		}
	}
}