package edu.clarivate.corejava.exampleofinterface;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButtoon() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

}
