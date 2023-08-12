package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;

@Service
public class CustomerServiceImpl {
	@Autowired
	CustomerDaoImpl customerDaoImpl;

	public List<Customer> getAllData() {
		// TODO Auto-generated method stub
		return customerDaoImpl.getAllData();
	}

	public Customer saveData(Customer customer) {
		// TODO Auto-generated method stub
		return customerDaoImpl.saveData(customer);
	}

	public Customer updateData(int custId, Customer customer) {
		// TODO Auto-generated method stub
		return customerDaoImpl.updateData(custId, customer);
	}

	public void deleteDataById(int custId) {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteDataById(custId);
	}
}
