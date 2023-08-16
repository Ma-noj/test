package edu.clarivate.corejava.exampleofcollection;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		// Declare the ArrayList
		ArrayList listOfArray = new ArrayList<>();
		// add values to arraylist
		listOfArray.add(10);
		listOfArray.add(50);
		listOfArray.add("Hi");

		// read value from the ArrayList
		System.out.println("First Value that added to ArrayList = " + listOfArray.get(0));
		
	}
}
