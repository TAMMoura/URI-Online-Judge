package Beginner;
import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int hour = sc.nextInt();
		int vel = sc.nextInt();
		double consum = (hour * vel)/12.0;
		System.out.printf("%.3f\n", consum);
	}

}
