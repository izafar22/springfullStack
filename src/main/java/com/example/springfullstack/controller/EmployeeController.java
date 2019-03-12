package com.example.springfullstack.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springfullstack.entities.Books;
import com.example.springfullstack.entities.Employee;
import com.example.springfullstack.services.BookService;
import com.example.springfullstack.services.EmployeeService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path="employee")
public class EmployeeController {

	  private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	  @Autowired
	  EmployeeService employeeService;
	  
	  @Autowired
	  BookService bookService;
	  
	  
	  @GetMapping(path="/")
	  public List<Employee> getEmployees() {
		  return employeeService.getEmployees() ;
	  }
	  
	  @GetMapping(path="/{id}")
	  public Employee getEmployeeById(@PathVariable Integer id) {
		  return employeeService.getEmployeeById(id) ;
	  }
	  
	  
	  @PostMapping(path="/",consumes = "application/json", produces = "application/json")
	  public Employee createEmployee(@RequestBody Employee employee) {
		  logger.info("Inside createEmployee with name {}, age {}", employee.getName(), employee.getAge());
		  return employeeService.createEmployee(employee) ;
	  }
	  
	  @GetMapping(path="/books/{id}")
	  public Books getBookById(@PathVariable Integer id) {
		  return bookService.getbookById(id) ;
	  }
	  
	  @PostMapping(path="/createbooks",consumes = "application/json", produces = "application/json")
	  public Books createBooks(@RequestBody Books books) {
		  //logger.info("Inside createEmployee with name {}, age {}", employee.getName(), employee.getAge());
		  return bookService.createBooks(books) ;
	  }
	  
	  @DeleteMapping(path="/books/{id}")
	  public ResponseEntity<String> deleteBookById(@PathVariable Integer id) {
		  Books booktoDel= bookService.getbookById(id);
		  HttpStatus status;
		  if(booktoDel != null) {
			  bookService.deleteBookById(id);
			  status =   HttpStatus.NO_CONTENT;
		  } else {
			  status =   HttpStatus.NOT_FOUND;
		  }
		  
		  
		  return new ResponseEntity<>(status);
	  }
	
}
