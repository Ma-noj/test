import java.util.Scanner;

public class ExampleOfCalculatorApp2 {

	public static void main(String[] args) {
		System.out.println("Welcome To Calculator App");
		ExampleOfCalculatorApp2.dispaly();
		ExampleOfCalculatorApp2.add();
		ExampleOfCalculatorApp2.mul();
		ExampleOfCalculatorApp2.mul();
		ExampleOfCalculatorApp2.add();
	}

	public static void add() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Num1 to Perform Add ");
		int num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform Add ");
		int num2 = read.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
	}

	public static void mul() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Num1 to Perform Mul ");
		int num1 = read.nextInt();
		System.out.println("Enter the Num2 to Perform Mul ");
		int num2 = read.nextInt();
		int mul = num1 * num2;
		System.out.println("Mul of " + num1 + " and " + num2 + " = " + mul);
	}

	public static void dispaly() {
		System.out.println("Hi");
	}

}
