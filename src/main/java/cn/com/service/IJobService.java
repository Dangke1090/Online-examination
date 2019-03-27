package cn.com.service;

import java.util.List;

import cn.com.Entity.Job;

public interface IJobService {
	
	void insert(Job job);
	void delete();
	List<Job> getDataes();
}
