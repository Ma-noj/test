
public class ExampleOfConstructor2 {
	int num;

	public ExampleOfConstructor2(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		ExampleOfConstructor2 obj = new ExampleOfConstructor2(10);
		System.out.println(obj.num);
	}

}
