package fr.epsi.b3.geometrie;

public class RayonInvalideException extends GeometrieException{

	public RayonInvalideException() {
		super("Le rayon doit être un nombre positif !");
	}
	
}
