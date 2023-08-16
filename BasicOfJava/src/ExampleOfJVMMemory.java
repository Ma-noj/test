public class ExampleOfJVMMemory {
	static int num1;
	int num2;
	static {
		System.out.println("static-block");
	}
	{
		System.out.println("Non-static-block");
	}

	public ExampleOfJVMMemory() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		ExampleOfJVMMemory obj = new ExampleOfJVMMemory();
		ExampleOfJVMMemory.print();
		obj.dispaly();
	}

	public void dispaly() {
		System.out.println("Non-static-Method");
	}

	public static void print() {
		System.out.println("Static-Method");
	}
}
