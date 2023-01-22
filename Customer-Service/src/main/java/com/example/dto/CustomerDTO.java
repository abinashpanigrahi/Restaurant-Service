package com.example.dto;

import lombok.Data;

@Data
public class CustomerDTO {

	private String firstName;
	private String middleName;
	private String lastName;
	private String userName;
	private String password;
	private String mobileNumber;
	private String emailId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private Byte state;
	private Integer pincode;

}
