package com.wz.citiesapi.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wz.citiesapi.resources.ResourseNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	HttpStatus status;
	
	@ExceptionHandler (ResourseNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourseNotFoundException e, HttpServletRequest request){
		status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Resource not found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		//comando propio do java para retornar a requizição de erro no body da pagina.
		return ResponseEntity.status(status).body(err);
	}

}
