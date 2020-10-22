package beginner;

import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int soma = 0;
		while (M > 0 && N > 0) {
			if (M > N) {
				for (int i = N; i <= M; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			} else {
				for (int i = M; i <= N; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			}
			
			System.out.println("Sum=" + soma);
			M = sc.nextInt();
			N = sc.nextInt();
			soma = 0;
		}
		sc.close();
	}

}
