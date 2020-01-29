package fr.epsi.b3.calculatrice;

public class Calculatrice {

	public static final String ADDITION = "addition";
	public static final String SOUSTRACTION = "soustraction";
	public static final String MULTIPLICATION = "multiplication";
	
	private long resultat;
	private String operation = Calculatrice.ADDITION;

	public long getResultat() {
		return resultat;
	}

	public void appliquer(long i) {
		switch (operation) {
		case ADDITION:
			resultat += i;
			break;
		case SOUSTRACTION:
			resultat -= i;
			break;
		case MULTIPLICATION:
			resultat *= i;
			break;
		}
		
	}

	public void appliquer(long i, long... n) {
		appliquer(i);
		for(long l : n) {
			appliquer(l);
		}
		
	}

	public void appliquer(Calculatrice c) {
		appliquer(c.getResultat());
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
