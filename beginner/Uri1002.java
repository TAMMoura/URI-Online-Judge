package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Uri1002 {

	 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double raio = sc.nextDouble();
		double area = 3.14159 * (Math.pow(raio, 2));
		sc.close();
		System.out.printf("A=%.4f\n", area);
	}
}