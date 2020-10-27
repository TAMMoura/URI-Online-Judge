package beginner;

import java.util.Scanner;

public class Uri1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		while (N <= 0) {
			N = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			sum += A;
			A++;
		}
		sc.close();
		System.out.println(sum);
	}

}
