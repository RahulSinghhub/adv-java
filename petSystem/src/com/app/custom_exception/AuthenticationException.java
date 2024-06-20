package com.app.custom_exception;

public class AuthenticationException extends Exception {
	public AuthenticationException(String msg) {
		super(msg);
	}

}
