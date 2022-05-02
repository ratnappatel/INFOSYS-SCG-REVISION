package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.Address;
import com.gl.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService
{
	@Autowired AddressRepository repository;

	@Override
	public List<Address> getAllAddress() {
		
		return (List<Address>) repository.findAll();
	}

}
