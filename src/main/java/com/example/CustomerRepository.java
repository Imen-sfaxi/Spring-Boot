package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by akabbaj on 02/12/2016.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByFirstName(String firstName);
	public List<Customer> findByLastName(String lastName);

}
