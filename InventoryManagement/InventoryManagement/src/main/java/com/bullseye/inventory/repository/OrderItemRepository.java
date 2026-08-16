package com.bullseye.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.OrderItem;
import com.bullseye.inventory.entity.Orders;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	//List<OrderItem> findByOrderid(String order);

	List<OrderItem> findByOrderid(int i);


	
}
