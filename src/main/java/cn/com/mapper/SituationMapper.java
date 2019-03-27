package cn.com.mapper;

import java.util.List;

import cn.com.Entity.Situation;


public interface SituationMapper {
	Integer insert(Situation situation);
	List<Situation> getDataes();
	Integer delete();
}
