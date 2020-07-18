package com.core.service.impl;



import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.dao.UserDao;
import com.core.pojo.User;
import com.core.service.UserService;

/*
 *   用户service实现接口类
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

 //	@Autowired(required = false)
//	private UserDao userDao;
	
	private static ApplicationContext ac;
	
	static
	{
		ac= new ClassPathXmlApplicationContext("applicationContext.xml");
	}
		
	@Override
	public User findUser(String usercode, String password) {
		
		UserDao userDao = ac.getBean(UserDao.class);		
		User user = userDao.findUser(usercode, password);		
		return user;
	}

}
