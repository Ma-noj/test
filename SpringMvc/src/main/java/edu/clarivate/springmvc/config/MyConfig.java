package edu.clarivate.springmvc.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.clarivate.springmvc")
public class MyConfig {
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}
}
