import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest{

	@Test
	public void EncryptionTest(){
		
		CryptographyCalculator encrypts = new CryptographyCalculator();

		String result = encrypts.converterToCode("0444");

		assertEquals(1011, result);
	}

	@Test
	public void DecryptionTest(){
		
		CryptographyCalculator decrypts = new CryptographyCalculator();

		int result = decrypts.codeToNumber(1);

		assertEquals(4, result);
	}
}