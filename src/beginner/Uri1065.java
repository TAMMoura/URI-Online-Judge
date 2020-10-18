package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 5; i++) {
			float num = sc.nextFloat();
			if (num%2 == 0) {
				count +=1;
			}
		}
		sc.close();
		System.out.println(count + " valores pares");
	}
}