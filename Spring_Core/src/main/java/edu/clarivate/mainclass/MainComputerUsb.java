package edu.clarivate.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.clarivate.pojo.constructor.Computer;

public class MainComputerUsb {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("setterConfig.xml");
//		Computer1 computer = (Computer1) context.getBean("computer");
//		computer.use();

		ApplicationContext context = new ClassPathXmlApplicationContext("constructorconfig.xml");
		Computer computer = (Computer) context.getBean("computer");
		computer.use();
	}
}
