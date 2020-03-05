package beginner;
import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i ++) {
			double a = sc.nextDouble();
			if (a > 0) {
				cont++;
			}	
		}
		sc.close();
	
		System.out.printf("%d valores positivos\n", cont);
	}
}