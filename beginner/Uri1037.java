package beginner;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

    public static void main(String[] args) throws IOException {
    	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double inter = sc.nextDouble();
		sc.close();
		
		if (inter>=0 && inter <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (inter > 25 && inter<= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if (inter > 50 && inter <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if (inter > 75 && inter <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}

}