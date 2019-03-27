package cn.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.Entity.Battalion;
import cn.com.Entity.Commander;
import cn.com.Entity.Platoon;
import cn.com.mapper.BattalionMapper;
import cn.com.service.IBattalionService;
@Service("battalionService")
public class BattalionServiceImpl implements IBattalionService {

	@Autowired
	private BattalionMapper battalionmapper;
	public void insert(Battalion battalion) {
		 battalionmapper.insert(battalion);
	}
	
	public List<Battalion> getDataes() {
		
		return battalionmapper.getDataes();
	}

	
	public Battalion getByname(String battalionname) {
		
		return battalionmapper.getByname(battalionname);
	}

	
	public void commanderinsert(Commander commander) {
		 battalionmapper.commanderinsert(commander);
	}

	
	public void platooninsert(Platoon platoon) {
		battalionmapper.platooninsert(platoon);
	}


	public Commander getCommanderByname(String commandername) {
		
		return battalionmapper.getCommanderByname(commandername);
	}


	public Platoon getPlatoonByname(String platoonname) {
		
		return battalionmapper.getPlatoonByname(platoonname);
	}

	@Override
	public List<Commander> getCommanderDataes() {
		
		return battalionmapper.getCommanderDataes();
	}

	@Override
	public List<Platoon> getPlatoonDataes() {
		
		return battalionmapper.getPlatoonDataes();
	}



}
