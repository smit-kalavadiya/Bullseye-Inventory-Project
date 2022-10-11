package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Orders;
import com.bullseye.inventory.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	OrdersService service;
	
	@GetMapping("/Orders")
	public List<Orders> getOrders(){ 
		return service.getOrders(); 
		
	}
}
