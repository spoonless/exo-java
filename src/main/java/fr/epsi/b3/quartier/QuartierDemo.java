package fr.epsi.b3.quartier;

public class QuartierDemo {

	public static void main(String[] args) {
		Quartier quartier = new Quartier("le bô quartier");
		
		quartier.ajouter(new MaisonIndividuelle(1500, "2 rue là-bas", 110, 6));
		quartier.ajouter(new ImmeubleHabitation(1500, "3 rue là-bas", 1000));
		quartier.ajouter(new ImmeubleBureau(2500, "4 rue là bas", "les mimosas", "EPSI", "WIS"));
		quartier.ajouter(new ServicePublic(150, "5 rue là-bas", "La poste"));
		quartier.ajouter(new Usine(1500, "6 rue là-bas", "Lubrizol", 5));
		quartier.ajouter(new Usine(1500, "7 rue là-bas", "Savonnerie Michel", 2));
		
		System.out.println("Nombre max d'habitants dans le quartier : " + quartier.getNbMaxHabitants());
		System.out.println("Niveau de dangerosite du quartier : " + quartier.getNiveauDangerosite());
	}
}
