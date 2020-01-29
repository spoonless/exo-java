package fr.epsi.b3.calculatrice;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest {
	
	@Test
	public void getResultatParDefautEstZero() {
		Calculatrice calculatrice = new Calculatrice();
		
		long resultat = calculatrice.getResultat();
		
		assertEquals(0, resultat);
	}

	@Test
	public void appliquerAdditionDUnNombre() {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.setOperation(Calculatrice.ADDITION);
		
		calculatrice.appliquer(2);
		
		assertEquals(2, calculatrice.getResultat());
	}

	@Test
	public void appliquerAdditionDePlusieursNombres() {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.setOperation(Calculatrice.ADDITION);
		
		calculatrice.appliquer(2, 3, 5);
		
		assertEquals(10, calculatrice.getResultat());
	}

	@Test
	public void appliquerSoustractionDUnNombre() {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.setOperation(Calculatrice.SOUSTRACTION);
		
		calculatrice.appliquer(2);
		
		assertEquals(-2, calculatrice.getResultat());
	}

	@Test
	public void appliquerMultiplicationDUnNombre() {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.appliquer(3);
		calculatrice.setOperation(Calculatrice.MULTIPLICATION);
		
		calculatrice.appliquer(2);
		
		assertEquals(6, calculatrice.getResultat());
	}
	
	@Test
	public void appliquerCalculatrice() {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.setOperation(Calculatrice.ADDITION);
		calculatrice.appliquer(1);
		Calculatrice calculatriceAppliquee = new Calculatrice();
		calculatriceAppliquee.appliquer(100);
	
		calculatrice.appliquer(calculatriceAppliquee);

		assertEquals(101, calculatrice.getResultat());
	}
	
}
