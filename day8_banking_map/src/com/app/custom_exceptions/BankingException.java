package com.app.custom_exceptions;
//no change here
@SuppressWarnings("serial")
public class BankingException extends Exception {
	public BankingException(String mesg) {
		super(mesg);
	}
}
