package fr.epsi.b3;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {

	@Test
	public void upperCaseProduitUneChaineEnMajuscules() throws Exception {
		// Bloc arrange
		String s = "Bonjour le monde";

		// Bloc act
		String maj = s.toUpperCase();

		// Bloc assert
		assertEquals("BONJOUR LE MONDE", maj);
	}

	@Test
	public void containsRetourneTrueSiLeCaractereEnParametreEstPresentDansLaChaine() throws Exception {
		// Arrange
		String chaine = "test";
		String caractere = "s";
		
		// Act
		boolean resultat = chaine.contains(caractere);
		
		// Assert
		assertTrue("Le caractère n'a pas été trouvé dans la chaîne", resultat);
	}

	@Test
	public void containsRetourneFalseSiLeCaractereEnParametreNEstPasPresentDansLaChaine() throws Exception {
		// Arrange
		String chaine = "test";
		String caractere = "x";
		
		// Act
		boolean resultat = chaine.contains(caractere);
		
		// Assert
		assertFalse("Le caractère a été trouvé dans la chaîne", resultat);
	}
}













