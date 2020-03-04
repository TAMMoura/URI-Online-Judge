package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pass = 2002;
		int typedPass = 0;
		
		while(typedPass != pass) {
			typedPass = sc.nextInt();
			if (typedPass == pass) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida");
			}
			
		}
		sc.close();
	}

}
