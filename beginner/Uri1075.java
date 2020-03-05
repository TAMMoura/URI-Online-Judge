package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1075 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < 10000; i++) {
			if (i%N == 2) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}