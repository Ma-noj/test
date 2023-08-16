package edu.clarivate.corejava.exampleofinterface;

public class TestClass implements Test2 {

	@Override
	public void display() {
		System.out.println("Msg From Display()");
	}

	@Override
	public void print() {
		System.out.println("Msg From Print()");
	}

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.display();
		obj.print();

	}

}
