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
	
	
}
