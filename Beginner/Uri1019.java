package Beginner;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int hour = N / 3600;
		int minutes = (N % 3600) / 60;
		int seconds = N % 60;
		
		System.out.println(hour + ":" + minutes + ":" + seconds);
	}

}
