package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name="address_table")
public class Address {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "personname")
	private String personname;
	
	
	
	// constructors
	
	public Address() {
		
	}

	public Address(String address, String personname) {
		super();
		this.address = address;
		this.personname = personname;
	}

	
	//gettter and setters

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPersonname() {
		return personname;
	}


	public void setPersonname(String personname) {
		this.personname = personname;
	}


	
}
