
public class ExampleOfMethod6 {

	public static void main(String[] args) {
		int sum = ExampleOfMethod6.add(10, 20);
		System.out.println("Sum returned By add() = " + sum);
	}

	public static int add(int value1, int value2) {
		int sum = value1 + value2;
		return sum;
	}

}
