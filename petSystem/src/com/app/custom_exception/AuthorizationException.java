package com.app.custom_exception;

public class AuthorizationException extends Exception {
	public AuthorizationException(String msg) {
		super(msg);
	}

}
