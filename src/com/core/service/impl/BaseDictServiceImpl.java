package com.core.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.core.dao.BaseDictDao;
import com.core.pojo.BaseDict;
import com.core.service.BaseDictService;

@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {
    
	private static ApplicationContext ac;
	
    static {
    	ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
  
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String code) {
		
		
		BaseDictDao bdd = ac.getBean(BaseDictDao.class);				
		return bdd.selectBaseDictByTypeCode(code);
	}
//    public static void main(String[] args) {
//    	BaseDictDao bdd = ac.getBean(BaseDictDao.class);
//		List<BaseDict> list = bdd.selectBaseDictByTypeCode("001");
//		for (BaseDict i:list) {
//			System.out.println(i.getDict_type_name());
//		}
//	}

}
