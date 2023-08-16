package edu.clarivate.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUser {

	public static void main(String[] args) {

		/*
		 * ClassPathResource resource = new ClassPathResource("setterConfig.xml");
		 * BeanFactory beanFactory = new XmlBeanFactory(resource); User user = (User)
		 * beanFactory.getBean("userInfo");
		 */

		 ApplicationContext applicationContext = new
		 ClassPathXmlApplicationContext("setterConfig.xml");

		System.out.println("Test");
	}

}
