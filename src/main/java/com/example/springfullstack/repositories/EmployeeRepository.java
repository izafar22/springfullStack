package com.example.springfullstack.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springfullstack.entities.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
