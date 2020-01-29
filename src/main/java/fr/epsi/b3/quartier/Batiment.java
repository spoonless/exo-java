package fr.epsi.b3.quartier;

public abstract class Batiment {
	
	private double surface;
	private String adresse;

	public Batiment(double surface, String adresse) {
		this.surface = surface;
		this.adresse = adresse;
	}
	
	public double getSurface() {
		return surface;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public int getNbMaxHabitants() {
		return 0;
	}
}
