package fr.epsi.b3;

import static org.junit.Assert.fail;
import org.junit.Test;

public class IntegerTest {

	@Test
	public void parseIntThrowsExceptionWhenNotANumber() throws Exception {
		try {
			Integer.parseInt("not a number");
			fail("NumberFormatException attendue");
		} catch (NumberFormatException e) {
		}
	}

}