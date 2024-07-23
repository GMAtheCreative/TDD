public class MyFunctions{

	public static long factorialOf(int number){
		int factoral = 1;
		for (int counter = 1; counter <= number; counter++){
			factoral *= counter;	
		}
		return factoral;
	}

		


}