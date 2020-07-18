package com.core.dao;

import java.util.List;

import com.core.pojo.BaseDict;

public interface BaseDictDao {
	
	/*
	 * 根据类别代码查询
	 */
	public List<BaseDict> selectBaseDictByTypeCode(String type);

}
