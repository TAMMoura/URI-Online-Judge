package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			number = sc.nextInt();
			
			if (number == 0) {
				System.out.println("NULL");
			}
			else {
				if (number % 2 == 0) {
					if (number > 0) {
						System.out.println("EVEN POSITIVE");
					}
					else {
						System.out.println("EVEN NEGATIVE");
					}
				}
				else if (number > 0) {
						System.out.println("ODD POSITIVE");
					}	
					else {
						System.out.println("ODD NEGATIVE");
					}
			}	
		}
		sc.close();
	}
}