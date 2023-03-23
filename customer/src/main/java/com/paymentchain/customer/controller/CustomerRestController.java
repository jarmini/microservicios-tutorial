package com.paymentchain.customer.controller;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentchain.customer.entities.Customer;
import com.paymentchain.customer.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	CustomerRepository customerRepository;
	EntityManagerFactory entityManagerFactory;
	
	@GetMapping()
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Customer get(@PathVariable String id) {
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> put(@PathVariable String id, @RequestBody Customer input){
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> post(@RequestBody Customer input){
		//customerRepository.save(input);
		return ResponseEntity.ok(customerRepository.save(input));
	}

	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable String id){
		return null;
	}

}
