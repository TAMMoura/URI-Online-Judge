package beginner;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Uri1021 {

	   public static void main(String[] args) throws IOException {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			double value = sc.nextDouble();
			int valueInteger = (int) value;
			
			int coins = (int) (value * 100) - (valueInteger * 100) ;
			
			int hundred = valueInteger / 100;
			int fifty = (valueInteger - hundred * 100) / 50;
			int twenty = (valueInteger - (hundred * 100) - (fifty * 50)) / 20;
			int ten =  (valueInteger - (hundred * 100) - (fifty * 50) - (twenty * 20)) / 10;
			int five = (valueInteger - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10)) / 5;
			int two = (valueInteger - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five *5)) / 2;
			
			int coin100 = (valueInteger - (hundred * 100) - (fifty * 50) - (twenty * 20) - (ten * 10) - (five *5) - (two * 2)) / 1;
			int coin50 = coins / 50;
			int coin25 = (coins - (coin50 * 50)) / 25;
			int coin10 = (coins - (coin50 * 50) - (coin25 * 25)) / 10;
			int coin5 = (coins - (coin50 * 50) - (coin25 * 25) - (coin10 * 10)) / 5;
			int coin1 = (coins - (coin50 * 50) - (coin25 * 25) - (coin10 * 10) - (coin5 * 5)) / 1;
			sc.close();
			
			System.out.println("NOTAS:");
			System.out.println(hundred + " nota(s) de R$ 100.00");
			System.out.println(fifty + " nota(s) de R$ 50.00");
			System.out.println(twenty + " nota(s) de R$ 20.00");
			System.out.println(ten + " nota(s) de R$ 10.00");
			System.out.println(five + " nota(s) de R$ 5.00");
			System.out.println(two + " nota(s) de R$ 2.00");
			System.out.println("MOEDAS:");
			System.out.println(coin100 + " moeda(s) de R$ 1.00");
			System.out.println(coin50 + " moeda(s) de R$ 0.50");
			System.out.println(coin25 + " moeda(s) de R$ 0.25");
			System.out.println(coin10 + " moeda(s) de R$ 0.10");
			System.out.println(coin5 + " moeda(s) de R$ 0.05");
			System.out.println(coin1 + " moeda(s) de R$ 0.01");

		}

	}