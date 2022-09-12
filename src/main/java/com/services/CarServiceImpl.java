package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Cars;
import com.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carRepository;
	
	

	@Override
	public List<Cars> showAllCars() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	@Override
	public Cars insertCar(Cars c) {
		
		return carRepository.save(c);
	}

	@Override
	public Optional<Integer> updateCarNameColorById(int carId, String carName, String carColor) {
		// TODO Auto-generated method stub
		return carRepository.updateCarNameColorById(carId, carName, carColor);
	}

	@Override
	public int deleteCarById(int carId) {
		// TODO Auto-generated method stub
	return carRepository.deleteCarById(carId);
}

	@Override
	public Optional<Cars> showCarByName(String carName) {
		// TODO Auto-generated method stub
		return carRepository.showCarByName(carName);
	}

	@Override
	public List<Cars> showCarByColor(String carColor) {
		// TODO Auto-generated method stub
		System.out.println(carColor);
		return (List<Cars>)carRepository.showCarByColor(carColor);
	}

	@Override
	public Optional<Cars> showCarById(int carId) {
		// TODO Auto-generated method stub
		return carRepository.showCarById(carId);
	}

	
}
