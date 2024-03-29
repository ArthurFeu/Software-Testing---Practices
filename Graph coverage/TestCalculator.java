import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

	@Test
	public void EveryDiscount() {
		assertEquals(75, Calculator.calculateDiscount(100, 6, true));
	}

	@Test
	public void SpecialOfferOnly() {
		assertEquals(80, Calculator.calculateDiscount(100, 3, true));
	}

	@Test
	public void FidelityDiscountOnly() {
		assertEquals(85, Calculator.calculateDiscount(100, 6, false));
	}

	@Test
	public void NoDiscountBesidesBasic() {
		assertEquals(90, Calculator.calculateDiscount(100, 3, false));
	}

	@Test
	public void EnsureFinalPriceIsPositive() {
		assertEquals(0, Calculator.calculateDiscount(0, 6, true));
	}
}
