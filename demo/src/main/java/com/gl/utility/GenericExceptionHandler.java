package com.gl.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> genericHandler()
	{
		return new ResponseEntity("No Records Available ..", HttpStatus.BAD_REQUEST);
	}

}
