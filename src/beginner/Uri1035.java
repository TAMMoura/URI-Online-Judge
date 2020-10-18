package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Uri1035 {
	 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
	}

}