package com.bullseye.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.Orders;
import com.bullseye.inventory.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository repo;
	
	public List<Orders> getOrders() {
		return repo.findAll();
	}

	public Orders sendOrder(Orders order) {
		return repo.save(order);
	}

	public Optional<Orders> findById(Orders orderid) {
		return repo.findById(orderid.getId());
	}

}
