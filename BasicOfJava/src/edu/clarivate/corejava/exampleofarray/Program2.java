package edu.clarivate.corejava.exampleofarray;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Size Of the Array!");
		int size = read.nextInt();
		int[] array = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + index + " Position Value = ");
			int num = read.nextInt();
			array[index] = num;
		}

		System.out.println("After Initialization of the Array = ");
		for (int index = 0; index < size; index++) {
			System.out.println("Value in the " + index + " Position = " + array[index]);
		}
	}

}
