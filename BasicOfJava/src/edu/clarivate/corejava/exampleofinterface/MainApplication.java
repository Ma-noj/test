package edu.clarivate.corejava.exampleofinterface;

import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {
		Application application = null;
		Scanner read = new Scanner(System.in);
		System.out.println("Select Your OS");
		System.out.println("1.Windows\n2.Mac\n3.Linux\n4.OthersOrExist");
		int choice = read.nextInt();
		switch (choice) {
		case 1:
			application = new Application(new WindowsFactory());
			application.createUI();
			application.paint();
			break;
		case 2:
			application = new Application(new MacFactory());
			application.createUI();
			application.paint();
			break;
		case 3:
			application = new Application(new LinuxFactory());
			application.createUI();
			application.paint();
			break;
		case 4:
			System.exit(0);
			break;

		default:
			System.out.println("Invied Choice!!");
			break;
		}

	}
}
