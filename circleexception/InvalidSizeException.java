package com.skillstorm.circleexception;

public class InvalidSizeException extends IllegalArgumentException{
	public  InvalidSizeException() {
		super();
	}
	public  InvalidSizeException(String message) {
		super(message);
	}

}
