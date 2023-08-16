package edu.clarivate.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	private int panId;
	private String panNumber;
	private String nameOnPan;
	@OneToOne
	private Person person;

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getNameOnPan() {
		return nameOnPan;
	}

	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
