package com.example.springfullstack.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springfullstack.services.RestService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path="customer")
public class RestController {
	
	@Autowired
	RestService restService;

	@GetMapping(path="all")
	public List<String> getCustomer() {
		return restService.getCustomers();
	}
	
	@PostMapping(path="save")
	public Boolean saveCustomer() {
		return restService.saveCustomer();
	}
	
	@DeleteMapping(path="{id}")
	public String removeUser() {
	return restService.deleteCustomer();
	}
	
	
}
