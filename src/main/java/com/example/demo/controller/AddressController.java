package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AddressRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.model.Customer;

@RestController
public class AddressController {
	
	@Autowired 
	AddressRepository arepo;
	
	@Autowired
	CustomerRepository crepo;
	
	 @PostMapping("/addcustomer")
	    public ResponseEntity<Customer> addTheAddress(@RequestBody Customer customer){
	      Customer newcustoomer = crepo.save(customer);
	        return new ResponseEntity<Customer>(newcustoomer, HttpStatus.CREATED);
	        
	    }
}



//@PostMapping("/addaddress")
//public ResponseEntity<Address> addTheAddress()  {
//	
//  Address newAddress = ad.saveobj(new Address("addressfield" , "personfeild"));
//  return new ResponseEntity<Address>(newAddress, HttpStatus.CREATED);
//  
//} 
//
//@GetMapping("/getalladdress")
//public ResponseEntity<List<Address>> getAllAddress()  {
//	
//  return new ResponseEntity<List<Address>>(ad.alladdress(),HttpStatus.ACCEPTED);
//} 

// customer related operations
