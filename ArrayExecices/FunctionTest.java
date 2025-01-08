import java.util.*;
public class FunctionTest{
	public static void main(String [] args){

		//Scanner collect = new Scanner(System.in);
		int [] numbers = {4, 6, 2, 0, 8, 5, 3, -9};

		//int [] result = TimothyFunctionNew.sortArraysNew(numbers);

		for(int index = 0; index < numbers.length; index++){
			for(int value = index +1; value < numbers.length; value++){
				if (numbers[index] > numbers[value]){
					numbers[index] = numbers[index] + numbers[value];
					numbers[value] = numbers[index] - numbers[value];
					numbers[index] = numbers[index] - numbers[value];
				}
			}
		}

		System.out.print(Arrays.toString(numbers));
		
		
	}
}