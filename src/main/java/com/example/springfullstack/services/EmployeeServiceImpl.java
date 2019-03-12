package com.example.springfullstack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springfullstack.entities.Employee;
import com.example.springfullstack.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	

//	@Override
//	public void deleteEmployee() {
//		// TODO Auto-generated method stub
//
//	}

	


	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

}
