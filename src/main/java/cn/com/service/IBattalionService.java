package cn.com.service;

import java.util.List;

import cn.com.Entity.Battalion;
import cn.com.Entity.Commander;
import cn.com.Entity.Platoon;


public interface IBattalionService {
	void insert(Battalion battalion);
	
	List<Battalion> getDataes();
	
	Battalion getByname(String battalionname);
	
	void commanderinsert(Commander commander);
	
	Commander getCommanderByname(String commandername);
	
	void platooninsert(Platoon platoon);
	
	Platoon getPlatoonByname(String platoonname );
	List<Commander> getCommanderDataes();
	List<Platoon> getPlatoonDataes();
}
