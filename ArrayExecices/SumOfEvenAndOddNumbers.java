import java.util.Scanner;
public class SumOfEvenAndOddNumbers{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		int totalEvenNumber = 0;
		int totalOddNumber = 0;
		for(int counter = 0; counter <= 10; counter++){
			System.out.println("Enter a number: ");
			int number = collect.nextInt();

			if(number % 2 == 0){
				totalEvenNumber+=number;
			}

			if(number % 2 == 0){
				totalOddNumber += number;
			}

		}
		System.out.printf("the sum of even number is %d, the sum of odd number is %d",  totalEvenNumber, totalOddNumber);
		
	}
}