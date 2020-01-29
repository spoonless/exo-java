package fr.epsi.b3;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathTest {
	
	@Test
	public void absDunNombrePositifRetourneLeMemeNombre() throws Exception {
		int nombre = 2;
		
		int resultat = Math.abs(nombre);
		
		assertEquals(2, resultat);
	}

	@Test
	public void absDunNombreNegatifRetourneLaValeurAbsolueDeCeNombre() throws Exception {
		int nombre = -2;
		
		int resultat = Math.abs(nombre);
		
		assertEquals(2, resultat);
	}
}
