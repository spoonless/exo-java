package fr.epsi.b3.calculatrice;

public class CalculatriceDemo {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		System.out.println(c.getResultat()); // affiche 0
		c.setOperation(Calculatrice.ADDITION);
		c.appliquer(2);
		System.out.println(c.getResultat()); // affiche 2
		c.appliquer(3, 5);
		System.out.println(c.getResultat()); // affiche 10
		c.setOperation(Calculatrice.MULTIPLICATION);
		c.appliquer(4, 2);
		System.out.println(c.getResultat()); // affiche 80
		Calculatrice c2 = new Calculatrice();
		c2.appliquer(20);
		c.setOperation(Calculatrice.ADDITION);
		c.appliquer(c2);
		System.out.println(c.getResultat()); // affiche 100
	}
}
