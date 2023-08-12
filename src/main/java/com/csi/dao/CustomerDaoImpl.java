package com.csi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Customer;
import com.csi.repository.CustomerRepo;

@Component
public class CustomerDaoImpl {
	@Autowired
	CustomerRepo customerRepoImpl;

	public List<Customer> getAllData() {
		// TODO Auto-generated method stub
		return customerRepoImpl.findAll();
	}

	public Customer saveData(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepoImpl.save(customer);
	}

	public Customer updateData(int custId, Customer customer) {
		// TODO Auto-generated method stub
		Customer cust = customerRepoImpl.getOne(custId);
		/*Customer cust = customerRepoImpl.getById(custId);*/
		cust.setCustName(customer.getCustName());
		cust.setCustContactNumber(customer.getCustContactNumber());
		return customerRepoImpl.save(cust);
	}

	public void deleteDataById(int custId) {
		// TODO Auto-generated method stub
		customerRepoImpl.deleteById(custId);
	}
}
