package edu.clarivate.corejava.exampleofinterface;

public class DemoInstancseKeyword {

	public static void main(String[] args) {
		GUIFactory factory = new LinuxFactory();
		System.out.println(factory instanceof WindowsFactory);
		System.out.println(factory instanceof MacFactory);
		System.out.println(factory instanceof LinuxFactory);
	}

}
