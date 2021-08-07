package com.wz.citiesapi.resources;

public class ResourseNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(String msg) {
		super(msg);
	}
}
