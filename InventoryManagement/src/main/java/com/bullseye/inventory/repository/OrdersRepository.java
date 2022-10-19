package com.bullseye.inventory.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Employee;
import com.bullseye.inventory.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	

	@Modifying
	@Transactional
	@Query("update orders o set o.status = ?1 where o.id = ?2")
	void updateOrder(String status, int id);

	
}
