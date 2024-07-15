import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NumberWithoutMultiplicationTest{

	@Test
	public void testNumberCanMultiply(){

		NumberWithoutMultiplicationCalculator calculator = new NumberWithoutMultiplicationCalculator();
		

		int firstNumber = -5;
		int secondNumber = 5;
		int multiply = calculator.multiplicationOfNumbers(firstNumber, secondNumber);


		assertEquals(-25, multiply);
	
	}
}