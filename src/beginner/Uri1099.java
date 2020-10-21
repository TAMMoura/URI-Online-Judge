package beginner;

import java.util.Scanner;

public class Uri1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x, y;
		int soma;
		
		for (int i = 0; i < N; i++) {
			soma = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			if(x < y) {
				for(int j = x + 1; j < y; j++) {
					if (j % 2 !=0){
						soma += j;
					}
				}
			} else {
				for (int j = y + 1; j < x; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			}
			
			System.out.println(soma);

		}
		
		sc.close();

	}
}