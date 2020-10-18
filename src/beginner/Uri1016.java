package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Uri1016 {

    public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		sc.close();
		System.out.println((distance * 2) + " minutos");
	}

}