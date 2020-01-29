package fr.epsi.b3.calculatrice;

public class Message {
	
	public String direBonjour(String nom) {
		if(nom.equals("David") || nom.equals("Michel")) {
			nom = "Monsieur " + nom;
		}
		return "Bonjour " + nom; 
	}

}
