package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Supplier;
import com.bullseye.inventory.service.SupplierService;

@RestController
public class SupplierController {
	@Autowired
	SupplierService sup_ser;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/Supplier")
	public List<Supplier> getSupplier(){
		return sup_ser.getAllSuppliers();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/GetSupplier")
	public Supplier getSupplierByName(@RequestBody Supplier data){
		return sup_ser.findByName(data.getName());
	}
}
