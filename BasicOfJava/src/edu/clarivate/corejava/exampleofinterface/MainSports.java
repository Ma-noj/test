package edu.clarivate.corejava.exampleofinterface;

public class MainSports {

	public static void main(String[] args) {
		Sport sport = new FootBall();
		sport.display();// FootBall

		FootBall footBall = (FootBall) sport;// down casting
		footBall.print();

//		sport = new Hockey();
//		sport.display();// Hockey

	}

}
