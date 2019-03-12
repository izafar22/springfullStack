package com.example.springfullstack.services;

import java.util.List;

public interface RestService {
 
	public List<String> getCustomers();
	public Boolean saveCustomer();
	public String deleteCustomer();
}
