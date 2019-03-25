import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalciTest {

	@Test
	void testAdd() {
		Calci calculator = new Calci();
		assertEquals(36, calculator.Addition(34, 2));
	}

	@Test
	void testMult() {
		Calci calculator = new Calci();
		assertEquals(68, calculator.Multiplication(34, 2));
	}
	
	@Test
	void testDiv() {
		Calci calculator = new Calci();
		assertEquals(17, calculator.Division(34, 2));
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.Division(25, 0));
	}
}
