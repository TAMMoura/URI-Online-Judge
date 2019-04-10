package beginner;

import java.util.Scanner;

public class Uri1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String phylum = sc.nextLine();
		String breed = sc.nextLine();
		String group = sc.nextLine();
		sc.close();
		
		if (phylum.equals("vertebrado")) {
			if (breed.equals("ave")) {
				if (group.equals("carnivoro")) {
					System.out.println("aguia");
				}else if(group.equals("onivoro")){
					System.out.println("pomba");
				}
			} else if (breed.equals("mamifero")) {
				if (group.contentEquals("onivoro")) {
					System.out.println("homem");
				}else if (group.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		} else if (phylum.equals("invertebrado")) {
			if (breed.equals("inseto")) {
				if (group.equals("hematofago")) {
					System.out.println("pulga");
				} else if (group.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			} else if (breed.equals("anelideo")) {
				if (group.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if (group.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		
	}

}