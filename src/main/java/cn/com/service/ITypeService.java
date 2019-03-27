package cn.com.service;

import java.util.List;


import cn.com.Entity.Type;

public interface ITypeService {
	
	void insert(Type type);
	void delete();
	List<Type> getDataes();
}
