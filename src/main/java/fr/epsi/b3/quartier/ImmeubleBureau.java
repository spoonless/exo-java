package fr.epsi.b3.quartier;

public class ImmeubleBureau extends Batiment {
	
	private String nom;
	private String[] nomSocietes;

	public ImmeubleBureau(double surface, String adresse, String nom, String... nomSocietes) {
		super(surface, adresse);
		this.nom = nom;
		this.nomSocietes = nomSocietes;
	}
	
	public String[] getNomSocietes() {
		return nomSocietes;
	}
	
	public String getNom() {
		return nom;
	}

}
