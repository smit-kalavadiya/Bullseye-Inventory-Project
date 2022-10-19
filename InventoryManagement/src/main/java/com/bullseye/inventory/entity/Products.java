package com.bullseye.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@Table(name="products")
@Entity(name="products")
public class Products {
	
	@Id
	@GeneratedValue
	int id;
	int quantity;
	long cost;
	String name;
	String season;
	String description;
	long weight;
	int shelflocation;
	String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public int getShelflocation() {
		return shelflocation;
	}
	public void setShelflocation(int shelflocation) {
		this.shelflocation = shelflocation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Products(int id, int quantity, long cost, String name, String season, String description, long weight,
			int shelflocation, String image) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.cost = cost;
		this.name = name;
		this.season = season;
		this.description = description;
		this.weight = weight;
		this.shelflocation = shelflocation;
		this.image = image;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", quantity=" + quantity + ", cost=" + cost + ", name=" + name + ", season="
				+ season + ", description=" + description + ", weight=" + weight + ", shelflocation=" + shelflocation
				+ ", image=" + image + "]";
	}
}
