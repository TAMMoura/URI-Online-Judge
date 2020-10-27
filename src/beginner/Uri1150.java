package beginner;

import java.util.Scanner;

public class Uri1150 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Z = sc.nextInt();
		int count = 0;
		int sum = 0;
		while (Z <= X) {
			Z = sc.nextInt();
		}
		while (sum < Z) {
			sum += X;
			count++;
			sum++;
		}
		sc.close();
		System.out.println(count);
	}

}
