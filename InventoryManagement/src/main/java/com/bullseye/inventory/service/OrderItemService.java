package com.bullseye.inventory.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.OrderItem;
import com.bullseye.inventory.entity.Orders;
import com.bullseye.inventory.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
	
	public Map<String, String> addItems(OrderItem[] orders) {
		orderItemRepository.saveAll(List.of(orders));
		HashMap<String, String> map = new HashMap<>();
		map.put("response","Data Saved");
		return map;
	}

	public List<OrderItem> findByOrderId(String order) {
		return orderItemRepository.findByOrderid(Integer.parseInt(order));
	}


}
