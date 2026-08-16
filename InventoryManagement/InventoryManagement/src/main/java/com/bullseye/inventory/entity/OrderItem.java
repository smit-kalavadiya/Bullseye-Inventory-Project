package com.bullseye.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String description;
	int quantity;
	long price;
	long tax;
	String dimension;
	String weight;
	int orderid;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	String season;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public OrderItem(int id, String name, String description, int quantity, long price, long tax, String dimension,
			String weight, int orderid, String season) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.tax = tax;
		this.dimension = dimension;
		this.weight = weight;
		this.orderid = orderid;
		this.season = season;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", tax=" + tax + ", dimension=" + dimension + ", weight=" + weight + ", orderid="
				+ orderid + ", season=" + season + "]";
	}
	
}
