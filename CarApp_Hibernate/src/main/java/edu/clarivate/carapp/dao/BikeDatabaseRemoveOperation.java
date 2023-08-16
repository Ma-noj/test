package edu.clarivate.carapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseRemoveOperation {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Bike bike = manager.find(Bike.class, 107);
		if (bike != null) {
			transaction.begin();
			manager.remove(bike);
			transaction.commit();
		} else {
			System.out.println("Bike With the Given Id Not Present!!");
		}
	}

}
