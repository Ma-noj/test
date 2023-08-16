
public class ExampleOfMethod4 {
	public static void main(String[] args) {
		// ExampleOfMethod4.add(198, 53);
//		int value = 9845;
//		ExampleOfMethod4.dispay(value, "Manoj");
		ExampleOfMethod4.print(false);
	}

	public static void add(int value1, int value2) {
		int sum = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " + sum);
	}

	public static void dispay(int num, String str) {
		System.out.println("Integer value = " + num);
		System.out.println("String value = " + str);
	}

	public static void print(boolean flag) {
		System.out.println("Boolean Value = " + flag);
	}
}
