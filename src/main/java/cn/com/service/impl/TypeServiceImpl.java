package cn.com.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.com.Entity.Job;
import cn.com.Entity.Type;
import cn.com.mapper.JobMapper;
import cn.com.mapper.TypeMapper;
import cn.com.service.IJobService;
import cn.com.service.ITypeService;

@Service("typeService")
public class TypeServiceImpl implements ITypeService{
	@Autowired
	private TypeMapper typemapper;
	
	public void insert(Type type) {
		typemapper.insert(type);
	}

	public List<Type> getDataes() {
		return typemapper.getDataes();
	}

	@Override
	public void delete() {
		typemapper.delete();
	}

}
