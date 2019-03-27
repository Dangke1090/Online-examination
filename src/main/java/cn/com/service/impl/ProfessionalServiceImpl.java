package cn.com.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.com.Entity.Job;
import cn.com.Entity.Professional;
import cn.com.mapper.JobMapper;
import cn.com.mapper.ProfessionalMapper;
import cn.com.service.IJobService;
import cn.com.service.IProfessionalService;

@Service("professionalService")
public class ProfessionalServiceImpl implements IProfessionalService{
	@Autowired
	private ProfessionalMapper professionalMapper;
	

	public void insert(Professional professional) {
		professionalMapper.insert(professional);
	}


	public List<Professional> getDataes() {
		return professionalMapper.getDataes();
	}


	
	public void delete() {
		professionalMapper.delete();
		
	}
}
