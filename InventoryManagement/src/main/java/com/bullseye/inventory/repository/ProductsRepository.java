package com.bullseye.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
	
}
