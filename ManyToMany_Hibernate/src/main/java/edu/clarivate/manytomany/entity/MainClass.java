package edu.clarivate.manytomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		Cource cource1 = new Cource();
		cource1.setCourceId(1);
		cource1.setCourceName("Maths");
		cource1.setNumberOfDays(40);

		Cource cource2 = new Cource();
		cource2.setCourceId(2);
		cource2.setCourceName("English");
		cource2.setNumberOfDays(50);

		Cource cource3 = new Cource();
		cource3.setCourceId(3);
		cource3.setCourceName("Biology");
		cource3.setNumberOfDays(80);

		List<Cource> cources = new ArrayList<Cource>();
		cources.add(cource1);
		cources.add(cource2);
		cources.add(cource3);

		Student student1 = new Student();
		student1.setStudentId(101);
		student1.setStudentName("Dinga");
		student1.setStudentEmail("dinga@abc.in");
		student1.setCources(cources);

		Student student2 = new Student();
		student2.setStudentId(102);
		student2.setStudentName("Prithi");
		student2.setStudentEmail("prithi@abc.in");
		student2.setCources(cources);

		Student student3 = new Student();
		student3.setStudentId(103);
		student3.setStudentName("Rani");
		student3.setStudentEmail("rani@abc.in");
		student3.setCources(cources);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(cource1);
		manager.persist(cource2);
		manager.persist(cource3);

		manager.persist(student1);
		manager.persist(student2);
		manager.persist(student3);

		transaction.commit();
	}

}
