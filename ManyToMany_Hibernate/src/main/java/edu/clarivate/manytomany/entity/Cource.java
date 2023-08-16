package edu.clarivate.manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cource {
	@Id
	private int courceId;
	private String courceName;
	private int numberOfDays;

	public int getCourceId() {
		return courceId;
	}

	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

}
