package com.gl.repository;

import org.springframework.data.repository.CrudRepository;

import com.gl.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> 
{

}
