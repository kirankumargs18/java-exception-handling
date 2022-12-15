package com.globallogic.exception;

public class InValidNameException extends RuntimeException {

	private static final long serialVersionUID = 5642037467639014320L;
	private String message;

	public InValidNameException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
