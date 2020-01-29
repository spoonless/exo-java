package fr.epsi.b3.geometrie;

public class Disque extends Figure {

	private double rayon;

	public Disque(double rayon) throws RayonInvalideException {
		if (rayon <= 0) {
			throw new RayonInvalideException();
		}
		this.rayon = rayon;
	}
	
	@Override
	public double getPerimetre() {
		return 2 * rayon * Math.PI;
	}
	
	@Override
	public double getAire() {
		return rayon * rayon * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Disque de rayon " + rayon;
	}
}
