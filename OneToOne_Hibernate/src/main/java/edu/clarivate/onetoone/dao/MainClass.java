package edu.clarivate.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.onetoone.entity.Pan;
import edu.clarivate.onetoone.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Person person = new Person();
		person.setPersonId(102);
		person.setPersonName("Prithi");
		person.setPersonAge(22);

		Pan pan = new Pan();
		pan.setPanId(2);
		pan.setPanNumber("TESA87UY");
		pan.setNameOnPan("Raju Prithi");
		pan.setPerson(person);

		transaction.begin();
		manager.persist(person);
		manager.persist(pan);
		transaction.commit();
	}

}
