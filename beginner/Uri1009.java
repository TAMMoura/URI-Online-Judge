package beginner;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; 

public class Uri1009 {

    public static void main(String[] args) throws IOException {
        
 		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		double salary = sc.nextDouble();
		double amount = sc.nextDouble();
		double total = salary + (amount * 0.15);
		sc.close();
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
