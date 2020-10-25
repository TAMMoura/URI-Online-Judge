package beginner;

import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		while (X != 0) {
			for (int i = 1; i <= X; i++) {
				if (i == X) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + " ");
				}
			}
			X = sc.nextInt();
		}
		
		sc.close();
	}

}
