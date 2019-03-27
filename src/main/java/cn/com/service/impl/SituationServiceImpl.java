package cn.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.Entity.Situation;
import cn.com.mapper.SituationMapper;
import cn.com.service.ISituationService;
@Service("situationService")
public class SituationServiceImpl implements ISituationService{

	@Autowired
	private SituationMapper situationMapper;
	public void insert(Situation situation) {
		situationMapper.insert(situation);
	}
	
	public List<Situation> getDataes() {
		
		return situationMapper.getDataes();
	}
	
	public void delete() {
		situationMapper.delete();
	}
	
}
