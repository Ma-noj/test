import java.util.Scanner;

public class IsDivisibleBy5And3 {

	public static void main(String[] args) {
		IsDivisibleBy5And3.isDivisible();
	}

	public static void isDivisible() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int num = read.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is Divisible 3 and 5");
		} else {
			System.out.println(num + " is Not Divisible 3 and 5");
		}
	}

}
