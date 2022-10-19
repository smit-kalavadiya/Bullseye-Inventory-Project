package com.bullseye.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
@DynamicUpdate
@Table(name="orders")
@Entity(name="orders")
public class Orders{

	@Id
	@GeneratedValue
	int id;
	String type;
	String date;
	String address;
	String status;
	String orderby;
	long subtotal;
	long shipping;
	long tax;
	long grandtotal;
	String title;
	
	public String getOrderby() {
		return orderby;
	}
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public long getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}
	public long getShipping() {
		return shipping;
	}
	public void setShipping(long shipping) {
		this.shipping = shipping;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public long getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(long grandtotal) {
		this.grandtotal = grandtotal;
	}
	public Orders(int id, String type, String date, String address, String status, String orderby, long subtotal,
			long shipping, long tax, long grandtotal, String title) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.address = address;
		this.status = status;
		this.orderby = orderby;
		this.subtotal = subtotal;
		this.shipping = shipping;
		this.tax = tax;
		this.grandtotal = grandtotal;
		this.title = title;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
