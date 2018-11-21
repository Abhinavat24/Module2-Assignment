package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.dto.Customer;
import com.cg.exception.InvalidInputException;

public class Repository {
	private Map<String, Customer> data; 
	private Map<String,ArrayList<String>> trans;
	
	
	
	public Repository(){
		data = new HashMap<String, Customer>();
	}

	public Repository(Map<String, Customer> data) 	{
		super();
		this.data = data;
	}
	
	public boolean save(Customer customer) {
		data.put(customer.getMobileNo(), customer);
		return true;
	}

	public Customer findOne(String mobileNo) {
		if(data.containsKey(mobileNo)){
			Customer customer=data.get(mobileNo);
			return customer;
		}
		else
			throw new InvalidInputException("Mobile number does not exist");
		}

	public Map<String, ArrayList<String>> getTrans() {
		return trans;
	}

	public void setTrans(Map<String, ArrayList<String>> trans) {
		this.trans = trans;
	}
	
}
