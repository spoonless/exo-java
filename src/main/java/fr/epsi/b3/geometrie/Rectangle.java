package fr.epsi.b3.geometrie;

public class Rectangle extends Figure {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) throws LongueurLargeurInvalideException {
		if (longueur <= 0) {
			throw new LongueurLargeurInvalideException("La longueur doit être un nom positif !");
		}
		if (largeur <= 0) {
			throw new LongueurLargeurInvalideException("La largeur doit être un nom positif !");
		}
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double getPerimetre() {
		return (this.longueur + this.largeur) * 2;
	}
	
	@Override
	public double getAire() {
		return this.longueur * this .largeur;
	}
	
	@Override
	public String toString() {
		return "Rectangle de longueur " + longueur + " et de largeur " + largeur;
	}
	
}
