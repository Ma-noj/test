package edu.clarivate.corejava.exampleabstraction;

public class Ship extends Transport {

	@Override
	public void deliver() {
		System.out.println("Ship Delivers On Sea");
	}

}
