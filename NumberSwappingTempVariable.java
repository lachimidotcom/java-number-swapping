
import java.util.Scanner;

public class NumberSwappingTempVariable{
	public static void numberSwappingTempVariable(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a +" b: " + b);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		numberSwappingTempVariable(num1, num2);
	}
}