package edu.clarivate.foodapp.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.foodapp.entity.User;

public class UserUpdateClass {

	public static void main(String[] args) {
		User user = findUserById(1);
		String updetaedPassword = "Ram@5678";
		if (user != null) {
			
			user.setPassword(updetaedPassword);
			user.setUpdatedDateTime(LocalDateTime.now());
			modifyUser(user);
			
			System.out.println("User Modified!!");
		} else {
			System.out.println("User Not Found");
		}
	}

	public static User findUserById(int userId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		return manager.find(User.class, userId);
	}

	public static void modifyUser(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(user);
		transaction.commit();
	}

}