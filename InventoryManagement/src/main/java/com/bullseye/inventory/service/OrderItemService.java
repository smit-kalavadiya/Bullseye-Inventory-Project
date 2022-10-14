package com.bullseye.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.OrderItem;
import com.bullseye.inventory.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
	
	public String addItems(OrderItem[] orders) {
		orderItemRepository.saveAll(List.of(orders));
		return "Data saved";
	}

}
