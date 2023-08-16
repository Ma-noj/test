package edu.clarivate.corejava.exampleofinterface;

public class WinCheckBox implements CheckBox {

	@Override
	public void paint() {
		System.out.println("a CheckBox in Windows Style");
	}

}
