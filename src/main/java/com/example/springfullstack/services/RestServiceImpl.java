package com.example.springfullstack.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {

	@Override
	public List<String> getCustomers() {
		// TODO Auto-generated method stub
		List<String> users= new ArrayList<>();
		users.add("Ramavtar");
		users.add("ram lakhan");
		return users;
	}

	@Override
	public Boolean saveCustomer() {
		// TODO Auto-generated method stub
    return true;
	}

	@Override
	public String deleteCustomer() {
		// TODO Auto-generated method stub
    return " ";
	}

}
