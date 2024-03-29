package edu.clarivate.carapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseReadAllOperation {

	public static void main(String[] args) {
		String jpqlQuery = "SELECT b FROM Bike b";

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpqlQuery);

		List listOfBikes = query.getResultList();

		for (int index = 0; index < listOfBikes.size(); index++) {
			Bike bike = (Bike) listOfBikes.get(index);
			System.out.println("BikeId = " + bike.getBikeId() + " BikeName  = " + bike.getBikeName());
		}
	}

}
