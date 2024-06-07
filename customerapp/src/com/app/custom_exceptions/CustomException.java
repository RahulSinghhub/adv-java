package com.app.custom_exceptions;

@SuppressWarnings("serial")
public class CustomException extends Exception  {
    public CustomException(String msg) {
    	 super(msg);
    }
}
