package fr.epsi.b3.quartier;

public class ImmeubleHabitation extends Logement {

	public ImmeubleHabitation(double surface, String adresse, double surfaceHabitable) {
		super(surface, adresse, surfaceHabitable);
	}
	
	@Override
	public int getNbMaxHabitants() {
		return Math.max(1, (int)(getSurfaceHabitable() / 25));
	}

}
