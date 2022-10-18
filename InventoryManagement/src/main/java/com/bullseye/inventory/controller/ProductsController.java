package com.bullseye.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bullseye.inventory.entity.Products;
import com.bullseye.inventory.service.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductsService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/products")
	public List<Products> getProducts(){
		return service.getProducts();
	}
	
}
