package com.services;

import java.util.List;
import java.util.Optional;

import com.models.Cars;

public interface CarService {
	public List<Cars> showAllCars();
	public Optional <Cars> showCarById(int carId);
	public Optional <Cars> showCarByName(String carName);
	public List <Cars> showCarByColor(String carColor);
	public Cars insertCar(Cars car);
	public Optional<Integer> updateCarNameColorById(int carId, String carName,String carColor);
	public int deleteCarById(int carId);
}
