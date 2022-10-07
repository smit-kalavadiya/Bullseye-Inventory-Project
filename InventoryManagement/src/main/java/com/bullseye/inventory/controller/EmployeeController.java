package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.repository.EmployeeRepository;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository erepo;
	
	@GetMapping("/Employee")
	public List<Employee> getEmployee() {
		return erepo.findAll();
	}
	
}
