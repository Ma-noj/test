package edu.clarivate.pojoconstructorinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	int id;
	String name;
	int age;

	public Person(@Value(value = "101") int id,@Value(value = "Dinga") String name,@Value(value = "20") int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	 public void display() {
		System.out.println("Person Id = "+id);
		System.out.println("Person Name = "+name);
		System.out.println("Person Age = "+age);
	}

}
