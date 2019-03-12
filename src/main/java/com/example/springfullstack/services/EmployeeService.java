package com.example.springfullstack.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springfullstack.entities.Employee;

@Service
public interface EmployeeService {

	
	public Employee createEmployee(Employee employee);
	  public Employee getEmployeeById(Integer id);
	  public List<Employee> getEmployees();
//	  public void deleteEmployee();
//	  public Employee updateEmployee();
	  
}
