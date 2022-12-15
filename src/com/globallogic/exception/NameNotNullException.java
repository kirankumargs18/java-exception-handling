package com.globallogic.exception;

public class NameNotNullException extends RuntimeException {

	private static final long serialVersionUID = 6474436302263722944L;
	private String message;

	public NameNotNullException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
