package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/findEmployeeById/{employerId}")
	public Employee findEmployerById(@PathVariable("id") long id)
	{
		
		return employeeService.findEmployerById(id);
		
	}
	
	
@Autowired
private EmployeeService employeeService;
}
