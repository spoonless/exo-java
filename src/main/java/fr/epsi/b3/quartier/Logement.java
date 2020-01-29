package fr.epsi.b3.quartier;

public abstract class Logement extends Batiment {

	private double surfaceHabitable;

	public Logement(double surface, String adresse, double surfaceHabitable) {
		super(surface, adresse);
		this.surfaceHabitable = surfaceHabitable;
	}
	
	public double getSurfaceHabitable() {
		return surfaceHabitable;
	}

}
