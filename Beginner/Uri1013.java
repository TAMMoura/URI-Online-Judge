package Beginner;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAB = (a + b + Math.abs(a - b))/2;
		int maiorABC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
		
		if (maiorABC == a) {
			System.out.println(a + " eh o maior");
		}
		
		else if (maiorABC == b) {
			System.out.println(b + " eh o maior");
		}
		else {
			System.out.println(c + " eh o maior");
		}
	}

}
