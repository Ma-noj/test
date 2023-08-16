
public class ExampleOfMethod5 {

	public static void main(String[] args) {
//		int result = ExampleOfMethod5.add();
//		System.out.println("The value Return by add() = " + result);

		String result = ExampleOfMethod5.display();
		System.out.println("Value Recived From Method Display = " + result);

		double decimalResult = ExampleOfMethod5.method1();
		char charResult = ExampleOfMethod5.method2();
		boolean booleanResult = ExampleOfMethod5.method3();
		long phoneNumber = ExampleOfMethod5.method4();
		System.out.println("Value Recived From method1()= " + decimalResult);
		System.out.println("Value Recived From method2()= " + charResult);
		System.out.println("Value Recived From method3()= " + booleanResult);
		System.out.println("Value Recived From method4()= " + phoneNumber);

	}

	public static int add() {
		int num1 = 187;
		int num2 = 764;
		int sum = num1 + num2;
		return sum;// make use of return keyword to return
					// the integer value to the caller
	}

	public static String display() {
		System.out.println("This Msg is from display()");
		return "Manoj";
	}

	public static double method1() {
		double pi = 3.14;
		return pi;
	}

	public static char method2() {
		char charter = 'M';
		return charter;
	}

	public static boolean method3() {
		boolean flag = true;
		return flag;
	}

	public static long method4() {
		long phoneNumber = 9827363534l;
		return phoneNumber;
	}

}
