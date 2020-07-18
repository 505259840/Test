package com.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.core.dao.CustomerDao;
import com.core.pojo.Customer;
import com.core.service.CustomerService;
import com.core.utils.Page;



@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
   
	/*
	 * @AutoWired±¨´í
	 */	
   private static ApplicationContext ac;
   private static CustomerDao customerDao;
    static {
    	ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    	customerDao = ac.getBean(CustomerDao.class);
    }
    
  
	@Override
	public Page<Customer> CustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		
		Customer customer = new Customer();
		
		if(StringUtils.isNoneBlank(custName))
		{
			customer.setCust_name(custName);
		}
		if(StringUtils.isNoneBlank(custSource))
		{
			customer.setCust_source(custSource);
		}
		if(StringUtils.isNoneBlank(custIndustry))
		{
			customer.setCust_industry(custIndustry);
		}
		if(StringUtils.isNoneBlank(custLevel))
		{
			customer.setCust_level(custLevel);
		}
		
		customer.setStart((page-1)*rows);
		customer.setRows(rows);
		
		
		List<Customer> customers = customerDao.CustomerList(customer);
		
		
		Integer count = customerDao.CustomerCount(customer);
		
		Page<Customer> result = new Page<>();
		
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
//	public static void main(String[] args) {
//		
//		CustomerDao c = ac.getBean(CustomerDao.class);
//		Customer customer = new Customer();
//		customer.setCust_name("ÂíÔÆ");
//		List<Customer> customers = c.CustomerList(customer);
//		
//		for(Customer i:customers)
//		{
//			System.out.println(i.getCust_id());
//		}
//	}


	@Override
	public void updateCustomerById(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomerById(customer);
	}


	@Override
	public void deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomerById(id);
	}


	@Override
	public void insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.insertCustomer(customer);
	}


	@Override
	public Customer selectCustomerById(Integer id) {
		
		return customerDao.selectCustomerById(id);
	}
	
	
}
