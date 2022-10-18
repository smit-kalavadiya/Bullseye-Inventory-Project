package com.bullseye.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullseye.inventory.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository product_repo;

}
