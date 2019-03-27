package cn.com.service;

import java.util.List;

import cn.com.Entity.Professional;



public interface IProfessionalService {
	
	void insert(Professional professional);
	
	List<Professional> getDataes();
	
	void delete();
}
