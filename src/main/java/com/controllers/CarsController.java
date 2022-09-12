package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.models.Cars;
import com.services.CarService;

@RestController
public class CarsController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/car")
	public List<Cars> getAllCars(){
		return carService.showAllCars();
	}
	
	@GetMapping("/car/id/{carId}")
	public Optional<Cars> showCarById(@PathVariable("carId") int carId){
		return carService.showCarById(carId);
	}
	
	@GetMapping("/car/{carName}")
	public Optional<Cars> showCarByName(@PathVariable("carName") String carName){
		return carService.showCarByName(carName);
	}
	
	@GetMapping("/car/color/{carColor}")
	public List<Cars> showCarByColor(@PathVariable("carColor") String carColor){
		return carService.showCarByColor(carColor);
	}
	
	@PostMapping("/car")
	public Cars insertCars(@RequestBody Cars car) {
		System.out.println(car);
		return carService.insertCar(car);
		
	}
	
	@PutMapping("/car")
	public Optional<Integer> updateNameColorById(@RequestBody Cars car){
return carService.updateCarNameColorById(car.getCarId(), car.getCarName(), car.getCarColor());
	}
	
	@DeleteMapping("/car/{carId}")
	public int deleteCarById(@PathVariable("carId") int carId) {
		return carService.deleteCarById(carId);
	}
}
