package com.wz.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wz.citiesapi.entities.City;

@Repository 
public interface CityRepository extends JpaRepository<City, Long> {
	
}
