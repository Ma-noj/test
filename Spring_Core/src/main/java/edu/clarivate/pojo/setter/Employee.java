package edu.clarivate.pojo.setter;

public class Employee {
	int id;
	String name;
	String email;
	double salary;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee Id = " + id);
		System.out.println("Employee Name = " + name);
		System.out.println("Employee Email = " + email);
		System.out.println("Employee Salary = " + salary);
	}
}
