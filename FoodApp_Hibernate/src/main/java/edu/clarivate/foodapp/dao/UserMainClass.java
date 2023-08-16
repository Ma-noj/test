package edu.clarivate.foodapp.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.foodapp.entity.User;

public class UserMainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		//LocalDateTime dateTime = LocalDateTime.now();

		//System.out.println(dateTime);
		User user = new User();
		user.setUserName("Ram");
		user.setUserEmail("Ram@abc.in");
		user.setPhoneNumber(8746534253l);
		user.setPassword("Ram@123");
		//user.setCreatedDateTime(dateTime);
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}

}
