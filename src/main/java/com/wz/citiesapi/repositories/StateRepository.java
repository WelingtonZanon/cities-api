package com.wz.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wz.citiesapi.entities.State;

@Repository 
public interface StateRepository extends JpaRepository<State, Long> {
	
}
