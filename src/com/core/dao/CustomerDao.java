package com.core.dao;

import java.util.List;

import com.core.pojo.Customer;

public interface CustomerDao {
	
	/*
	 * ȫ���ͻ��Ľ����
	 */
	public List<Customer> CustomerList(Customer customer);
	
	/*
	 * ȫ���ͻ��ͻ�������
	 */
    public Integer CustomerCount(Customer customer);
    
    /*
     * ��ɾ���
     * */
    public void updateCustomerById(Customer customer);
    public void deleteCustomerById(Integer id);
    public void insertCustomer(Customer customer);
    
    /*ͨ��id�����û�*/
	public Customer selectCustomerById(Integer id);
}