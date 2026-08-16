package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.repository.EmployeeRepository;
import com.bullseye.inventory.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService emp_ser;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/Employee")
	public List<Employee> getEmployee() {
		return emp_ser.getAllEmployees();
	}
	 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/GetEmployee")
	public Employee getEmployeeByEmail(@RequestBody Employee data) {
		return emp_ser.findByEmail(data.getEmail());
	}
	
	
	
}
