package com.globallogic.exception;

public class InvalidAgeException extends RuntimeException {

	private String message;

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
