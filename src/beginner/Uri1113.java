package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String result;
			
			if (x == y) {
				return;
			}
			if (x > y) {
				result = "Decrescente";
			}else {
				result = "Crescente";
			}
			System.out.println(result);
		}
	}

}
