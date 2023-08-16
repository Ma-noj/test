package edu.clarivate.carapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseReadOperation {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();

		Bike bike = manager.find(Bike.class, 107);
		if (bike != null) {
			System.out.println("BikeId = " + bike.getBikeId() + " BikeName = " + bike.getBikeName() + " Bike Price = "
					+ bike.getBikePrice());
		} else {
			System.out.println("Bike With the Given Id Not Present!!");
		}
	}

}
