package fr.epsi.b3.calculatrice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	private Calculatrice calculatrice;
	
	@Before
	public void creerCalculatrice() {
		calculatrice= new Calculatrice();
	}

	@Test
	public void appliqueUneNombreLAdditionne() throws Exception {
		calculatrice.appliquer(5);
		
		long resultat = calculatrice.getResultat();
		assertEquals(5, resultat);
	}

	@Test
	public void getResultatRetourneZeroSiAucuneOperationDeFaite() {
		long resultat = calculatrice.getResultat();

		assertEquals(0, resultat);
	}


}
