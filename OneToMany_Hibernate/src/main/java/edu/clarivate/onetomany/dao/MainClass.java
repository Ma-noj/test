package edu.clarivate.onetomany.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.clarivate.onetomany.entity.Mobile;
import edu.clarivate.onetomany.entity.Sim;

public class MainClass {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setMobileId(102);
		mobile.setMobileBrand("lava");
		mobile.setMobileName("Angi 2");
		mobile.setMobilePrice(20000);

		Sim sim1 = new Sim();
		sim1.setSimId(3);
		sim1.setSimProvider("Aritel");
		sim1.setSimNumber(7635425342l);

		Sim sim2 = new Sim();
		sim2.setSimId(4);
		sim2.setSimProvider("BSNL");
		sim2.setSimNumber(9876534290l);

		List<Sim> sims = new ArrayList<Sim>();

		sims.add(sim1);
		sims.add(sim2);

		mobile.setSims(sims);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

//		transaction.begin();
//		manager.persist(sim1);
//		manager.persist(sim2);
//		manager.persist(mobile);
//		transaction.commit();

	}

}
