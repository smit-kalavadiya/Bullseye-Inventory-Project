package com.bullseye.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	
}
