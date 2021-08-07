package com.wz.citiesapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wz.citiesapi.dto.StateDTO;
import com.wz.citiesapi.services.StateService;

@RestController
@RequestMapping(value = "/states")
public class StateResource {

private final StateService service;
	
	@Autowired
	StateResource(StateService service){
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<Page<StateDTO>> findAll(final Pageable page){
		Page<StateDTO> list = service.findAllPage(page);		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<StateDTO> findById(@PathVariable Long id){
		StateDTO dto = service.findByID(id);
		return ResponseEntity.ok().body(dto);
	}
}
