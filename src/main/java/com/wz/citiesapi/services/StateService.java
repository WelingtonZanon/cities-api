package com.wz.citiesapi.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wz.citiesapi.dto.StateDTO;
import com.wz.citiesapi.entities.State;
import com.wz.citiesapi.repositories.StateRepository;
import com.wz.citiesapi.resources.ResourseNotFoundException;

@Service
public class StateService {
	
	private final StateRepository repository;
	
	@Autowired
	StateService(StateRepository repository){
		this.repository = repository;
	}
	
	@Transactional(readOnly = true)
	public Page<StateDTO> findAllPage(final Pageable page){
		Page<State> list = repository.findAll(page);
		return list.map(x -> new StateDTO(x));
	}
	
	public StateDTO findByID(Long id) {
		Optional<State> obj = repository.findById(id);
		State entity = obj.orElseThrow(() -> new ResourseNotFoundException("Entity not found"));
		return new StateDTO(entity);
	}
}
