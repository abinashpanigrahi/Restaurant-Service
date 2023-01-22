package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.CustomerDTO;
import com.example.model.Address;
import com.example.model.Customer;
import com.example.repository.CustomerDaoImpl;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDaoImpl customerDaoImpl;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor  = Exception.class)
	public void createCustomer(CustomerDTO customerDTO) {
		Address address = new Address();
		address.setAddressLine1(customerDTO.getAddressLine1());
		address.setAddressLine2(customerDTO.getAddressLine2());
		address.setCity(customerDTO.getCity());
		address.setState(customerDTO.getState());
		address.setPincode(customerDTO.getPincode());
		Customer customer = new Customer();
		customer.setFirstName(customerDTO.getFirstName());
		customer.setMiddleName(customerDTO.getMiddleName());
		customer.setLastName(customerDTO.getLastName());
		customer.setUserName(customerDTO.getUserName());
		customer.setPassword(customerDTO.getPassword());
		customer.setMobileNumber(customerDTO.getMobileNumber());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setAddress(address);
		customerDaoImpl.save(customer);
	}

}
