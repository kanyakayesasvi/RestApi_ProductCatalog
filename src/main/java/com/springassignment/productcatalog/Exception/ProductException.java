package com.springassignment.productcatalog.Exception;

public class ProductException extends RuntimeException {
	private static final long serialVersionID=1L;
	public ProductException(String message) {
		super(message);
		
		
				
				
	}
	public ProductException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
