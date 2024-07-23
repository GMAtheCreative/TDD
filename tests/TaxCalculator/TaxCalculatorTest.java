import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest{
	
	@Test
	public void testThatItCanDoTenPercent(){
		
		TaxCalculator calculator = new TaxCalculator();

		double tax = calculator.tenPercentCalculator(8000);

		assertEquals(800, tax);

	}

	@Test
	public void testForTaxIfItIsGreaterThanBaseAmount(){

		TaxCalculator calculator = new TaxCalculator();

		double tax = calculator.greaterThanBaseAmount(80_000);

		assertEquals(18_800, tax);
	}
}