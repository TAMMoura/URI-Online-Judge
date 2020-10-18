package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + N + " = " + i * N);
		}
		sc.close();
	}

}