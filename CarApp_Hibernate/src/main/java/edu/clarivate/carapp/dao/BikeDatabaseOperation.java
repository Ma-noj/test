package edu.clarivate.carapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseOperation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alpha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Bike bike1 = new Bike();
		bike1.setBikeId(106);
		bike1.setBikeName("Hunter");
		bike1.setBikeBrand("Royal Enfield");
		bike1.setBikeColour("Deep Gry");
		bike1.setBikePrice(213784.00);
		bike1.setBikeCC(350);

		Bike bike2 = new Bike();
		bike2.setBikeId(107);
		bike2.setBikeName("Pulsar");
		bike2.setBikeBrand("Bajaj ");
		bike2.setBikeColour("Gry Black");
		bike2.setBikePrice(118784.00);
		bike2.setBikeCC(150);

		Bike bike3 = new Bike();
		bike3.setBikeId(108);
		bike3.setBikeName("Apache");
		bike3.setBikeBrand("TVS");
		bike3.setBikeColour("Gry Black");
		bike3.setBikePrice(143784.00);
		bike3.setBikeCC(160);

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bike1);
		entityManager.persist(bike2);
		entityManager.persist(bike3);
		entityTransaction.commit();
	}

}
