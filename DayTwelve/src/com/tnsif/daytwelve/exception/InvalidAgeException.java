package com.tnsif.daytwelve.exception;

public class InvalidAgeException extends Exception {
	
	InvalidAgeException()
	{
		System.out.println(("Invalid Age"));
	}

	InvalidAgeException(String message)
	{
		System.out.println((message));
	}
}
