package edu.clarivate.corejava.exampleofinterface;

public class LinuxCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("a CheckBox in Linux Style");
	}

}
