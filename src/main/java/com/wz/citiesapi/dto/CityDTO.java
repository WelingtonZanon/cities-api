package com.wz.citiesapi.dto;

import org.springframework.data.geo.Point;

import com.wz.citiesapi.entities.City;

public class CityDTO {	
	
	  private Long id;
	  private String name;
	  private Integer uf;
	  private Integer ibge;
	  private String geolocation;
	  private Point location;

	  public CityDTO() {
		  
	  }

	public CityDTO(Long id, String name, Integer uf, Integer ibge, String geolocation, Point location) {
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.ibge = ibge;
		this.geolocation = geolocation;
		this.location = location;
	}
	
	public CityDTO(City entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.uf = entity.getUf();
		this.ibge = entity.getIbge();
		this.geolocation = entity.getGeolocation();
		this.location = entity.getLocation();
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

	public Integer getUf() {
		return uf;
	}

	public void setUf(Integer uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public String getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}	
	  
}
