package cn.com.mapper;

import java.util.List;

import cn.com.Entity.Battalion;
import cn.com.Entity.Commander;
import cn.com.Entity.Platoon;

public interface BattalionMapper {
	/* 插入营长信息*/
	Integer insert(Battalion battalion);
	
	/*读取营长信息*/
	List<Battalion> getDataes();
	
	/*通过名字获取信息*/
	Battalion getByname(String battalionname);
	/*插入连长信息*/
	Integer commanderinsert(Commander commander);
	
	Commander getCommanderByname(String commandername);
	/*插入排长信息*/
	Integer platooninsert(Platoon platoon);
	
	Platoon getPlatoonByname(String platoonname);
	List<Commander> getCommanderDataes();
	List<Platoon> getPlatoonDataes();
}
