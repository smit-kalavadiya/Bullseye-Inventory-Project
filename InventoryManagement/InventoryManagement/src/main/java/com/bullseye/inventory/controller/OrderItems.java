package com.bullseye.inventory.controller;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.OrderItem;
import com.bullseye.inventory.entity.Orders;
import com.bullseye.inventory.service.EmployeeService;
import com.bullseye.inventory.service.OrderItemService;

@RestController
public class OrderItems {

	@Autowired
	OrderItemService orderService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/OrderItems")
	public Map<String,String> addItems(@RequestBody OrderItem[] orders) {
		return orderService.addItems(orders);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getItems")
	public List<OrderItem> findByOrderId(@RequestBody String orderid) {
		System.out.println(Integer.parseInt(orderid));
		
		return orderService.findByOrderId(orderid); 
	}
	
	
	
}
