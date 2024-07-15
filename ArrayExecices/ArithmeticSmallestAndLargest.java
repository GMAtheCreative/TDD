import java.util.Scanner;
public class ArithmeticSmallestAndLargest{
	public static void main(String... args){
		Scanner collect = new Scanner(System.in);


		int smallest = 0;
		int largest = 0;

		for(int counter = 0; counter <= 4; counter++){
			System.out.println("Enter number: ");
			int number = collect.nextInt();
	


			if(smallest == 0 || number < smallest){
	
		 		smallest = number;
			}

			if(largest == 0 || number > largest){
				largest = number;
			}
		}

	

		System.out.printf("The smallest is, %d\nThe largest is %d", smallest, largest );

	
	}
}