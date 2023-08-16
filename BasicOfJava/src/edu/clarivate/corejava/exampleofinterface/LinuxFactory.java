package edu.clarivate.corejava.exampleofinterface;

public class LinuxFactory implements GUIFactory {

	@Override
	public Button createButtoon() {
		return new LinuxButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new LinuxCheckBox();
	}

}
