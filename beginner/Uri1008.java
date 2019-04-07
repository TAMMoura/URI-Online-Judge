package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
	 
    public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int workedHour = sc.nextInt();
		double hourlyWage = sc.nextDouble();
		double salary = workedHour * hourlyWage;
		sc.close();
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		
	}
}