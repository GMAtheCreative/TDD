import java.util.Scanner;
public class SeparationOfNumber{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = collect.nextInt();
		int reverseNumber = 0;
		int remainder = 0;
	
		while(number > 0){
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder ;
			number = number /10;

		}
	
	System.out.print(reverseNumber);
	}
}