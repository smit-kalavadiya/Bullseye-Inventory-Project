package com.bullseye.inventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/products")
	public Optional<Products> findById(@RequestBody String id) {
		return service.findById(Integer.parseInt(id));
	}
	
}
