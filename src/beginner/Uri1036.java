package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

    public static void main(String[] args) throws IOException {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta >= 0 && a > 0) {
			double R1 = (-b + Math.sqrt(delta))/(2 * a);
			double R2 = (-b - Math.sqrt(delta))/(2 * a);
		
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}else {
			System.out.println("Impossivel calcular");
		}
	}

}