import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
	
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.add(2, 3);

		//assert
		assertEquals(5, result);

	}


}