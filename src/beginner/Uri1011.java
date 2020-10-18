package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

    public static void main(String[] args) throws IOException {
        
    	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double ray = sc.nextDouble();
		double pi = 3.14159;
		double volume = (4.0/3)*pi*(Math.pow(ray, 3));
		sc.close();
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}

}