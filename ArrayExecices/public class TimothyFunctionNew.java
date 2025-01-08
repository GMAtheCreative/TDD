public class TimothyFunctionNew{

	public static int[] sortArraysNew(int[] numbers){
		int temporaryNumber = 0;
		for (int index = 0; index < numbers.length ; index++) {
            		for (int column = 0; column < numbers.length -1; column++) {
                		if (numbers[column] > numbers[column + 1]) {

                    			numbers[column] = numbers[column + 1];
                    			numbers[column + 1] = numbers[column];	
				}
                	}
            	}
		return numbers ;
	}
}