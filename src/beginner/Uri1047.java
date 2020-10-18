package beginner;

import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hStart = sc.nextInt();
		int mStart = sc.nextInt();
		int hEnd = sc.nextInt();
		int mEnd = sc.nextInt();
		sc.close();
		
		int hDuration = hEnd - hStart;
		if (hDuration < 0) {
			hDuration = 24 + (hEnd - hStart);
		}
		
		int mDuration = mEnd - mStart;
		if (mDuration < 0) {
			mDuration = 60 + (mEnd - mStart);
			hDuration--;
		}
		
		if (hStart == hEnd && mStart == mEnd) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hDuration, mDuration);

		}		
	}

}