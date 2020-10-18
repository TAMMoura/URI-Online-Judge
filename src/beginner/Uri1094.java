package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		double percCoelhos = 0;
		double percRatos = 0;
		double percSapos = 0;
		int N = sc.nextInt();
		int total = 0;
		for(int i = 0; i < N; i++) {
			int numbers = sc.nextInt();
			String type = sc.next();
			total += numbers;
			switch (type){
			case "C":
				coelhos += numbers;
				break;
			case "R":
				ratos += numbers;
				break;
			case "S":
				sapos += numbers;
				break;
				
			}
		percCoelhos = ((coelhos * 100.00) / total);
		percRatos = ((ratos * 100.00) / total);
		percSapos = ((sapos * 100.00) / total);
			
		}
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f", percCoelhos);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", percRatos);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f", percSapos);
		System.out.println(" %");
	}

}
