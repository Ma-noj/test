package edu.clarivate.mainclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import edu.clarivate.pojo.Pen;

public class PenMain {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("MySpringConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Pen pen = (Pen) beanFactory.getBean("myPen");
		pen.write();
	}

}
