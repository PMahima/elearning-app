package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@GetMapping("/customers")
	public List<Customer> getAllData() {
		return customerServiceImpl.getAllData();
	}

	@PostMapping("/customers")
	public Customer saveData(@RequestBody Customer customer) {
		return customerServiceImpl.saveData(customer);
	}

	@PutMapping("/customers/{custId}")
	public Customer updateData(@PathVariable int custId, @RequestBody Customer customer) {
		return customerServiceImpl.updateData(custId, customer);
	}

	@DeleteMapping("/customers/{custId}")
	public String deleteDataById(@PathVariable int custId) {
		customerServiceImpl.deleteDataById(custId);
		return "Data deleted successfuly";
	}

}
