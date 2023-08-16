package edu.clarivate.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int personId;
	private String personName;
	private int personAge;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

}
