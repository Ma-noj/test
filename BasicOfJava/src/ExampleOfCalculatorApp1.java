import java.util.Scanner;

public class ExampleOfCalculatorApp1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// Scenario 1
		System.out.println("Enter the Num1 to Perform Add ");
		int num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform Add ");
		int num2 = read.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
		// Scenario 2
		System.out.println("Enter the Num1 to Perform Mul ");
		num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform Mul ");
		num2 = read.nextInt();
		int mul = num1 * num2;
		System.out.println("Mul of " + num1 + " and " + num2 + " = " + mul);
		// Scenario 3
		System.out.println("Enter the Num1 to Perform Mul ");
		num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform mul ");
		num2 = read.nextInt();
		mul = num1 * num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + mul);
		// Scenario 4
		System.out.println("Enter the Num1 to Perform Add ");
		num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform Add ");
		num2 = read.nextInt();
		sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
	}
}
