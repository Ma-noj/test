package edu.test.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager entityManager = factory.createEntityManager();
		Test test = new Test();

		test.setId(101);
		test.setName("Ram");
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(test);
		entityTransaction.commit();
	}
}