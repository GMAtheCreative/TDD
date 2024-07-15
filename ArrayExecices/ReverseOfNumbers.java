import java.util.Scanner;
public class ReverseOfNumbers{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		System.out.println("Enter a 5 digit number: ");
		int number = collect.nextInt();

		int reverse = MyFunctions.reverseOfNumber(number);
		System.out.print(reverse)

		
	}
}