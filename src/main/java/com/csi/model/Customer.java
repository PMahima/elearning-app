package com.csi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
/*
 * @getter and setter used because we are not using toString method if toString
 * method is used then write @Data
 */
public class Customer {
	@Id
	@GeneratedValue
	private int custId;
	private String custName;
	private long custContactNumber;

}
