package edu.clarivate.corejava.exampleabstraction;

public class TransportMainClass {

	public static void main(String[] args) {
		Turck turck = new Turck();
		turck.deliver();

		Ship ship = new Ship();
		ship.deliver();
	}

}
