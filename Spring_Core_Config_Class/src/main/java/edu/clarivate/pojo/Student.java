package edu.clarivate.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "101")
	int id;
	@Value(value = "Prithi")
	String name;
	@Value(value = "89.76")
	double marks;

	public void display() {
		System.out.println("Student id = " + id);
		System.out.println("Student Name = " + name);
		System.out.println("Student marks = " + marks);
	}
}
