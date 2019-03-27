package cn.com.mapper;



import java.util.List;

import cn.com.Entity.Professional;

public interface ProfessionalMapper {

	Integer insert(Professional professional);
	
	List<Professional> getDataes();
	Integer delete();
}
