package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;

@Repository
public interface AddressDaoImpl extends JpaRepository<Address, Long>{

}
