package edu.clarivate.corejava.exampleofexception;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Num1 value");
		int num1 = read.nextInt();
		System.out.println("Enter the Num2 value");
		int num2 = read.nextInt();
//		try {
			System.out.println(num1 / num2);
//		} catch (ArithmeticException e) {
//			System.out.println("The Value of Num2 = " + num2);
//		}
		System.out.println("Bye");
		System.out.println(num1 + " + " + num1 + " = " + (num1 + num2));

	}
}
