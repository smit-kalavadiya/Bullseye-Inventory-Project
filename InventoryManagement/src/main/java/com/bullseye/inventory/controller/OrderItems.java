package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.OrderItem;
import com.bullseye.inventory.service.EmployeeService;
import com.bullseye.inventory.service.OrderItemService;

@RestController
public class OrderItems {

	@Autowired
	OrderItemService orderService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/OrderItems")
	public String addItems(@RequestBody OrderItem[] orders) {
		return orderService.addItems(orders);
	}
	
	
}
