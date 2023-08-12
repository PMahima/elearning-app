package com.csi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csi.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
