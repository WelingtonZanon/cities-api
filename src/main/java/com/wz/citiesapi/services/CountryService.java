package com.wz.citiesapi.services;





import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wz.citiesapi.dto.CountryDTO;
import com.wz.citiesapi.entities.Country;
import com.wz.citiesapi.repositories.CountryRepository;
import com.wz.citiesapi.resources.ResourseNotFoundException;

@Service
public class CountryService {
	
	private final CountryRepository repository;
	
	@Autowired
	CountryService(CountryRepository repository){
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public Page<CountryDTO> findAllPage(final Pageable page){
		Page<Country> list = repository.findAll(page);
		return list.map(x -> new CountryDTO(x));
	}
	
	public CountryDTO findByID(Long id) {
		Optional<Country> obj = repository.findById(id);
		Country entity = obj.orElseThrow(() -> new ResourseNotFoundException("Entity not found"));
		return new CountryDTO(entity);
	}
}
