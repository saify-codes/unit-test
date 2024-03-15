package griffith;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversionsTest {

	@Test
	public void testCelsiusToFahrenheit() {
		Conversions converter = new Conversions();
		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0);
		assertEquals(98.6, converter.celsiusToFahrenheit(37), 0);
		assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0);
	}
}
