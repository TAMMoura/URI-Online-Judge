package beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	 public static void main(String[] args) throws IOException {
		 
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double n4 = sc.nextDouble();
			DecimalFormat df = new DecimalFormat("0.0");
			
			double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
			if (media >= 7.0) {
				System.out.println("Media: " + df.format(media));
				System.out.println("Aluno aprovado.");
			}else if (media < 5.0) {
				System.out.println("Media: " + df.format(media));
				System.out.println("Aluno reprovado.");
			}else {
				double nFinal = sc.nextDouble();
				sc.close();
				double mediaFinal = (media + nFinal)/ 2;
				if (mediaFinal > 5.0) {
					System.out.println("Media: " + df.format(media));
					System.out.println("Aluno em exame.");
					System.out.printf("Nota do exame: %.1f\n", nFinal);
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f\n", mediaFinal);
				} else {
					System.out.println("Media: " + df.format(media));
					System.out.println("Aluno em exame.");
					System.out.printf("Nota do exame: %.1f\n", nFinal);
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f\n", mediaFinal);
				}
			}
		}

	}