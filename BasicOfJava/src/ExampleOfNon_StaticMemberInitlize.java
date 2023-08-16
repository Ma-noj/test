
public class ExampleOfNon_StaticMemberInitlize {
	int num;

	{
		System.out.println("non-static block");
		num = 9876;
	}

	public static void main(String[] args) {
		ExampleOfNon_StaticMemberInitlize obj = new ExampleOfNon_StaticMemberInitlize();
		System.out.println(obj.num);
	}
}
