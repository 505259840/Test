package com.core.service;



import com.core.pojo.User;


public interface UserService {
	
	public User findUser(String usercode,String password);

}
