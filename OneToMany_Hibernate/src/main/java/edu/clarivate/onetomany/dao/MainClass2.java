package edu.clarivate.onetomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.clarivate.onetomany.entity.Mobile;
import edu.clarivate.onetomany.entity.Sim;

public class MainClass2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		Mobile mobile = manager.find(Mobile.class, 101);
		System.out.println("Mobile Name = " + mobile.getMobileName());
		System.out.println("Mobile Price = " + mobile.getMobilePrice());
		List<Sim> sims = mobile.getSims();
		int numberOfSims = sims.size();
		for (int index = 0; index < numberOfSims; index++) {
			Sim sim = sims.get(index);
			System.out.println("Sim Number = " + sim.getSimNumber());
		}
	}

}