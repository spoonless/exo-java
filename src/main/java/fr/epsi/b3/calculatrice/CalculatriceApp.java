package fr.epsi.b3.calculatrice;

import java.util.Scanner;

public class CalculatriceApp {

	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Opération disponible :");
			System.out.println("\t1) Operation");
			System.out.println("\t2) Donner un nombre");
			System.out.println("\t3) Quitter");
			int choix = scanner.nextInt();
			switch (choix) {
			case 1:
				System.out.println("addition, soustraction ou multiplication ?");
				calculatrice.setOperation(scanner.next());
				break;
			case 2:
				System.out.println("Saisissez un nombre :");
				calculatrice.appliquer(scanner.nextLong());
				break;
			case 3:
				System.out.println("Aurevoir...");
				return;
			default:
				System.out.println("Choix invalide");
			}
			System.out.println("Resultat de la calculatrice : " + calculatrice.getResultat());
		}
	}
}
