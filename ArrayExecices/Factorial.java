import java.util.Scanner;
public class Factorial{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter a number to get the factorial: ");
		int number = collect.nextInt();

		int factorial = MyFunctions.factorialOf(number);
		System.out.print(factorial)
		
		
	}
}