package com.core.dao;

import org.apache.ibatis.annotations.Param;

import com.core.pojo.User;

public interface UserDao {
	
	public User findUser(@Param("usercode") String usercode,@Param("password") String password);

}
