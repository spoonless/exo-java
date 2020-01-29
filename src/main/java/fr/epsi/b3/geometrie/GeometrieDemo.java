package fr.epsi.b3.geometrie;

public class GeometrieDemo {

	public static void main(String[] args) {
		Geometrie geometrie = new Geometrie();
		
		try {
			geometrie.ajouter(new Rectangle(3, 5));
			geometrie.ajouter(new Disque(2));
			geometrie.ajouter(new Rectangle(1.2, 3.5));
			geometrie.ajouter(new Disque(1.7));
			// ça va planter
			geometrie.ajouter(new Disque(-10));
		} catch (GeometrieException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Affichage de toutes les figures");
		for (Figure f : geometrie.getFigures()) {
			System.out.println(f);
		}

		System.out.println("Affichage des rectangles");
		for (Figure f : geometrie.getFigures("Rectangle")) {
			System.out.println(f);
		}

		System.out.println("Affichage des disques");
		for (Figure f : geometrie.getFigures("Disque")) {
			System.out.println(f);
		}

		System.out.println("Aire totale : " + geometrie.getAireTotale());
	}
}
