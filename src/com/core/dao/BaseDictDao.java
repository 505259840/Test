package com.core.dao;

import java.util.List;

import com.core.pojo.BaseDict;

public interface BaseDictDao {
	
	/*
	 * �����������ѯ
	 */
	public List<BaseDict> selectBaseDictByTypeCode(String type);

}
