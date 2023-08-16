package edu.clarivate.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.clarivate.pojo.constructor.Teacher;

public class MainTeacher {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorconfig.xml");
		Teacher teacher = (Teacher) context.getBean("myTeacher");
		teacher.display();
	}
}
