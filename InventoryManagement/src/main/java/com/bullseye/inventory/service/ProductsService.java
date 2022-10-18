package com.bullseye.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Products;
import com.bullseye.inventory.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository product_repo;

	public List<Products> getProducts() {
		return product_repo.findAll();
	}

}
