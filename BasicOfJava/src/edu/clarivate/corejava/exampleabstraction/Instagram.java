package edu.clarivate.corejava.exampleabstraction;

public abstract class Instagram {
	public void post() {
		System.out.println("Feature Enabling Users to post pictures");
	}

	public void chat() {
		System.out.println("Feature Enabling Users to chats");
	}

	public abstract void reels();
}
