package edu.clarivate.carapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.carapp.entity.Bike;
import edu.clarivate.carapp.entity.Car;

public class CarDatabaseOperation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alpha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Car car1 = new Car();
		car1.setCarId(104);
		car1.setCarName("maruti 800");
		car1.setCarBrand("Maruti Suzuki");
		car1.setCarColour("matte black");
		car1.setCarPrice(400000.00);

		Car car2 = new Car();
		car2.setCarId(105);
		car2.setCarName("alto");
		car2.setCarBrand("Maruti Suzuki");
		car2.setCarColour("matte black");
		car2.setCarPrice(500000.00);

		Car car3 = new Car();
		car3.setCarId(106);
		car3.setCarName("Taigun");
		car3.setCarBrand("Volkswagen");
		car3.setCarColour("Black");
		car3.setCarPrice(3000000);

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(car1);
		entityManager.persist(car2);
		entityManager.persist(car3);
		entityTransaction.commit();
	}

}
