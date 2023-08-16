package edu.clarivate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.clarivate.config.MyConfig;
import edu.clarivate.pojo.UserInfo;

public class MainStudent {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//		Student student = (Student) context.getBean("student");
//		student.display();
		
		UserInfo userInfo = (UserInfo) context.getBean("user1");
		userInfo.display();
	}

}
