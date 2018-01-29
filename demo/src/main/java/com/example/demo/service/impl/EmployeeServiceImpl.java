package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee findEmployerById(long id) {
		
		return empRepo.findEmployeeById(id);
	}
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	 

}
