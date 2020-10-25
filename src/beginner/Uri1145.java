package beginner;

import java.util.Scanner;

public class Uri1145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		for (int i = 1; i <= Y; i++) {
			if (i % X != 0) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + "\n");
			}
		}

		sc.close();
	}

}
