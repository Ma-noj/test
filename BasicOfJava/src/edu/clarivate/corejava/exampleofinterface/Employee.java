package edu.clarivate.corejava.exampleofinterface;

public class Employee extends User {
	private String decs;
	private double salary;

	public String getDecs() {
		return decs;
	}

	public void setDecs(String decs) {
		this.decs = decs;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
