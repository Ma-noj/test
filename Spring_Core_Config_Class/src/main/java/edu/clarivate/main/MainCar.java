package edu.clarivate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.clarivate.config.MyConfig;
import edu.clarivate.pojosetterinjection.Car;

public class MainCar {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = (Car) context.getBean("car");
		
		car.display();
	}

}
