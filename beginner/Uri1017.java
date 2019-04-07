package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int hour = sc.nextInt();
		int vel = sc.nextInt();
		double consum = (hour * vel)/12.0;
		sc.close();
		
		System.out.printf("%.3f\n", consum);
	}

}