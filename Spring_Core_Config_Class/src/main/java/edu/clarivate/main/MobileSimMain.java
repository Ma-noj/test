package edu.clarivate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.clarivate.config.MyConfig;
import edu.clarivate.pojo.Mobile;

public class MobileSimMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Mobile mobile = (Mobile) applicationContext.getBean("mobile");
		mobile.On();
	}

}