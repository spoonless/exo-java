package fr.epsi.b3.cadenas;

import java.util.Scanner;

public class CadenasDemo {

	public static void main(String[] args) {
		Cadenas cadenas = new Cadenas();
		cadenas.setCodeSecret(4, 3, 2, 1);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Saisissez 4 chiffres pour tenter d'ouvir le cadenas :");
			String ligne = scanner.nextLine();
			if (ligne.length() != 4) {
				System.out.println("Vous devez saisir 4 chiffres");
				continue;
			}
			
			int i0 = ligne.charAt(0) - '0';
			int i1 = ligne.charAt(1) - '0';
			int i2 = ligne.charAt(2) - '0';
			int i3 = ligne.charAt(3) - '0';
			
			if (cadenas.ouvrir(i0, i1, i2, i3)) {
				System.out.println("Le cadenas est ouvert !");
				break;
			} else {
				System.out.println("Le code n'est pas le bon.");
			}
		}
	}
}
