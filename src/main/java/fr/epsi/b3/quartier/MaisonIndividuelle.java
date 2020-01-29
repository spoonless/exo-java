package fr.epsi.b3.quartier;

public class MaisonIndividuelle extends Logement {

	private int nbMaxHabitants;

	public MaisonIndividuelle(double surface, String adresse, double surfaceHabitable, int nbMaxHabitants) {
		super(surface, adresse, surfaceHabitable);
		this.nbMaxHabitants = nbMaxHabitants;
	}

	@Override
	public int getNbMaxHabitants() {
		return nbMaxHabitants;
	}
	
}
