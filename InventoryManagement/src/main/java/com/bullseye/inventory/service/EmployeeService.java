package com.bullseye.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emp_repo;

	public List<Employee> getAllEmployees() {
		return emp_repo.findAll();
	}

	public Employee findByEmail(String email) {
		
		return emp_repo.findByEmail(email);
	}
	
	
	
	
}
