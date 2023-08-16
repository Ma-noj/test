package edu.clarivate.mainclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import edu.clarivate.pojo.Marker;

public class MainMarker {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("MySpringConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Marker marker = (Marker) beanFactory.getBean("marker");
		marker.display();
	}

}
