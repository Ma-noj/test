package edu.clarivate.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	private int simId;
	private String simProvider;
	private long simNumber;

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public String getSimProvider() {
		return simProvider;
	}

	public void setSimProvider(String simProvider) {
		this.simProvider = simProvider;
	}

	public long getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}

}
