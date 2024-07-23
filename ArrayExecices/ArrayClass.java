import java.util.Arrays;

public class ArrayClass{
	public static void main(String... args){

		int[] collections = new int[10];
		int sum = 0;

		for(int counter = 0; counter < collections.length; counter++){
	
			collections[counter] = counter + 1;
			sum = sum + collections[counter];
		}
 
		double divisible = sum / 10;

		System.out.println(Arrays.toString(collections));
		System.out.println(sum);
		System.out.println(divisible);
	}
}