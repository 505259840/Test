package com.core.service;

import com.core.pojo.Customer;
import com.core.utils.Page;


public interface CustomerService {
	
	/*
	 * 全部客户
	 */
	public Page<Customer> CustomerList(Integer page, Integer rows, 
			String custName ,String custSource, 
			String custlndustry,String custLevel);
	
	 /*
     * 增删查改
     * */
    public void updateCustomerById(Customer customer);
    public void deleteCustomerById(Integer id);
    public void insertCustomer(Customer customer);

	public Customer selectCustomerById(Integer id);

}
