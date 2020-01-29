package fr.epsi.b3.geometrie;

import java.util.ArrayList;
import java.util.List;

public class Geometrie {
	
	private List<Figure> figures = new ArrayList<>();

	public void ajouter(Figure f) {
		figures.add(f);
	}
	
	public List<Figure> getFigures() {
		return figures;
	}
	
	public List<Figure> getFigures(String type) {
		List<Figure> resultat = new ArrayList<>();
		for (Figure figure : figures) {
			switch (type) {
			case "Rectangle":
				if (figure instanceof Rectangle) {
					resultat.add(figure);
				}
				break;
			case "Disque":
				if (figure instanceof Disque) {
					resultat.add(figure);
				}
				break;
			}
		}
		return resultat;
	}

	public double getAireTotale() {
		double aireTotale = 0;
		for (Figure figure : figures) {
			aireTotale += figure.getAire();
		}
		return aireTotale;
	}
}
