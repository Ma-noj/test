import java.util.Scanner;

public class IsEvenExampleWithMethod {
	public static void main(String[] args) {
		IsEvenExampleWithMethod.isEven();
	}

	public static void isEven() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Number to check even or odd :");
		int num = read.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even Number");
		} else {
			System.out.println(num + " is an odd Number");
		}
	}
}
