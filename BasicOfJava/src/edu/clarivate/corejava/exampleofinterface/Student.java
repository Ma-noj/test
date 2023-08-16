package edu.clarivate.corejava.exampleofinterface;

public class Student extends User {

	private String subject;
	private double score;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
