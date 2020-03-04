package adhoc;

import java.util.Locale;
import java.util.Scanner;

public class Uri1026 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		long u = sc.nextLong();
    		long m = sc.nextLong();
    		System.out.println(u ^ m);
    	}
	}

}
