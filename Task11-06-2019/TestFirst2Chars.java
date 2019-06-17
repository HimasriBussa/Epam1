import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFirst2Chars {

	@Test
	void test() {
		First2Chars A = new First2Chars();
		assertEquals("BC", A.Check2Chars("AABC"));
		assertEquals("BCD", A.Check2Chars("ABCD"));
		assertEquals("BCD", A.Check2Chars("BACD"));
		assertEquals("BBAA", A.Check2Chars("BBAA"));
		assertEquals("BAA", A.Check2Chars("AABAA"));
	}

}
