package Beginner;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int year = total / 365;
		int month = (total % 365) / 30;
		int days = (total % 365) % 30;
		
		System.out.println(year + " ano(s)");
		System.out.println(month + " mes(es)");
		System.out.println(days + " dia(s)");
	}

}