package com.bullseye.inventory.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
	Supplier findByName(String name);
}
