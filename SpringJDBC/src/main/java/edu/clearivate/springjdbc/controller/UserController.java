package edu.clearivate.springjdbc.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.clearivate.springjdbc.dao.SpringJDBCConfig;
import edu.clearivate.springjdbc.dao.UserDao;
import edu.clearivate.springjdbc.entity.User;

public class UserController {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
		UserDao dao = (UserDao) context.getBean("userDao");

//		User user = (User) context.getBean("user");
//		user.setId(103);
//		user.setName("Rani");
//		user.setEmail("Rani@abc.in");
//		user.setPassword("Rani@1234");
//
//		int result = dao.saveUser(user);
//		if (result == 1) {
//			System.out.println("User info saved");
//		}

		/*
		 * int result = dao.updateUser(103, "rani@abc.com"); System.out.println(result +
		 * "row affected");
		 */

//		int result = dao.deleteUser(103);
//		System.out.println(result + " row Affeacted");

//		User user = dao.findUserById(102);
//
//		System.out.println("User Id = " + user.getId());
//		System.out.println("User Name = " + user.getName());
//		System.out.println("User Email = " + user.getEmail());
//		System.out.println("User Password = " + user.getPassword());

		List<User> listOfUser = dao.findAllUser();

		for (int index = 0; index < listOfUser.size(); index++) {
			User user = listOfUser.get(index);
			System.out.println("User Id = " + user.getId());
			System.out.println("User Name = " + user.getName());
			System.out.println("User Email = " + user.getEmail());
			System.out.println("User Password = " + user.getPassword());
			System.out.println();
		}
	}
}
