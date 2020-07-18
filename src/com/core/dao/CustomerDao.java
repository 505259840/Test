package com.core.dao;

import java.util.List;

import com.core.pojo.Customer;

public interface CustomerDao {
	
	/*
	 * 全部客户的结果集
	 */
	public List<Customer> CustomerList(Customer customer);
	
	/*
	 * 全部客户客户的数量
	 */
    public Integer CustomerCount(Customer customer);
    
    /*
     * 增删查改
     * */
    public void updateCustomerById(Customer customer);
    public void deleteCustomerById(Integer id);
    public void insertCustomer(Customer customer);
    
    /*通过id查找用户*/
	public Customer selectCustomerById(Integer id);
}
