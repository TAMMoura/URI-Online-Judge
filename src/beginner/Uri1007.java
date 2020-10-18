package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int diferenca = (a * b) - (c * d);
		sc.close();
		System.out.println("DIFERENCA = " + diferenca);
	}
}