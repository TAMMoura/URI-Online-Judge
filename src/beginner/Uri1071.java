package beginner;

import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int somaImpares = 0;
        
        if(x < y) {
        	for(int i = x + 1; i < y; i++) {
        		if (i%2 !=0) {
        			somaImpares += i;
        		}
        	}
        }else {
        	for(int i = y + 1; i < x; i++) {
        		if (i % 2 != 0) {
        			somaImpares += i;
        		}
        	}
        }
        
        sc.close();
        
        System.out.println(somaImpares);
	}

}
