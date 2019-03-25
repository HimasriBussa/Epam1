import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstimateCostTest {

	@Test
	void test() {
		EstimateCost ec = new EstimateCost();
		assertEquals(120000, ec.cost(0, 100, false));
		assertEquals(150000, ec.cost(1, 100, false));
		assertEquals(180000, ec.cost(2, 100, false));
		assertEquals(250000, ec.cost(2, 100, true));
	}

}
