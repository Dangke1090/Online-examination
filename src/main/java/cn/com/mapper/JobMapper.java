package cn.com.mapper;



import java.util.List;

import cn.com.Entity.Job;

public interface JobMapper {
	
	Integer insert(Job job);
	List<Job> getDataes();
	Integer delete();
}
