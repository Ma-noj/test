package edu.clarivate.carapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseOperation2 {
	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.setBikeId(106);
		bike1.setBikeName("Hunter");
		bike1.setBikeBrand("Royal Enfield");
		bike1.setBikeColour("Deep Gry");
		bike1.setBikePrice(250000.00);
		bike1.setBikeCC(350);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alpha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(bike1);
		entityTransaction.commit();
	}
}
