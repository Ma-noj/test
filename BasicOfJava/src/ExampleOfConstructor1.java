
public class ExampleOfConstructor1 {

	public ExampleOfConstructor1(int num, String str) {
		System.out.println(num);
		System.out.println(str);
	}

	public static void main(String[] args) {
		ExampleOfConstructor1 obj1 = new ExampleOfConstructor1(10, "Ram");

		ExampleOfConstructor1 obj2 = new ExampleOfConstructor1(298, "Krishna");
	}

}
