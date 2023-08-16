package edu.clarivate.onetomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileBrand;
	private String mobileName;
	private double mobilePrice;
	@OneToMany
	private List<Sim> sims;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public List<Sim> getSims() {
		return sims;
	}

	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}

}
