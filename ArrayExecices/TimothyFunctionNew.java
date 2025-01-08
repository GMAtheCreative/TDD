public class TimothyFunctionNew{

	public static int[] sortArraysNew(int[] numbers){
		int index = 0;
		do{
			if (numbers[index] > numbers[index + 1]){
				numbers[index + 1] = numbers[index];
			}
			index++;
		}while(index != numbers.length - 1);
		return numbers;
	}
}