package com.bullseye.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String email;
	String phone;
	String submittedTo;
	String date;
	String message;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubmittedTo() {
		return submittedTo;
	}
	public void setSubmittedTo(String submittedTo) {
		this.submittedTo = submittedTo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Report [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", submittedTo="
				+ submittedTo + ", date=" + date + ", message=" + message + "]";
	}
	public Report(int id, String name, String email, String phone, String submittedTo, String date, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.submittedTo = submittedTo;
		this.date = date;
		this.message = message;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
