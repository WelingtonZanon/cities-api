package com.wz.citiesapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wz.citiesapi.dto.CityDTO;
import com.wz.citiesapi.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {

private final CityService service;
	
	@Autowired
	CityResource(CityService service){
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<Page<CityDTO>> findAll(final Pageable page){
		Page<CityDTO> list = service.findAllPage(page);		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CityDTO> findById(@PathVariable Long id){
		CityDTO dto = service.findByID(id);
		return ResponseEntity.ok().body(dto);
	}
}
