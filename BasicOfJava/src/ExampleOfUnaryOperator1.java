
public class ExampleOfUnaryOperator1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1++ + ++num1 + num1-- + --num1 + num1++;
		System.out.println("Num1 Value = " + num1);
		System.out.println("Num2 Value = " +num2);
	}
}
