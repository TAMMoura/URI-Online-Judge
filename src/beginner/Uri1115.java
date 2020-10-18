package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1115 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int point1;
		int point2;
		while (((point1 = sc.nextInt()) != 0) && ((point2 = sc.nextInt()) != 0)) {
			if(point1 > 0 && point2 > 0) {
				System.out.println("primeiro");
			}else if (point1 < 0 && point2 > 0){
				System.out.println("segundo");
			}else if (point1 < 0 && point2 < 0) {
				System.out.println("terceiro");
			}else if (point1 > 0 && point2 < 0) {
				System.out.println("quarto");
			}
		}
		
	}

}
