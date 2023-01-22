package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.CustomerDTO;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("create")
	public String createCustomer(@RequestBody CustomerDTO customerDTO) {
		customerService.createCustomer(customerDTO);
		return "done";
	}
}
