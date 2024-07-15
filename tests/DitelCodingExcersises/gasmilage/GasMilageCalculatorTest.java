import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GasMilageCalculatorTest{
	
	@Test
	public void testCanCalculateMilesPerGallon(){

		//given

		GasmilageCalculator calculator = new GasmilageCalculator();

		//when

		double numberOfMilesDriven = 40.0;
		double numberOfGallons = 30.0;
		double milesPerGallon = calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);

		//asset

		assertEquals(1.3d, milesPerGallon);


	}

	@Test
	public void testCannotCalculateMilePerGallon(){

		double numberOfMilesDriven = 40.0;
		double numberOfGallons = 30.0;
		double milesPerGallon =

		calculator.computeMilesPerGallon(numberOfMilesDriven, numberOfGallons);

		assertEquals(0, mile
	}
}