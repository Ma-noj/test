package edu.clarivate.corejava.examplepolymorohism;

public class Addition {
	public static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	public static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
}
