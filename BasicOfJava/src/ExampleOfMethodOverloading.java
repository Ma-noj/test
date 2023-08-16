
public class ExampleOfMethodOverloading {

	public static void main(String[] args) {
		ExampleOfMethodOverloading.add();// Hi
		add(10, 20);// 30
		add(100, 200, 300);// 600
		add("Ram", 3.14);// Ram-> 3.14
	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void add() {
		System.out.println("Hi");
	}

	public static void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public static void add(String str, double decimal) {
		System.out.println("Str = " + str);
		System.out.println("Decimal = " + decimal);
	}

}
