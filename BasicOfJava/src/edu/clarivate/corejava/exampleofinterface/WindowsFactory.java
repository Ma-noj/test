package edu.clarivate.corejava.exampleofinterface;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButtoon() {
		return new WinButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WinCheckBox();
	}

}
