package cn.com.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.com.Entity.Job;
import cn.com.mapper.JobMapper;
import cn.com.service.IJobService;

@Service("jobService")
public class JobServiceImpl implements IJobService{
	@Autowired
	private JobMapper jobmapper;
	
	public void insert(Job job) {
		jobmapper.insert(job);
	}

	public List<Job> getDataes() {
		return jobmapper.getDataes();
	}

	@Override
	public void delete() {
		jobmapper.delete();
	}

}
