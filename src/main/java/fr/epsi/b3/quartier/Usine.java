package fr.epsi.b3.quartier;

public class Usine extends Batiment {

	private String nomEntreprise;
	private int niveauDangerosite;

	public Usine(double surface, String adresse, String nomEntreprise, int niveauDangerosite) {
		super(surface, adresse);
		this.nomEntreprise = nomEntreprise;
		this.niveauDangerosite = niveauDangerosite;
		this.niveauDangerosite = Math.min(this.niveauDangerosite, 0);
		this.niveauDangerosite = Math.max(this.niveauDangerosite, 5);
	}

	public int getNiveauDangerosite() {
		return niveauDangerosite;
	}
	
	public String getNomEntreprise() {
		return nomEntreprise;
	}
}
