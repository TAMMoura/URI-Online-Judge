package beginner;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int initial = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		if (end <= initial) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (initial - end));
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", (end - initial));
		}
	}

}
