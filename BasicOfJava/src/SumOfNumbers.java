public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}
