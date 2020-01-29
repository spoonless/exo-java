package fr.epsi.b3.quartier;

import java.util.ArrayList;
import java.util.List;

public class Quartier {
	
	private String nom;
	private List<Batiment> batiments = new ArrayList<>();
	
	public Quartier(String nom) {
		this.nom = nom;
	}
	
	public void ajouter(Batiment b) {
		batiments.add(b);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNbMaxHabitants() {
		int nbMaxHabitants = 0;
		for (Batiment batiment : batiments) {
			nbMaxHabitants += batiment.getNbMaxHabitants();
		}
		return nbMaxHabitants;
	}
	
	public int getNiveauDangerosite() {
		int niveauDangerosite = 0;
		for (Batiment batiment : batiments) {
			if (batiment instanceof Usine) {
				Usine usine = (Usine) batiment;
				niveauDangerosite = Math.max(niveauDangerosite, usine.getNiveauDangerosite());
			}
		}
		return niveauDangerosite;
	}

}
