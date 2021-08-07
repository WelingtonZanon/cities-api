package com.wz.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wz.citiesapi.entities.Country;

@Repository 
public interface CountryRepository extends JpaRepository<Country, Long> {
	
}
