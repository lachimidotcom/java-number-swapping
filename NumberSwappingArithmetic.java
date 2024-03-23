
import java.util.Scanner;

public class NumberSwappingArithmetic{
	public static void numberSwappingArithmetic(int a, int b){
		a = a + b; // a=5, b=2, a+b=7
		b = a - b; // 7-2 = 5, b is 5
		a = a - b; // 7-5 = 2, a is 2
		
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		System.out.println("Before swapping: a = " + num1 + ", b = " + num2);
		numberSwappingArithmetic(num1, num2);
		}
}