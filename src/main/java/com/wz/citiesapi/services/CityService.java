package com.wz.citiesapi.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wz.citiesapi.dto.CityDTO;
import com.wz.citiesapi.entities.City;
import com.wz.citiesapi.repositories.CityRepository;
import com.wz.citiesapi.resources.ResourseNotFoundException;

@Service
public class CityService {
	
	private final CityRepository repository;
	
	@Autowired
	CityService(CityRepository repository){
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public Page<CityDTO> findAllPage(final Pageable page){
		Page<City> list = repository.findAll(page);
		return list.map(x -> new CityDTO(x));
	}
	
	public CityDTO findByID(Long id) {
		Optional<City> obj = repository.findById(id);
		City entity = obj.orElseThrow(() -> new ResourseNotFoundException("Entity not found"));
		return new CityDTO(entity);
	}
}
