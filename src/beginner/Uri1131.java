package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Uri1131 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		int placarInter;
		int placarGremio;
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int totalJogos = 0;
		
		while (opcao == 1) {
			totalJogos++;
			placarInter = sc.nextInt();
			placarGremio = sc.nextInt();
			if (placarInter > placarGremio) {
				vitoriasInter++;
			} else if (placarGremio > placarInter) {
				vitoriasGremio++;
			} else {
				empates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = sc.nextInt();
			while (opcao != 1 && opcao != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				opcao = sc.nextInt();
			}
			
		}
		sc.close();
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
		
	}

}
