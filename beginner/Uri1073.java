package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 2; i <= num; i = i + 2) {
			if (num%2 == 0) {
				System.out.println(i + "^2 = " + (i*i));

			}
		}		
	}
}