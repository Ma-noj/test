import java.util.Scanner;

public class ExampleOfCalculatorApp3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to Calculator App");
		while (true) {
			System.out.println("Select the Choice :");
			System.out.println("1.add2.sub3.mul4.div5.rem");
			int choice = read.nextInt();

			switch (choice) {
			case 1:// addition
				int value1 = ExampleOfCalculatorApp3.readFromUser();
				int value2 = ExampleOfCalculatorApp3.readFromUser();
				int sum = add(value1, value2);
				System.out.println(value1 + " + " + value2 + " = " + sum);
				break;
			case 2:// Sub
				break;
			case 3:// mul
				break;
			case 4:// div
				break;
			case 5:// rem
				break;

			default:
				System.out.println("Invilad Choice!!");
			}

		}
	}

	public static int readFromUser() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = read.nextInt();
		return num;
	}

	public static int add(int value1, int value2) {
		int sum = value1 + value2;
		return sum;
	}

}
