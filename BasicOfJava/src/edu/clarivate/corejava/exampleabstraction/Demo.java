package edu.clarivate.corejava.exampleabstraction;

public abstract class Demo {
	static int num = 327;

	public abstract void display();

	public static void print() {
		System.out.println("Static Method In the Demo Abstract Class");
	}
}
