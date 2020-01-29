package fr.epsi.b3.geometrie;

import java.io.IOException;

public class GeometrieDemo2 {

	public static void main(String[] args) {
		GeometrieLoader loader = new GeometrieLoader();
		try {
			Geometrie geometrie = loader.chargerGeometrie("geometrie.csv");
			
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
		} catch (GeometrieException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println("Problème lors de la lecture du fichier.");
			e.printStackTrace();
		}
	}
}
