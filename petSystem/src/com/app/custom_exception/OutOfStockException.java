package com.app.custom_exception;

public class OutOfStockException extends Exception {
          public OutOfStockException(String msg) {
        	  super(msg);
          }
}
