package com.repositories;


import java.util.List;
import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.models.Cars;

@Repository
public interface CarRepository  extends JpaRepository<Cars,Integer>{
	
	@Modifying
	@Transactional
	@Query("UPDATE Cars c SET c.carName = :carName, c.carColor = :carColor WHERE c.carId = :carId")
	public Optional<Integer> updateCarNameColorById(@Param("carId") int carId,@Param("carName") String newCarName,@Param("carColor")String newCarColor);
	
	@Modifying
	@Transactional
 @Query("DELETE FROM Cars c WHERE c.carId = :carId")
	public int deleteCarById(@Param("carId")int carId);
	
	
	@Transactional
 @Query("FROM Cars c WHERE c.carId = :carId")
	public Optional<Cars> showCarById(@Param("carId")int carId);
	
	@Transactional
 @Query("FROM Cars c WHERE c.carName = :carName")
	public Optional<Cars> showCarByName(@Param("carName")String carName);
	
	
	@Transactional
 @Query("FROM Cars c WHERE c.carColor = :carColor")
	public List<Cars> showCarByColor(@Param("carColor")String carColor);

	
}
