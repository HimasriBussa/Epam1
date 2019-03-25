package SI_CI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingSICI {

	@Test
	void testSI() {
		CalculateSICI sici = new CalculateSICI();
		double ans = sici.simpleInterest(1000, 3.2f, 10);
		assertEquals(320.0000047683716, ans);
	}
	
	@Test
	void testCI() {
		CalculateSICI sici = new CalculateSICI();
		double ans = sici.compoundInterest(1000, 2.5f, 9);
		assertEquals(240.4128163236628, ans);
	}

}
