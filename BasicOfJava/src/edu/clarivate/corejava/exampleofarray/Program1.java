package edu.clarivate.corejava.exampleofarray;

public class Program1 {

	public static void main(String[] args) {
		int[] numArray = new int[8];
		numArray[0] = 1;
		numArray[1] = 2;
		numArray[2] = 3;
		numArray[3] = 4;
		numArray[4] = 5;
		numArray[5] = 6;
		numArray[6] = 7;
		numArray[7] = 8;
		int size = numArray.length;
		for (int index = 0; index < size; index++) {
			int result = numArray[index];
			if (result == 5) {
				System.out.println(result);
			}
		}

	}

}
