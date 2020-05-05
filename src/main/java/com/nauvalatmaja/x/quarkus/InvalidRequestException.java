package com.nauvalatmaja.x.quarkus;

public class InvalidRequestException extends Exception {
	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String errorDescription;
	
	public InvalidRequestException(String errorCode, String errorDescription) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
}
