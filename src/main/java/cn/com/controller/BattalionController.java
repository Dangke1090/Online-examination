package cn.com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.Entity.Battalion;
import cn.com.Entity.Commander;
import cn.com.Entity.Platoon;
import cn.com.Entity.ResponseResult;
import cn.com.service.IBattalionService;


@Controller
@RequestMapping("/battalion")
public class BattalionController {
	@Autowired
	private IBattalionService battalionservice;
	@RequestMapping("/battalionname")
	@ResponseBody
	public ResponseResult<Void> Insert(
			@RequestParam("battalionname")String battalionname,
			@RequestParam("commandername")String commandername,
			HttpSession session,
			@RequestParam("platoonname")String platoonname
			){
		Battalion result=battalionservice.getByname(battalionname);
		Battalion battalion=new Battalion(battalionname);
		if(result==null) {		
			battalionservice.insert(battalion);	
			session.setAttribute("battalionid",battalion.getBattalionid());
			System.out.println("battalionid="+battalion.getBattalionid());
		}else {
			session.setAttribute("battalionid", result.getBattalionid());
		}
			Commander result1=battalionservice.getCommanderByname(commandername);
		if(result1==null) {
			Integer battalionid1=(Integer) session.getAttribute("battalionid");
			Commander commander=new Commander(battalionid1, commandername);
			battalionservice.commanderinsert(commander);
			session.setAttribute("commanderid", commander.getCommanderid());
		}else {
			session.setAttribute("commanderid", result1.getBattalionid());
		}
		Platoon result2=battalionservice.getPlatoonByname(platoonname);
		Integer com1=(Integer) session.getAttribute("commanderid");
		if(result2==null) {
			Platoon platoon=new Platoon(platoonname,com1);
			battalionservice.platooninsert(platoon);
		}
		return new ResponseResult<Void>();
	}
	@RequestMapping(value="/all")
	@ResponseBody
	public ResponseResult<List<Battalion>> getDataes(){
		ResponseResult<List<Battalion>> rr = new ResponseResult<List<Battalion>>();
		rr.setData(battalionservice.getDataes());
		return rr ;
	}
	@RequestMapping(value="/all1")
	@ResponseBody
	public ResponseResult<List<Commander>> getCommanderDataes(){
		ResponseResult<List<Commander>> rr = new ResponseResult<List<Commander>>();
		rr.setData(battalionservice.getCommanderDataes());
		return rr ;
	}
	@RequestMapping(value="/all2")
	@ResponseBody
	public ResponseResult<List<Platoon>> getPlatoonDataes(){
		ResponseResult<List<Platoon>> rr = new ResponseResult<List<Platoon>>();
		rr.setData(battalionservice.getPlatoonDataes());
		return rr ;
	}
}
