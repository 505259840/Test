package com.core.service;

import java.util.List;

import com.core.pojo.BaseDict;

public interface BaseDictService {
	
	public List<BaseDict> findBaseDictByTypeCode(String code);

}
