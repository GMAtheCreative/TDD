import java.util.Arrays;
public class SquareandSoughtArray{
	public static void main(String... args){

		int [] numbers = {4, 6, 1, 3, 9, 2};
		int temporaryNumber = 0;

		for(int index = 0; index < numbers.length; index++){

			numbers[index] *= numbers[index];
		}

		for (int index = 0; index < numbers.length; index++) {
			for(int column = 0;  column < numbers.length -  index; column++){

				if (numbers[column] > numbers[column] +1){

					temporaryNumber = numbers[column];
					number[column] = number[column] + 1;
					numbers[column] + 1 = temporaryNumber;
				}
			}
		}
		System.out.print(Arrays.toString(numbers));

	}
}
