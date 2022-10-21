package com.bullseye.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.entity.Products;
import com.bullseye.inventory.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository product_repo;

	public List<Products> getProducts() {
		//product_repo.findById(null)
		
		return product_repo.findAll();
	}

	public Optional<Products> findById(int parseInt) {
		return product_repo.findById(parseInt);
	}

	public void updateProduct(Products product) {
		
		product_repo.updateProduct(product.getCost(),product.getDescription(),product.getImage(),product.getName(),product.getQuantity(),product.getSeason(),product.getShelflocation(),product.getWeight(),product.getId());
		
	}

	public Products addProduct(Products product) {
		return product_repo.save(product);
	}
	
	//new
	public void deleteById(int parseInt) {
		 product_repo.deleteProduct(parseInt);
	}

}
