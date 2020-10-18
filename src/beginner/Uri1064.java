package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {
	
	public static void main(String[] args) {
		
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		float sum = 0;
		for (int i = 0; i < 6; i++) {
			float num = sc.nextFloat();
			if (num > 0) {
				count += 1;
				sum += num;
			}
		}
		sc.close();
		
		System.out.println(count + " valores positivos");
		System.out.printf("%.1f\n", (sum / count));
		
		
		
	}

}
