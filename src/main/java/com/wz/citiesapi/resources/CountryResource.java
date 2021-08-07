package com.wz.citiesapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wz.citiesapi.dto.CountryDTO;
import com.wz.citiesapi.services.CountryService;

@RestController
@RequestMapping(value = "/countries")
public class CountryResource {

private final CountryService service;
	
	@Autowired
	CountryResource(CountryService service){
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<Page<CountryDTO>> findAll(final Pageable page){
		Page<CountryDTO> list = service.findAllPage(page);		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CountryDTO> findById(@PathVariable Long id){
		CountryDTO dto = service.findByID(id);
		return ResponseEntity.ok().body(dto);
	}
}
