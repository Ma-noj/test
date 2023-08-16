package edu.clarivate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.clarivate.config.MyConfig;
import edu.clarivate.pojoconstructorinjection.Person;

public class MainPerson {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = (Person) context.getBean("person");

		person.display();

	}

}
