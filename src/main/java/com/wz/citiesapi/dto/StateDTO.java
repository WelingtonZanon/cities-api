package com.wz.citiesapi.dto;

import java.util.List;

import com.wz.citiesapi.entities.Country;
import com.wz.citiesapi.entities.State;

public class StateDTO {	
	
	  private Long id;
	  private String name;
	  private String uf;
	  private Integer ibge;
	  private Country country;
	  private List<Integer> ddd;
	  
	  public StateDTO() {
		  
	  }

	public StateDTO(Long id, String name, String uf, Integer ibge, Country country, List<Integer> ddd) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.country = country;
		this.ddd = ddd;
	}
	
	public StateDTO(State entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.uf = entity.getUf();
		this.ibge = entity.getIbge();
		this.country = entity.getCountry();
		this.ddd = entity.getDdd();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Integer> getDdd() {
		return ddd;
	}

	public void setDdd(List<Integer> ddd) {
		this.ddd = ddd;
	}	  
	  

}
