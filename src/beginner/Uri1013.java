package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) throws IOException {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double consum = x / y;
		sc.close();
		
		System.out.printf("%.3f km/l\n", consum);
	}

}