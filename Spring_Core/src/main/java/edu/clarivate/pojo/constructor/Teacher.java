package edu.clarivate.pojo.constructor;

public class Teacher {
	String name;
	String subject;

	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public void display() {
		System.out.println("Teacher Name = " + name);
		System.out.println("Teacher Subject = " + subject);
	}
}
