
public class NumberWithoutMultiplicationCalculator{

	public int multiplicationOfNumbers(int firstNumber,int secondNumber){

		int multiplication = 0;

		int sum = 0;

		if(firstNumber == 0 && secondNumber == 0){
			return 0;
		}
		else if(firstNumber < 0 && secondNumber < 0){
			firstNumber /= -1;
			
			for(int counter = 0; counter > secondNumber; counter--){
				sum += firstNumber;
			}
			return sum;
		}
		else if(secondNumber < 0){
			for(int counter = 0; counter > firstNumber; counter++){
				sum += secondNumber;
			}
			return sum; 
		}
		else{
			for(int counter = 0; counter < secondNumber; counter++){
				sum += firstNumber;
			}
		return sum;
		}

		
	}
}