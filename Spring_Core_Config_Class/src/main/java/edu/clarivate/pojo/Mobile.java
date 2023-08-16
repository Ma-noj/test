package edu.clarivate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	Sim sim;

	public void On() {
		System.out.println("Mobile Is Turened On!!");
		sim.connect();
	}
}
