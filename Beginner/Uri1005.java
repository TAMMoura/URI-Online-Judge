package Beginner;
import java.util.Scanner;
import java.util.Locale;

public class Uri1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double media = ((a * 3.5) + (b * 7.5))/11;
		System.out.printf("MEDIA = %.5f\n" , media );
	}

}
