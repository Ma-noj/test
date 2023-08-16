
public class ExampleOfNestedIfElse1 {
	public static void main(String[] args) {
		int num = 27;
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Posivte Even Number " + num);
			} else {
				System.out.println("Posivte Odd Number " + num);
			}
		} else {
			System.out.println("Is A Negitive Number " + num);
		}
	}
}
