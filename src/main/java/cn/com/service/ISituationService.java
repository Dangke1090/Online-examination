package cn.com.service;

import java.util.List;

import cn.com.Entity.Situation;

public interface ISituationService {
	void insert(Situation situation);
	List<Situation> getDataes();
	void delete();
}
