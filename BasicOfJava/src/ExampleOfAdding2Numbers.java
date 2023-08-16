import java.util.Scanner;//Step1

public class ExampleOfAdding2Numbers {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// Step2
		System.out.println("Enter the Number 1 Vaule :");
		int num1 = read.nextInt();
		System.out.println("Enter the Number 2 Vaule :");
		int num2 = read.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
	}

}
