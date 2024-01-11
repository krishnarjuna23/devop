package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name="customer_table")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "customername")
	private String customername;
	

	public Customer() {
		
	}

	public Customer( String customername) {
		this.customername = customername;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	
}
