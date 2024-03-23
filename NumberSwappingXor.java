
import java.util.Scanner;

public class NumberSwappingXor{
	public static void numberSwappingXor(int a, int b){
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		System.out.println("Before swapping: a = " + num1 + ", b = " + num2);
		numberSwappingXor(num1, num2);
	}
}