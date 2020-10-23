package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao == 1) {
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
			
			double media = (primeiraNota + segundaNota) / 2;
			System.out.println(String.format("media = %.2f", media)); 
			
			System.out.println("novo calculo (1-sim 2-nao)");
			opcao = sc.nextInt();
			while (opcao != 1 && opcao != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				opcao = sc.nextInt();
			}
		}
		
		sc.close();
		
		
	}

}
