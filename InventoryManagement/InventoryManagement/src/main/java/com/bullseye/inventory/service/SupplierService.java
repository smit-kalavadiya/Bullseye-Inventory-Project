package com.bullseye.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Supplier;
import com.bullseye.inventory.repository.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	SupplierRepository sup_repo;
	
	public List<Supplier> getAllSuppliers(){
		return sup_repo.findAll();
	}
	public Supplier findByName(String name) {
		return sup_repo.findByName(name);
	}
}
