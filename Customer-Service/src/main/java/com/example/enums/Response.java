package com.example.enums;

@SuppressWarnings("unused")
public enum Response {
	
	SUCCESS(1, "Success"),
	FAILURE(0, "Failure");
	
	private int value;
	private String message;
	
	private Response(int value, String message) {
		this.value = value;
		this.message = message;
	}
}
