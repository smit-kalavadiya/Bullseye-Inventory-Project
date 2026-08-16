package com.bullseye.inventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Orders;
import com.bullseye.inventory.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	OrdersService service;
	  
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/Orders")
	public List<Orders> getOrders(){ 
		return service.getOrders(); 
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/sendOrder")
	public Orders sendOrder(@RequestBody Orders order) {
		return service.sendOrder(order);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updateorder")
	public void updateOrder(@RequestBody Orders order) {
		service.updateOrder(order);
	}
	
}
