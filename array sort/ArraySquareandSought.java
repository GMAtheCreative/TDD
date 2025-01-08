import java.util.Arrays;
public class ArraySquareandSought{
	public static void main(String... args){

		int [] numbers = {4, 6, 1, 3, 9, 2};

		for(int index = 0; index < numbers.length; index++){

			numbers[index] *= numbers[index];
		}

		for (int index = 0; index < numbers.length - 1; index++) {
            		for (int column = 0; column < numbers.length - index - 1; column++) {
                		if (numbers[column] > numbers[column + 1]) {
                    
                    			int temporaryNumber = numbers[column];
                    			numbers[column] = numbers[column + 1];
                    			numbers[column + 1] = temporaryNumber;	
				}
                	}
            	}

		System.out.print(Arrays.toString(numbers));
	}

}