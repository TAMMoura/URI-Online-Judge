package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Uri1018 {
	
    public static void main(String[] args) throws IOException {
    	 
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int hundred = value / 100;
		int fifty = (value - hundred * 100) / 50;
		int twenty = (value - (hundred * 100) - (fifty * 50)) / 20;
		int ten =  (value - (hundred * 100) - (fifty * 50) - (twenty * 20)) / 10;
		int five = (value - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10)) / 5;
		int two = (value - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five *5)) / 2;
		int one = (value - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five *5) - (two * 2)) / 1;
		sc.close();
		
		System.out.println(value);
		System.out.println(hundred + " nota(s) de R$ 100,00");
		System.out.println(fifty + " nota(s) de R$ 50,00");
		System.out.println(twenty + " nota(s) de R$ 20,00");
		System.out.println(ten + " nota(s) de R$ 10,00");
		System.out.println(five + " nota(s) de R$ 5,00");
		System.out.println(two + " nota(s) de R$ 2,00");
		System.out.println(one + " nota(s) de R$ 1,00");

	}

}
