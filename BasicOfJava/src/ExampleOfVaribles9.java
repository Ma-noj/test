
public class ExampleOfVaribles9 {
	int num;// non-static variable

	{
		System.out.println("non-static block");
	}

	public ExampleOfVaribles9() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		// className referenceVariable = new(keyword) className();
		ExampleOfVaribles9 obj = new ExampleOfVaribles9();
		System.out.println(obj.num);
	}

}
