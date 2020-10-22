package beginner;

import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println((double) x/y);
			}
		}

	}

}
