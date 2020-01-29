package fr.epsi.b3.quartier;

public class ServicePublic extends Batiment{

	private String nom;

	public ServicePublic(double surface, String adresse, String nom) {
		super(surface, adresse);
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
}
