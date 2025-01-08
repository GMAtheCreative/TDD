import java.util.Scanner;
public class Encryption{
	public static void main(String... args){
		
		Scanner collect = new Scanner(System.in);

		System.out.println("Input the digits you want to encrypt:");
		int digit1 = collect.nextInt();
		int digit2 = collect.nextInt();
		int digit3 = collect.nextInt();
		int digit4 = collect.nextInt();

		int code1 = (digit1 + 7) % 10;
		int code2 = (digit2 + 7) % 10;
		int code3 = (digit3 + 7) % 10;
		int code4 = (digit4 + 7) % 10;
		
		System.out.printf("%d %d %d %d", code1, code2, code3, code4);
	}

}