package exos;

public class Calculatrice {

	private static final String ADDITION = null;
	private static final String MULTIPLICATION = null;

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

	private void appliquer(Calculatrice c2) {
		// TODO Auto-generated method stub
		
	}

	private void appliquer(int... i) {
		// TODO Auto-generated method stub
		
	}

	private void setOperation(String addition2) {
		// TODO Auto-generated method stub
		
	}

	private char[] getResultat() {
		// TODO Auto-generated method stub
		return null;
	}

}
