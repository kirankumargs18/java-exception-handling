package com.globallogic.utils;

import java.util.Date;

public class ExceptionDetails {

	private Date timestamp;
	private String message;
	private String details;

	public ExceptionDetails() {
		super();
	}

	public ExceptionDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

}
