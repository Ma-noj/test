
public class ReviesAGivenNumber {
	public static void main(String[] args) {
		int number = 1234;
		int reviesNumber = 0;
		System.out.println("Befor Revising the Number = " + number);
		while (number != 0) {
			reviesNumber = reviesNumber * 10 + number % 10;
			number = number / 10;
		}

		System.out.println("After Revising the Number = " + reviesNumber);
	}
}
