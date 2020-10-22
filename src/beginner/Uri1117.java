package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double primeiraNota = sc.nextDouble();
		while(primeiraNota < 0 || primeiraNota > 10) {
			System.out.println("nota invalida");
			primeiraNota = sc. nextDouble();
		}
		
		double segundaNota = sc.nextDouble();
		while(segundaNota < 0 || segundaNota > 10) {
			System.out.println("nota invalida");
			segundaNota = sc.nextDouble();
		}
		sc.close();
		
		double media = (primeiraNota + segundaNota) / 2;
		System.out.println(String.format("media = %.2f", media));
	}

}
