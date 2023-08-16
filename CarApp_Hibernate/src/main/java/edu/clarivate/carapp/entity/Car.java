package edu.clarivate.carapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carId;
	private String carName;
	private String carBrand;
	private String carColour;
	private double carPrice;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

}
