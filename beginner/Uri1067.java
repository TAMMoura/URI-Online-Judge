package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i = i +2) {
			System.out.println(i);
		}
	}
}