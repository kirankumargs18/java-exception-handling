package com.globallogic.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.globallogic.utils.ExceptionDetails;

@RestControllerAdvice
public class GlobalExceptionHandler {

	/*
	 * Custom Exceptions
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionDetails> resourceNotFoundException(ResourceNotFoundException exception,
			WebRequest webRequest) {

		ExceptionDetails details = new ExceptionDetails(new Date(), exception.getMessage(),
				webRequest.getDescription(false));

		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.NOT_FOUND);

	}

	/*
	 * Application Exceptions
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> exception(Exception exception,WebRequest webRequest){
		
		ExceptionDetails details=new ExceptionDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));
		

		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
