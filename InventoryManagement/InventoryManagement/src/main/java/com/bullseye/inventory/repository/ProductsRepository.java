package com.bullseye.inventory.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bullseye.inventory.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

	@Modifying
	@Transactional
	@Query("update products p set p.cost = ?1,p.description = ?2,p.image = ?3,p.name = ?4,p.quantity = ?5,p.season = ?6,p.shelflocation = ?7,p.weight = ?8 where p.id = ?9")
	void updateProduct(long cost, String description, String image, String name, int quantity, String season,
			int shelflocation, long weight, int id);
	
	//new
	@Modifying
	@Transactional
	@Query("delete products p where p.id = ?1")
	void deleteProduct(int id);
	
}
