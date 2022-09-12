package com.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {
	@Id
	private int carId;
	private String carName;
	private String carColor;
	
	public Cars() {
		super();
	}

	public Cars(int carId, String carName, String carColor) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carColor = carColor;
	}

	public int getCarId() {
		return carId;
	}

	public String getCarName() {
		return carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", carName=" + carName + ", carColor=" + carColor + "]";
	}
	
	
	
	
	
}
