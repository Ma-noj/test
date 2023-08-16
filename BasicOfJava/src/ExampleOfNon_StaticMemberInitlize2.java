
public class ExampleOfNon_StaticMemberInitlize2 {

	int num;

	public ExampleOfNon_StaticMemberInitlize2() {
		System.out.println("Constructor");
		num = 7162;
	}

	public static void main(String[] args) {
		ExampleOfNon_StaticMemberInitlize2 obj = new ExampleOfNon_StaticMemberInitlize2();
		System.out.println(obj.num);
	}

}
