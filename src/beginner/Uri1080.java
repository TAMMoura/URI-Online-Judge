package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numbers [] = new int [100];
		int major = 0;
		int indice = 0;
		
		for (int i = 0; i < 100; i++) {
			numbers[i] = sc.nextInt();
			if (numbers[i] > major) {
				major = numbers[i];
				indice = i;
			}
		}
		
		System.out.println(major);
		System.out.println(indice + 1);
	}

}
