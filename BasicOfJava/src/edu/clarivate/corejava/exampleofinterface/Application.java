package edu.clarivate.corejava.exampleofinterface;

public class Application {
	private GUIFactory factory;
	private Button button;
	private CheckBox checkBox;

	public Application(GUIFactory factory) {
		this.factory = factory;
	}

	public void createUI() {
		if (factory instanceof WindowsFactory) {
			button = new WinButton();
			checkBox = new WinCheckBox();
		} else if (factory instanceof MacFactory) {
			button = new MacButton();
			checkBox = new MacCheckBox();
		} else if (factory instanceof LinuxFactory) {
			button = new LinuxButton();
			checkBox = new LinuxCheckBox();
		}
	}

	public void paint() {
		button.paint();
		checkBox.paint();
	}

}
