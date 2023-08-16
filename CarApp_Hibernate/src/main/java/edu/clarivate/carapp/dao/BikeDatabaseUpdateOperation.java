package edu.clarivate.carapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;

public class BikeDatabaseUpdateOperation {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Bike Id To Modify!!");
		int bikeId = read.nextInt();
		System.out.println("Enter the Price to be Updated!!");
		double bikePrice = read.nextDouble();
		Bike bike = findBikeBYId(bikeId);
		if (bike != null) {
			bike.setBikePrice(bikePrice);
			updateBikeInfo(bike);
			System.out.println("Bike With the Id = " + bikeId + " Is Updeted!!");
		} else {
			System.out.println("Bike With the Id = " + bikeId + " Is Not Found!!");
		}
	}

	public static Bike findBikeBYId(int bikeId) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();

		Bike bike = manager.find(Bike.class, bikeId);
		return bike;
	}

	public static void updateBikeInfo(Bike bike) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.merge(bike);
		transaction.commit();
	}
}
