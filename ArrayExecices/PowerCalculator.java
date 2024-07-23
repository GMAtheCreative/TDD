import java.util.Scanner;		
public class PowerCalculator{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.println("first number");
		int number1 = collect.nextInt();
		
		System.out.println("power of number");
		int number2 = collect.nextInt();

	
		if (number1 <= 0 && number2 <= 0){

			double result = 1;
			double power = 0;

			int number1Result = number1 / -1;
			int number2Result = number2 / -1;

			for(int counter = 1; counter <= number2Result; counter++){
				result *= number1Result;	
			}
			double negativeResult= 1/ result;

			power = -1 * negativeResult;
			System.out.printf("%f.2", power);
		}



	}
}