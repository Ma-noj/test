package edu.clarivate.mainclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import edu.clarivate.pojo.setter.Computer;

public class MainComputer {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("setterConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Computer computer = (Computer) beanFactory.getBean("myComputer");
		computer.display();
	}

}
